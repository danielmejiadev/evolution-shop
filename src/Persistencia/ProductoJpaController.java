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
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;
import Modelo.Ventaproducto;
import Persistencia.exceptions.IllegalOrphanException;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Parameter;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class ProductoJpaController implements Serializable {

    public ProductoJpaController() {
        this.emf = Persistence.createEntityManagerFactory("EvolucionShop1.0PU");    
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Producto producto) throws PreexistingEntityException, Exception {
        if (producto.getDevolucionList() == null) {
            producto.setDevolucionList(new ArrayList<Devolucion>());
        }
        if (producto.getVentaproductoList() == null) {
            producto.setVentaproductoList(new ArrayList<Ventaproducto>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Devolucion> attachedDevolucionList = new ArrayList<Devolucion>();
            for (Devolucion devolucionListDevolucionToAttach : producto.getDevolucionList()) {
                devolucionListDevolucionToAttach = em.getReference(devolucionListDevolucionToAttach.getClass(), devolucionListDevolucionToAttach.getIddevolucion());
                attachedDevolucionList.add(devolucionListDevolucionToAttach);
            }
            producto.setDevolucionList(attachedDevolucionList);
            List<Ventaproducto> attachedVentaproductoList = new ArrayList<Ventaproducto>();
            for (Ventaproducto ventaproductoListVentaproductoToAttach : producto.getVentaproductoList()) {
                ventaproductoListVentaproductoToAttach = em.getReference(ventaproductoListVentaproductoToAttach.getClass(), ventaproductoListVentaproductoToAttach.getVentaproductoPK());
                attachedVentaproductoList.add(ventaproductoListVentaproductoToAttach);
            }
            producto.setVentaproductoList(attachedVentaproductoList);
            em.persist(producto);
            for (Devolucion devolucionListDevolucion : producto.getDevolucionList()) {
                Producto oldIdproductoOfDevolucionListDevolucion = devolucionListDevolucion.getIdproducto();
                devolucionListDevolucion.setIdproducto(producto);
                devolucionListDevolucion = em.merge(devolucionListDevolucion);
                if (oldIdproductoOfDevolucionListDevolucion != null) {
                    oldIdproductoOfDevolucionListDevolucion.getDevolucionList().remove(devolucionListDevolucion);
                    oldIdproductoOfDevolucionListDevolucion = em.merge(oldIdproductoOfDevolucionListDevolucion);
                }
            }
            for (Ventaproducto ventaproductoListVentaproducto : producto.getVentaproductoList()) {
                Producto oldProductoOfVentaproductoListVentaproducto = ventaproductoListVentaproducto.getProducto();
                ventaproductoListVentaproducto.setProducto(producto);
                ventaproductoListVentaproducto = em.merge(ventaproductoListVentaproducto);
                if (oldProductoOfVentaproductoListVentaproducto != null) {
                    oldProductoOfVentaproductoListVentaproducto.getVentaproductoList().remove(ventaproductoListVentaproducto);
                    oldProductoOfVentaproductoListVentaproducto = em.merge(oldProductoOfVentaproductoListVentaproducto);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findProducto(producto.getIdproducto()) != null) {
                throw new PreexistingEntityException("Producto " + producto + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Producto producto) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Producto persistentProducto = em.find(Producto.class, producto.getIdproducto());
            List<Devolucion> devolucionListOld = persistentProducto.getDevolucionList();
            List<Devolucion> devolucionListNew = producto.getDevolucionList();
            List<Ventaproducto> ventaproductoListOld = persistentProducto.getVentaproductoList();
            List<Ventaproducto> ventaproductoListNew = producto.getVentaproductoList();
            List<String> illegalOrphanMessages = null;
            for (Ventaproducto ventaproductoListOldVentaproducto : ventaproductoListOld) {
                if (!ventaproductoListNew.contains(ventaproductoListOldVentaproducto)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Ventaproducto " + ventaproductoListOldVentaproducto + " since its producto field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Devolucion> attachedDevolucionListNew = new ArrayList<Devolucion>();
            for (Devolucion devolucionListNewDevolucionToAttach : devolucionListNew) {
                devolucionListNewDevolucionToAttach = em.getReference(devolucionListNewDevolucionToAttach.getClass(), devolucionListNewDevolucionToAttach.getIddevolucion());
                attachedDevolucionListNew.add(devolucionListNewDevolucionToAttach);
            }
            devolucionListNew = attachedDevolucionListNew;
            producto.setDevolucionList(devolucionListNew);
            List<Ventaproducto> attachedVentaproductoListNew = new ArrayList<Ventaproducto>();
            for (Ventaproducto ventaproductoListNewVentaproductoToAttach : ventaproductoListNew) {
                ventaproductoListNewVentaproductoToAttach = em.getReference(ventaproductoListNewVentaproductoToAttach.getClass(), ventaproductoListNewVentaproductoToAttach.getVentaproductoPK());
                attachedVentaproductoListNew.add(ventaproductoListNewVentaproductoToAttach);
            }
            ventaproductoListNew = attachedVentaproductoListNew;
            producto.setVentaproductoList(ventaproductoListNew);
            producto = em.merge(producto);
            for (Devolucion devolucionListOldDevolucion : devolucionListOld) {
                if (!devolucionListNew.contains(devolucionListOldDevolucion)) {
                    devolucionListOldDevolucion.setIdproducto(null);
                    devolucionListOldDevolucion = em.merge(devolucionListOldDevolucion);
                }
            }
            for (Devolucion devolucionListNewDevolucion : devolucionListNew) {
                if (!devolucionListOld.contains(devolucionListNewDevolucion)) {
                    Producto oldIdproductoOfDevolucionListNewDevolucion = devolucionListNewDevolucion.getIdproducto();
                    devolucionListNewDevolucion.setIdproducto(producto);
                    devolucionListNewDevolucion = em.merge(devolucionListNewDevolucion);
                    if (oldIdproductoOfDevolucionListNewDevolucion != null && !oldIdproductoOfDevolucionListNewDevolucion.equals(producto)) {
                        oldIdproductoOfDevolucionListNewDevolucion.getDevolucionList().remove(devolucionListNewDevolucion);
                        oldIdproductoOfDevolucionListNewDevolucion = em.merge(oldIdproductoOfDevolucionListNewDevolucion);
                    }
                }
            }
            for (Ventaproducto ventaproductoListNewVentaproducto : ventaproductoListNew) {
                if (!ventaproductoListOld.contains(ventaproductoListNewVentaproducto)) {
                    Producto oldProductoOfVentaproductoListNewVentaproducto = ventaproductoListNewVentaproducto.getProducto();
                    ventaproductoListNewVentaproducto.setProducto(producto);
                    ventaproductoListNewVentaproducto = em.merge(ventaproductoListNewVentaproducto);
                    if (oldProductoOfVentaproductoListNewVentaproducto != null && !oldProductoOfVentaproductoListNewVentaproducto.equals(producto)) {
                        oldProductoOfVentaproductoListNewVentaproducto.getVentaproductoList().remove(ventaproductoListNewVentaproducto);
                        oldProductoOfVentaproductoListNewVentaproducto = em.merge(oldProductoOfVentaproductoListNewVentaproducto);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = producto.getIdproducto();
                if (findProducto(id) == null) {
                    throw new NonexistentEntityException("The producto with id " + id + " no longer exists.");
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
            Producto producto;
            try {
                producto = em.getReference(Producto.class, id);
                producto.getIdproducto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The producto with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Ventaproducto> ventaproductoListOrphanCheck = producto.getVentaproductoList();
            for (Ventaproducto ventaproductoListOrphanCheckVentaproducto : ventaproductoListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Producto (" + producto + ") cannot be destroyed since the Ventaproducto " + ventaproductoListOrphanCheckVentaproducto + " in its ventaproductoList field has a non-nullable producto field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Devolucion> devolucionList = producto.getDevolucionList();
            for (Devolucion devolucionListDevolucion : devolucionList) {
                devolucionListDevolucion.setIdproducto(null);
                devolucionListDevolucion = em.merge(devolucionListDevolucion);
            }
            em.remove(producto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Producto> findProductoEntities() {
        return findProductoEntities(true, -1, -1);
    }

    public List<Producto> findProductoEntities(int maxResults, int firstResult) {
        return findProductoEntities(false, maxResults, firstResult);
    }

    private List<Producto> findProductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Producto.class));
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

    public Producto findProducto(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }
        
    
    public List<Producto> findProducto(String descripcion,
                                       String talla,
                                       Integer cmin, Integer cmax,
                                       String marca, 
                                       Integer pmin, Integer pmax)
    {
        EntityManager em = getEntityManager(); 
        String consulta = "SELECT p FROM Producto AS p WHERE p=p ";   
        if(pmax!=-1 && pmin!=-1)
        {
             consulta +=  "and p.precio >= :pmin and p.precio <= :pmax "; 
        }
        if(!marca.equals("Marca"))
        {
             consulta += "and p.marca= :marca ";
        }
        if(cmax!=-1 && cmin!=-1)
        {
            consulta +=  "and p.cantidadunidades >= :cmin and p.cantidadunidades <= :cmax ";  
        }
        if(!talla.equals("Talla"))
        {
            consulta += "and p.talla= :talla "; 
        }
        if(!descripcion.equals(""))
        {
            consulta += "and p.descripcion like :descripcion ";
        }
       
        Query query = em.createQuery(consulta);
        if(pmax!=-1 && pmin!=-1)
        {
         query.setParameter("pmin",pmin);
         query.setParameter("pmax",pmax); 
        } 
        if(!marca.equals("Marca"))
        {
           query.setParameter("marca", marca);
        }
        if(cmax!=-1 && cmin!=-1)
        {
         query.setParameter("cmin",cmin);
         query.setParameter("cmax",cmax);
        } 
        if(!talla.equals("Talla"))
        {
          query.setParameter("talla", talla);
        }     
        if(!descripcion.equals(""))
        {
           query.setParameter("descripcion", descripcion+"%");
        }
        return (List<Producto>)query.getResultList();
    }
         
    public int getProductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Producto> rt = cq.from(Producto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
