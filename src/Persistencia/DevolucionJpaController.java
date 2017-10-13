/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Devolucion;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.Producto;
import Modelo.Usuario;
import Modelo.Venta;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Daniel
 */
public class DevolucionJpaController implements Serializable {

    public DevolucionJpaController() {
        this.emf = Persistence.createEntityManagerFactory("EvolucionShop1.0PU");    
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Devolucion devolucion) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto idproducto = devolucion.getIdproducto();
            if (idproducto != null) {
                idproducto = em.getReference(idproducto.getClass(), idproducto.getIdproducto());
                devolucion.setIdproducto(idproducto);
            }
            Usuario identificacionusuario = devolucion.getIdentificacionusuario();
            if (identificacionusuario != null) {
                identificacionusuario = em.getReference(identificacionusuario.getClass(), identificacionusuario.getIdentificacionusuario());
                devolucion.setIdentificacionusuario(identificacionusuario);
            }
            Venta idventa = devolucion.getIdventa();
            if (idventa != null) {
                idventa = em.getReference(idventa.getClass(), idventa.getIdventa());
                devolucion.setIdventa(idventa);
            }
            em.persist(devolucion);
            if (idproducto != null) {
                idproducto.getDevolucionList().add(devolucion);
                idproducto = em.merge(idproducto);
            }
            if (identificacionusuario != null) {
                identificacionusuario.getDevolucionList().add(devolucion);
                identificacionusuario = em.merge(identificacionusuario);
            }
            if (idventa != null) {
                idventa.getDevolucionList().add(devolucion);
                idventa = em.merge(idventa);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findDevolucion(devolucion.getIddevolucion()) != null) {
                throw new PreexistingEntityException("Devolucion " + devolucion + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Devolucion devolucion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Devolucion persistentDevolucion = em.find(Devolucion.class, devolucion.getIddevolucion());
            Producto idproductoOld = persistentDevolucion.getIdproducto();
            Producto idproductoNew = devolucion.getIdproducto();
            Usuario identificacionusuarioOld = persistentDevolucion.getIdentificacionusuario();
            Usuario identificacionusuarioNew = devolucion.getIdentificacionusuario();
            Venta idventaOld = persistentDevolucion.getIdventa();
            Venta idventaNew = devolucion.getIdventa();
            if (idproductoNew != null) {
                idproductoNew = em.getReference(idproductoNew.getClass(), idproductoNew.getIdproducto());
                devolucion.setIdproducto(idproductoNew);
            }
            if (identificacionusuarioNew != null) {
                identificacionusuarioNew = em.getReference(identificacionusuarioNew.getClass(), identificacionusuarioNew.getIdentificacionusuario());
                devolucion.setIdentificacionusuario(identificacionusuarioNew);
            }
            if (idventaNew != null) {
                idventaNew = em.getReference(idventaNew.getClass(), idventaNew.getIdventa());
                devolucion.setIdventa(idventaNew);
            }
            devolucion = em.merge(devolucion);
            if (idproductoOld != null && !idproductoOld.equals(idproductoNew)) {
                idproductoOld.getDevolucionList().remove(devolucion);
                idproductoOld = em.merge(idproductoOld);
            }
            if (idproductoNew != null && !idproductoNew.equals(idproductoOld)) {
                idproductoNew.getDevolucionList().add(devolucion);
                idproductoNew = em.merge(idproductoNew);
            }
            if (identificacionusuarioOld != null && !identificacionusuarioOld.equals(identificacionusuarioNew)) {
                identificacionusuarioOld.getDevolucionList().remove(devolucion);
                identificacionusuarioOld = em.merge(identificacionusuarioOld);
            }
            if (identificacionusuarioNew != null && !identificacionusuarioNew.equals(identificacionusuarioOld)) {
                identificacionusuarioNew.getDevolucionList().add(devolucion);
                identificacionusuarioNew = em.merge(identificacionusuarioNew);
            }
            if (idventaOld != null && !idventaOld.equals(idventaNew)) {
                idventaOld.getDevolucionList().remove(devolucion);
                idventaOld = em.merge(idventaOld);
            }
            if (idventaNew != null && !idventaNew.equals(idventaOld)) {
                idventaNew.getDevolucionList().add(devolucion);
                idventaNew = em.merge(idventaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = devolucion.getIddevolucion();
                if (findDevolucion(id) == null) {
                    throw new NonexistentEntityException("The devolucion with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Devolucion devolucion;
            try {
                devolucion = em.getReference(Devolucion.class, id);
                devolucion.getIddevolucion();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The devolucion with id " + id + " no longer exists.", enfe);
            }
            Producto idproducto = devolucion.getIdproducto();
            if (idproducto != null) {
                idproducto.getDevolucionList().remove(devolucion);
                idproducto = em.merge(idproducto);
            }
            Usuario identificacionusuario = devolucion.getIdentificacionusuario();
            if (identificacionusuario != null) {
                identificacionusuario.getDevolucionList().remove(devolucion);
                identificacionusuario = em.merge(identificacionusuario);
            }
            Venta idventa = devolucion.getIdventa();
            if (idventa != null) {
                idventa.getDevolucionList().remove(devolucion);
                idventa = em.merge(idventa);
            }
            em.remove(devolucion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Devolucion> findDevolucionEntities() {
        return findDevolucionEntities(true, -1, -1);
    }

    public List<Devolucion> findDevolucionEntities(int maxResults, int firstResult) {
        return findDevolucionEntities(false, maxResults, firstResult);
    }

    private List<Devolucion> findDevolucionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Devolucion.class));
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

    public Devolucion findDevolucion(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Devolucion.class, id);
        } finally {
            em.close();
        }
    }

    public int getDevolucionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Devolucion> rt = cq.from(Devolucion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
