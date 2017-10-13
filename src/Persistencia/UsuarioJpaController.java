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
import Modelo.Devolucion;
import Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import Modelo.Venta;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Daniel
 */
public class UsuarioJpaController implements Serializable {

    public UsuarioJpaController() {
        this.emf = Persistence.createEntityManagerFactory("EvolucionShop1.0PU");    
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Usuario usuario) throws PreexistingEntityException, Exception {
        if (usuario.getDevolucionList() == null) {
            usuario.setDevolucionList(new ArrayList<Devolucion>());
        }
        if (usuario.getVentaList() == null) {
            usuario.setVentaList(new ArrayList<Venta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Devolucion> attachedDevolucionList = new ArrayList<Devolucion>();
            for (Devolucion devolucionListDevolucionToAttach : usuario.getDevolucionList()) {
                devolucionListDevolucionToAttach = em.getReference(devolucionListDevolucionToAttach.getClass(), devolucionListDevolucionToAttach.getIddevolucion());
                attachedDevolucionList.add(devolucionListDevolucionToAttach);
            }
            usuario.setDevolucionList(attachedDevolucionList);
            List<Venta> attachedVentaList = new ArrayList<Venta>();
            for (Venta ventaListVentaToAttach : usuario.getVentaList()) {
                ventaListVentaToAttach = em.getReference(ventaListVentaToAttach.getClass(), ventaListVentaToAttach.getIdventa());
                attachedVentaList.add(ventaListVentaToAttach);
            }
            usuario.setVentaList(attachedVentaList);
            em.persist(usuario);
            for (Devolucion devolucionListDevolucion : usuario.getDevolucionList()) {
                Usuario oldIdentificacionusuarioOfDevolucionListDevolucion = devolucionListDevolucion.getIdentificacionusuario();
                devolucionListDevolucion.setIdentificacionusuario(usuario);
                devolucionListDevolucion = em.merge(devolucionListDevolucion);
                if (oldIdentificacionusuarioOfDevolucionListDevolucion != null) {
                    oldIdentificacionusuarioOfDevolucionListDevolucion.getDevolucionList().remove(devolucionListDevolucion);
                    oldIdentificacionusuarioOfDevolucionListDevolucion = em.merge(oldIdentificacionusuarioOfDevolucionListDevolucion);
                }
            }
            for (Venta ventaListVenta : usuario.getVentaList()) {
                Usuario oldIdentificacionusuarioOfVentaListVenta = ventaListVenta.getIdentificacionusuario();
                ventaListVenta.setIdentificacionusuario(usuario);
                ventaListVenta = em.merge(ventaListVenta);
                if (oldIdentificacionusuarioOfVentaListVenta != null) {
                    oldIdentificacionusuarioOfVentaListVenta.getVentaList().remove(ventaListVenta);
                    oldIdentificacionusuarioOfVentaListVenta = em.merge(oldIdentificacionusuarioOfVentaListVenta);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findUsuario(usuario.getIdentificacionusuario()) != null) {
                throw new PreexistingEntityException("Usuario " + usuario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Usuario usuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario persistentUsuario = em.find(Usuario.class, usuario.getIdentificacionusuario());
            List<Devolucion> devolucionListOld = persistentUsuario.getDevolucionList();
            List<Devolucion> devolucionListNew = usuario.getDevolucionList();
            List<Venta> ventaListOld = persistentUsuario.getVentaList();
            List<Venta> ventaListNew = usuario.getVentaList();
            List<Devolucion> attachedDevolucionListNew = new ArrayList<Devolucion>();
            for (Devolucion devolucionListNewDevolucionToAttach : devolucionListNew) {
                devolucionListNewDevolucionToAttach = em.getReference(devolucionListNewDevolucionToAttach.getClass(), devolucionListNewDevolucionToAttach.getIddevolucion());
                attachedDevolucionListNew.add(devolucionListNewDevolucionToAttach);
            }
            devolucionListNew = attachedDevolucionListNew;
            usuario.setDevolucionList(devolucionListNew);
            List<Venta> attachedVentaListNew = new ArrayList<Venta>();
            for (Venta ventaListNewVentaToAttach : ventaListNew) {
                ventaListNewVentaToAttach = em.getReference(ventaListNewVentaToAttach.getClass(), ventaListNewVentaToAttach.getIdventa());
                attachedVentaListNew.add(ventaListNewVentaToAttach);
            }
            ventaListNew = attachedVentaListNew;
            usuario.setVentaList(ventaListNew);
            usuario = em.merge(usuario);
            for (Devolucion devolucionListOldDevolucion : devolucionListOld) {
                if (!devolucionListNew.contains(devolucionListOldDevolucion)) {
                    devolucionListOldDevolucion.setIdentificacionusuario(null);
                    devolucionListOldDevolucion = em.merge(devolucionListOldDevolucion);
                }
            }
            for (Devolucion devolucionListNewDevolucion : devolucionListNew) {
                if (!devolucionListOld.contains(devolucionListNewDevolucion)) {
                    Usuario oldIdentificacionusuarioOfDevolucionListNewDevolucion = devolucionListNewDevolucion.getIdentificacionusuario();
                    devolucionListNewDevolucion.setIdentificacionusuario(usuario);
                    devolucionListNewDevolucion = em.merge(devolucionListNewDevolucion);
                    if (oldIdentificacionusuarioOfDevolucionListNewDevolucion != null && !oldIdentificacionusuarioOfDevolucionListNewDevolucion.equals(usuario)) {
                        oldIdentificacionusuarioOfDevolucionListNewDevolucion.getDevolucionList().remove(devolucionListNewDevolucion);
                        oldIdentificacionusuarioOfDevolucionListNewDevolucion = em.merge(oldIdentificacionusuarioOfDevolucionListNewDevolucion);
                    }
                }
            }
            for (Venta ventaListOldVenta : ventaListOld) {
                if (!ventaListNew.contains(ventaListOldVenta)) {
                    ventaListOldVenta.setIdentificacionusuario(null);
                    ventaListOldVenta = em.merge(ventaListOldVenta);
                }
            }
            for (Venta ventaListNewVenta : ventaListNew) {
                if (!ventaListOld.contains(ventaListNewVenta)) {
                    Usuario oldIdentificacionusuarioOfVentaListNewVenta = ventaListNewVenta.getIdentificacionusuario();
                    ventaListNewVenta.setIdentificacionusuario(usuario);
                    ventaListNewVenta = em.merge(ventaListNewVenta);
                    if (oldIdentificacionusuarioOfVentaListNewVenta != null && !oldIdentificacionusuarioOfVentaListNewVenta.equals(usuario)) {
                        oldIdentificacionusuarioOfVentaListNewVenta.getVentaList().remove(ventaListNewVenta);
                        oldIdentificacionusuarioOfVentaListNewVenta = em.merge(oldIdentificacionusuarioOfVentaListNewVenta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = usuario.getIdentificacionusuario();
                if (findUsuario(id) == null) {
                    throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario usuario;
            try {
                usuario = em.getReference(Usuario.class, id);
                usuario.getIdentificacionusuario();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.", enfe);
            }
            List<Devolucion> devolucionList = usuario.getDevolucionList();
            for (Devolucion devolucionListDevolucion : devolucionList) {
                devolucionListDevolucion.setIdentificacionusuario(null);
                devolucionListDevolucion = em.merge(devolucionListDevolucion);
            }
            List<Venta> ventaList = usuario.getVentaList();
            for (Venta ventaListVenta : ventaList) {
                ventaListVenta.setIdentificacionusuario(null);
                ventaListVenta = em.merge(ventaListVenta);
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Usuario> findUsuarioEntities() {
        return findUsuarioEntities(true, -1, -1);
    }

    public List<Usuario> findUsuarioEntities(int maxResults, int firstResult) {
        return findUsuarioEntities(false, maxResults, firstResult);
    }

    private List<Usuario> findUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario.class));
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

    public Usuario findUsuario(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            em.close();
        }
    }

    public int getUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Usuario> rt = cq.from(Usuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
