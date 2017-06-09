package bancodeideias.dal;

import bancodeideias.model.entitiy.EntityCrudInterface;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

@Stateless
public class AbstractDAO {

    protected EntityManagerFactory factory;

    @PersistenceContext(name = "bancodeideiasPU")
    protected EntityManager entityManager;

    @Transactional
    public Object persist(Object param1) {
        this.entityManager.persist(param1);
        return param1;
    }

    @Transactional
    public void merge(Object param1) {
        this.entityManager.merge(param1);
    }

    @Transactional
    public void remove(Object param1) {
        this.entityManager.remove(this.entityManager.merge(param1));
    }

    @Transactional
    public EntityCrudInterface buscarPorId(EntityCrudInterface ob) {

        try {
            Query query = this.entityManager.createQuery("FROM " + ob.getClass().getSimpleName() + " m WHERE m.id =:param1");
            query.setParameter("param1", ob.getId());
            return (EntityCrudInterface) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
