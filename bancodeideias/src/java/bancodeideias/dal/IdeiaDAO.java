/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodeideias.dal;

import bancodeideias.model.entitiy.Ideia;
import bancodeideias.model.entitiy.InterfaceDAO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author G0042204
 */
public class IdeiaDAO extends AbstractDAO implements InterfaceDAO<Ideia> {

    public IdeiaDAO() {
        factory = Persistence.createEntityManagerFactory("bancodeideiasPU");
        entityManager = factory.createEntityManager();
    }

    @Override
    public Ideia cadastrar(Ideia t) {
        t.setDataCadastro(Calendar.getInstance());
        entityManager.getTransaction().begin();
        super.persist(t);
        entityManager.getTransaction().commit();
        return t;
    }

    @Override
    public void excluir(Ideia t) {
        super.remove(t);
    }

    @Override
    public Ideia editar(Ideia t) {
        super.merge(t);
        return t;
    }

    @Override
    public List<Ideia> listar() {
        try {
            Query query = this.entityManager.createQuery("FROM Ideia");
            List<Ideia> result = query.getResultList();
            return result;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

}
