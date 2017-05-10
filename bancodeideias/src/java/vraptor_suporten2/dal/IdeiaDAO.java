/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraptor_suporten2.dal;

import java.util.Calendar;
import javax.persistence.Persistence;
import vraptor_suporten2.model.entitiy.Ideia;
import vraptor_suporten2.model.entitiy.InterfaceDAO;

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

}
