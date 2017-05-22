/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodeideias.dal;

import bancodeideias.model.entities.StatusIdeia;
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

    @Override
    @Transactional
    public Ideia cadastrar(Ideia t) {
        t.setDataCadastro(Calendar.getInstance().getTime());
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
    
    
    
    @Override
    public List<Ideia> listar(Relatorio r) {
        try {
            Query query = this.entityManager.createQuery("FROM Ideia i WHERE i.dataCadastro BETWEEN :param1 AND :param2 ORDER BY i.dataCadastro DESC");

            Calendar cal = Calendar.getInstance();
            cal.setTime(r.getDataFinal());
            cal.set(Calendar.HOUR, 23);
            cal.set(Calendar.MINUTE, 59);
            cal.set(Calendar.SECOND, 59);

            System.out.println(r.getDataInicio());
            System.out.println(cal.getTime());

            query.setParameter("param1", r.getDataInicio());
            query.setParameter("param2", cal.getTime());

            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<Ideia>();
        }
    }
    @Transactional
    public List<Ideia> listarporstatus() {
        try {
            Query query = this.entityManager.createQuery("FROM Bancoideias b WHERE b.status =:param1 OR b.status =:param2");
            query.setParameter("param1", StatusIdeia.ANALISE);
            query.setParameter("param2", StatusIdeia.ENVIADO);
            
            
            

            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
