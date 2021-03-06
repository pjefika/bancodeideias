/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodeideias.dal;

import bancodeideias.model.annotation.Admin;
import bancodeideias.model.annotation.Logado;
import bancodeideias.model.enums.StatusIdeia;
import bancodeideias.model.entitiy.Ideia;
import bancodeideias.model.viewmodel.Relatorio;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 *
 * @author G0042204
 */
public class IdeiaDAO extends AbstractDAO implements InterfaceDAO<Ideia> {

    public IdeiaDAO() {
//        factory = Persistence.createEntityManagerFactory("bancodeideiasPU");
//        entityManager = factory.createEntityManager();
    }

    @Logado
    @Override
    @Transactional
    public Ideia cadastrar(Ideia t) {
        t.setDataCadastro(Calendar.getInstance());
//        entityManager.getTransaction().begin();
        super.persist(t);
//        entityManager.getTransaction().commit();
        return t;
    }

    @Override
    public void excluir(Ideia t) {
        super.remove(t);
    }

    @Override
    @Transactional
    public Ideia editar(Ideia t) {
        super.merge(t);
        return t;
    }

//    @Override
//    public List<Ideia> listar1() {
//        try {
//            Query query = this.entityManager.createQuery("FROM Ideia");
//            List<Ideia> result = query.getResultList();
//            return result;
//        } catch (Exception e) {
//            return new ArrayList<>();
//        }
//    }
    public Ideia find(Long id) {
        try {
            return this.entityManager.find(Ideia.class, id);
        } catch (Exception e) {
            return null;
        }
    }

    @Admin
    @Transactional
    @Override
    public List<Ideia> listar(Relatorio r) {
        try {
            Query query = this.entityManager.createQuery("FROM Ideia i WHERE i.dataCadastro BETWEEN :param1 AND :param2 ORDER BY i.dataCadastro DESC");

            r.getDataFinal().set(Calendar.HOUR, 23);
            r.getDataFinal().set(Calendar.MINUTE, 59);
            r.getDataFinal().set(Calendar.SECOND, 59);

            query.setParameter("param1", r.getDataInicio());
            query.setParameter("param2", r.getDataFinal());

            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public List<Ideia> listarIdeiasPendentes() {
        try {
            Query query = this.entityManager.createQuery("FROM Ideia i WHERE i.status =:param1 OR i.status =:param2");
            query.setParameter("param1", StatusIdeia.ANALISE);
            query.setParameter("param2", StatusIdeia.ENVIADO);

            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public List<Ideia> listarIdeiasPorLogin(String login) {
        try {
            Query query = this.entityManager.createQuery("FROM Ideia i WHERE i.loginCriador =:param1");
            query.setParameter("param1", login);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public List<Ideia> listar() {
        try {
            Query query = this.entityManager.createQuery("FROM Ideia i WHERE i.status =:param1");
            query.setParameter("param1", StatusIdeia.DIVULGADO);
            query.setMaxResults(9);
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
