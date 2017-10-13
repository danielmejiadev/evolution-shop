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
import Modelo.Producto;
import Modelo.Venta;
import Modelo.Ventaproducto;
import Modelo.VentaproductoPK;
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
public class VentaproductoJpaController implements Serializable {

    public VentaproductoJpaController() {
                this.emf = Persistence.createEntityManagerFactory("EvolucionShop1.0PU");    

    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Ventaproducto ventaproducto) throws PreexistingEntityException, Exception {
        if (ventaproducto.getVentaproductoPK() == null) {
            ventaproducto.setVentaproductoPK(new VentaproductoPK());
        }
        ventaproducto.getVentaproductoPK().setIdventa(ventaproducto.getVenta().getIdventa());
        ventaproducto.getVentaproductoPK().setIdproducto(ventaproducto.getProducto().getIdproducto());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto producto = ventaproducto.getProducto();
            if (producto != null) {
                producto = em.getReference(producto.getClass(), producto.getIdproducto());
                ventaproducto.setProducto(producto);
            }
            Venta venta = ventaproducto.getVenta();
            if (venta != null) {
                venta = em.getReference(venta.getClass(), venta.getIdventa());
                ventaproducto.setVenta(venta);
            }
            em.persist(ventaproducto);
            if (producto != null) {
                producto.getVentaproductoList().add(ventaproducto);
                producto = em.merge(producto);
            }
            if (venta != null) {
                venta.getVentaproductoList().add(ventaproducto);
                venta = em.merge(venta);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findVentaproducto(ventaproducto.getVentaproductoPK()) != null) {
                throw new PreexistingEntityException("Ventaproducto " + ventaproducto + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Ventaproducto ventaproducto) throws NonexistentEntityException, Exception {
        ventaproducto.getVentaproductoPK().setIdventa(ventaproducto.getVenta().getIdventa());
        ventaproducto.getVentaproductoPK().setIdproducto(ventaproducto.getProducto().getIdproducto());
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ventaproducto persistentVentaproducto = em.find(Ventaproducto.class, ventaproducto.getVentaproductoPK());
            Producto productoOld = persistentVentaproducto.getProducto();
            Producto productoNew = ventaproducto.getProducto();
            Venta ventaOld = persistentVentaproducto.getVenta();
            Venta ventaNew = ventaproducto.getVenta();
            if (productoNew != null) {
                productoNew = em.getReference(productoNew.getClass(), productoNew.getIdproducto());
                ventaproducto.setProducto(productoNew);
            }
            if (ventaNew != null) {
                ventaNew = em.getReference(ventaNew.getClass(), ventaNew.getIdventa());
                ventaproducto.setVenta(ventaNew);
            }
            ventaproducto = em.merge(ventaproducto);
            if (productoOld != null && !productoOld.equals(productoNew)) {
                productoOld.getVentaproductoList().remove(ventaproducto);
                productoOld = em.merge(productoOld);
            }
            if (productoNew != null && !productoNew.equals(productoOld)) {
                productoNew.getVentaproductoList().add(ventaproducto);
                productoNew = em.merge(productoNew);
            }
            if (ventaOld != null && !ventaOld.equals(ventaNew)) {
                ventaOld.getVentaproductoList().remove(ventaproducto);
                ventaOld = em.merge(ventaOld);
            }
            if (ventaNew != null && !ventaNew.equals(ventaOld)) {
                ventaNew.getVentaproductoList().add(ventaproducto);
                ventaNew = em.merge(ventaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                VentaproductoPK id = ventaproducto.getVentaproductoPK();
                if (findVentaproducto(id) == null) {
                    throw new NonexistentEntityException("The ventaproducto with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(VentaproductoPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Ventaproducto ventaproducto;
            try {
                ventaproducto = em.getReference(Ventaproducto.class, id);
                ventaproducto.getVentaproductoPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ventaproducto with id " + id + " no longer exists.", enfe);
            }
            Producto producto = ventaproducto.getProducto();
            if (producto != null) {
                producto.getVentaproductoList().remove(ventaproducto);
                producto = em.merge(producto);
            }
            Venta venta = ventaproducto.getVenta();
            if (venta != null) {
                venta.getVentaproductoList().remove(ventaproducto);
                venta = em.merge(venta);
            }
            em.remove(ventaproducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Ventaproducto> findVentaproductoEntities() {
        return findVentaproductoEntities(true, -1, -1);
    }

    public List<Ventaproducto> findVentaproductoEntities(int maxResults, int firstResult) {
        return findVentaproductoEntities(false, maxResults, firstResult);
    }

    private List<Ventaproducto> findVentaproductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Ventaproducto.class));
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

    public Ventaproducto findVentaproducto(VentaproductoPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Ventaproducto.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentaproductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Ventaproducto> rt = cq.from(Ventaproducto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
