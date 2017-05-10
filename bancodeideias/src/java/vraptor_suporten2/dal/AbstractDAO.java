package vraptor_suporten2.dal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

public class AbstractDAO {

    protected EntityManagerFactory factory;
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
