package bancodeideias.dal;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Stateless
public class AbstractDAO {

    protected EntityManagerFactory factory;
    
    @PersistenceContext(name = "bancodeideiasPU")
    protected EntityManager entityManager;

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

}
