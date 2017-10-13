/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.Cliente;
import Modelo.Usuario;
import Modelo.Devolucion;
import Modelo.Venta;
import java.util.ArrayList;
import java.util.List;
import Modelo.Ventaproducto;
import Persistencia.exceptions.IllegalOrphanException;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Daniel
 */
public class VentaJpaController implements Serializable {

    public VentaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("EvolucionShop1.0PU");    
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Venta venta) throws PreexistingEntityException, Exception {
        if (venta.getDevolucionList() == null) {
            venta.setDevolucionList(new ArrayList<Devolucion>());
        }
        if (venta.getVentaproductoList() == null) {
            venta.setVentaproductoList(new ArrayList<Ventaproducto>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente identificacioncliente = venta.getIdentificacioncliente();
            if (identificacioncliente != null) {
                identificacioncliente = em.getReference(identificacioncliente.getClass(), identificacioncliente.getIdentificacioncliente());
                venta.setIdentificacioncliente(identificacioncliente);
            }
            Usuario identificacionusuario = venta.getIdentificacionusuario();
            if (identificacionusuario != null) {
                identificacionusuario = em.getReference(identificacionusuario.getClass(), identificacionusuario.getIdentificacionusuario());
                venta.setIdentificacionusuario(identificacionusuario);
            }
            List<Devolucion> attachedDevolucionList = new ArrayList<Devolucion>();
            for (Devolucion devolucionListDevolucionToAttach : venta.getDevolucionList()) {
                devolucionListDevolucionToAttach = em.getReference(devolucionListDevolucionToAttach.getClass(), devolucionListDevolucionToAttach.getIddevolucion());
                attachedDevolucionList.add(devolucionListDevolucionToAttach);
            }
            venta.setDevolucionList(attachedDevolucionList);
            List<Ventaproducto> attachedVentaproductoList = new ArrayList<Ventaproducto>();
            for (Ventaproducto ventaproductoListVentaproductoToAttach : venta.getVentaproductoList()) {
                ventaproductoListVentaproductoToAttach = em.getReference(ventaproductoListVentaproductoToAttach.getClass(), ventaproductoListVentaproductoToAttach.getVentaproductoPK());
                attachedVentaproductoList.add(ventaproductoListVentaproductoToAttach);
            }
            venta.setVentaproductoList(attachedVentaproductoList);
            em.persist(venta);
            if (identificacioncliente != null) {
                identificacioncliente.getVentaList().add(venta);
                identificacioncliente = em.merge(identificacioncliente);
            }
            if (identificacionusuario != null) {
                identificacionusuario.getVentaList().add(venta);
                identificacionusuario = em.merge(identificacionusuario);
            }
            for (Devolucion devolucionListDevolucion : venta.getDevolucionList()) {
                Venta oldIdventaOfDevolucionListDevolucion = devolucionListDevolucion.getIdventa();
                devolucionListDevolucion.setIdventa(venta);
                devolucionListDevolucion = em.merge(devolucionListDevolucion);
                if (oldIdventaOfDevolucionListDevolucion != null) {
                    oldIdventaOfDevolucionListDevolucion.getDevolucionList().remove(devolucionListDevolucion);
                    oldIdventaOfDevolucionListDevolucion = em.merge(oldIdventaOfDevolucionListDevolucion);
                }
            }
            for (Ventaproducto ventaproductoListVentaproducto : venta.getVentaproductoList()) {
                Venta oldVentaOfVentaproductoListVentaproducto = ventaproductoListVentaproducto.getVenta();
                ventaproductoListVentaproducto.setVenta(venta);
                ventaproductoListVentaproducto = em.merge(ventaproductoListVentaproducto);
                if (oldVentaOfVentaproductoListVentaproducto != null) {
                    oldVentaOfVentaproductoListVentaproducto.getVentaproductoList().remove(ventaproductoListVentaproducto);
                    oldVentaOfVentaproductoListVentaproducto = em.merge(oldVentaOfVentaproductoListVentaproducto);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findVenta(venta.getIdventa()) != null) {
                throw new PreexistingEntityException("Venta " + venta + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Venta venta) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Venta persistentVenta = em.find(Venta.class, venta.getIdventa());
            Cliente identificacionclienteOld = persistentVenta.getIdentificacioncliente();
            Cliente identificacionclienteNew = venta.getIdentificacioncliente();
            Usuario identificacionusuarioOld = persistentVenta.getIdentificacionusuario();
            Usuario identificacionusuarioNew = venta.getIdentificacionusuario();
            List<Devolucion> devolucionListOld = persistentVenta.getDevolucionList();
            List<Devolucion> devolucionListNew = venta.getDevolucionList();
            List<Ventaproducto> ventaproductoListOld = persistentVenta.getVentaproductoList();
            List<Ventaproducto> ventaproductoListNew = venta.getVentaproductoList();
            List<String> illegalOrphanMessages = null;
            for (Ventaproducto ventaproductoListOldVentaproducto : ventaproductoListOld) {
                if (!ventaproductoListNew.contains(ventaproductoListOldVentaproducto)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Ventaproducto " + ventaproductoListOldVentaproducto + " since its venta field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            if (identificacionclienteNew != null) {
                identificacionclienteNew = em.getReference(identificacionclienteNew.getClass(), identificacionclienteNew.getIdentificacioncliente());
                venta.setIdentificacioncliente(identificacionclienteNew);
            }
            if (identificacionusuarioNew != null) {
                identificacionusuarioNew = em.getReference(identificacionusuarioNew.getClass(), identificacionusuarioNew.getIdentificacionusuario());
                venta.setIdentificacionusuario(identificacionusuarioNew);
            }
            List<Devolucion> attachedDevolucionListNew = new ArrayList<Devolucion>();
            for (Devolucion devolucionListNewDevolucionToAttach : devolucionListNew) {
                devolucionListNewDevolucionToAttach = em.getReference(devolucionListNewDevolucionToAttach.getClass(), devolucionListNewDevolucionToAttach.getIddevolucion());
                attachedDevolucionListNew.add(devolucionListNewDevolucionToAttach);
            }
            devolucionListNew = attachedDevolucionListNew;
            venta.setDevolucionList(devolucionListNew);
            List<Ventaproducto> attachedVentaproductoListNew = new ArrayList<Ventaproducto>();
            for (Ventaproducto ventaproductoListNewVentaproductoToAttach : ventaproductoListNew) {
                ventaproductoListNewVentaproductoToAttach = em.getReference(ventaproductoListNewVentaproductoToAttach.getClass(), ventaproductoListNewVentaproductoToAttach.getVentaproductoPK());
                attachedVentaproductoListNew.add(ventaproductoListNewVentaproductoToAttach);
            }
            ventaproductoListNew = attachedVentaproductoListNew;
            venta.setVentaproductoList(ventaproductoListNew);
            venta = em.merge(venta);
            if (identificacionclienteOld != null && !identificacionclienteOld.equals(identificacionclienteNew)) {
                identificacionclienteOld.getVentaList().remove(venta);
                identificacionclienteOld = em.merge(identificacionclienteOld);
            }
            if (identificacionclienteNew != null && !identificacionclienteNew.equals(identificacionclienteOld)) {
                identificacionclienteNew.getVentaList().add(venta);
                identificacionclienteNew = em.merge(identificacionclienteNew);
            }
            if (identificacionusuarioOld != null && !identificacionusuarioOld.equals(identificacionusuarioNew)) {
                identificacionusuarioOld.getVentaList().remove(venta);
                identificacionusuarioOld = em.merge(identificacionusuarioOld);
            }
            if (identificacionusuarioNew != null && !identificacionusuarioNew.equals(identificacionusuarioOld)) {
                identificacionusuarioNew.getVentaList().add(venta);
                identificacionusuarioNew = em.merge(identificacionusuarioNew);
            }
            for (Devolucion devolucionListOldDevolucion : devolucionListOld) {
                if (!devolucionListNew.contains(devolucionListOldDevolucion)) {
                    devolucionListOldDevolucion.setIdventa(null);
                    devolucionListOldDevolucion = em.merge(devolucionListOldDevolucion);
                }
            }
            for (Devolucion devolucionListNewDevolucion : devolucionListNew) {
                if (!devolucionListOld.contains(devolucionListNewDevolucion)) {
                    Venta oldIdventaOfDevolucionListNewDevolucion = devolucionListNewDevolucion.getIdventa();
                    devolucionListNewDevolucion.setIdventa(venta);
                    devolucionListNewDevolucion = em.merge(devolucionListNewDevolucion);
                    if (oldIdventaOfDevolucionListNewDevolucion != null && !oldIdventaOfDevolucionListNewDevolucion.equals(venta)) {
                        oldIdventaOfDevolucionListNewDevolucion.getDevolucionList().remove(devolucionListNewDevolucion);
                        oldIdventaOfDevolucionListNewDevolucion = em.merge(oldIdventaOfDevolucionListNewDevolucion);
                    }
                }
            }
            for (Ventaproducto ventaproductoListNewVentaproducto : ventaproductoListNew) {
                if (!ventaproductoListOld.contains(ventaproductoListNewVentaproducto)) {
                    Venta oldVentaOfVentaproductoListNewVentaproducto = ventaproductoListNewVentaproducto.getVenta();
                    ventaproductoListNewVentaproducto.setVenta(venta);
                    ventaproductoListNewVentaproducto = em.merge(ventaproductoListNewVentaproducto);
                    if (oldVentaOfVentaproductoListNewVentaproducto != null && !oldVentaOfVentaproductoListNewVentaproducto.equals(venta)) {
                        oldVentaOfVentaproductoListNewVentaproducto.getVentaproductoList().remove(ventaproductoListNewVentaproducto);
                        oldVentaOfVentaproductoListNewVentaproducto = em.merge(oldVentaOfVentaproductoListNewVentaproducto);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = venta.getIdventa();
                if (findVenta(id) == null) {
                    throw new NonexistentEntityException("The venta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Venta venta;
            try {
                venta = em.getReference(Venta.class, id);
                venta.getIdventa();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The venta with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Ventaproducto> ventaproductoListOrphanCheck = venta.getVentaproductoList();
            for (Ventaproducto ventaproductoListOrphanCheckVentaproducto : ventaproductoListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Venta (" + venta + ") cannot be destroyed since the Ventaproducto " + ventaproductoListOrphanCheckVentaproducto + " in its ventaproductoList field has a non-nullable venta field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Cliente identificacioncliente = venta.getIdentificacioncliente();
            if (identificacioncliente != null) {
                identificacioncliente.getVentaList().remove(venta);
                identificacioncliente = em.merge(identificacioncliente);
            }
            Usuario identificacionusuario = venta.getIdentificacionusuario();
            if (identificacionusuario != null) {
                identificacionusuario.getVentaList().remove(venta);
                identificacionusuario = em.merge(identificacionusuario);
            }
            List<Devolucion> devolucionList = venta.getDevolucionList();
            for (Devolucion devolucionListDevolucion : devolucionList) {
                devolucionListDevolucion.setIdventa(null);
                devolucionListDevolucion = em.merge(devolucionListDevolucion);
            }
            em.remove(venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Venta> findVentaEntities() {
        return findVentaEntities(true, -1, -1);
    }

    public List<Venta> findVentaEntities(int maxResults, int firstResult) {
        return findVentaEntities(false, maxResults, firstResult);
    }

    private List<Venta> findVentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Venta.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Venta findVenta(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Venta.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Venta> rt = cq.from(Venta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
