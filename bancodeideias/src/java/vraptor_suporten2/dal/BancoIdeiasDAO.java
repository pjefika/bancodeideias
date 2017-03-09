package vraptor_suporten2.dal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import java.util.ArrayList;
import javax.persistence.Query;
import javax.transaction.Transactional;
import vraptor_suporten2.model.entities.BancoDeIdeias;
import vraptor_suporten2.model.entities.StatusBdi;


/**
 *
 * @author G0025381
 */
public class BancoIdeiasDAO extends AbstractDAO{

    public BancoIdeiasDAO() {
    }

    @Transactional
    public void cadastrar (BancoDeIdeias cadideia) throws Exception {
        try {
            this.entityManager.persist(cadideia);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
            //throw new PersistenciaException("Falha ao cadastrar " + c.getClass().getSimpleName() + ".");
        }
    }
    
    
    @Transactional
    public void editar(BancoDeIdeias cadideia) throws Exception {
        try {
            this.entityManager.merge(cadideia);
        } catch (Exception e) {
            throw new Exception();
        }
    }

    @Transactional
    public void excluir(BancoDeIdeias cadideia) throws Exception {
        try {
            this.entityManager.remove(this.entityManager.merge(cadideia));
        } catch (Exception e) {
            throw new Exception();
        }
    }
    @Transactional
    public List<BancoDeIdeias> listarporstatus(StatusBdi status){
        try {
            Query query = this.entityManager.createQuery("FROM BancoDeIdeias b WHERE b.status =:param1" );
            query.setParameter("param1", status);           
            
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    @Transactional
    public BancoDeIdeias listarporstatus(Integer id){
        try {
            Query query = this.entityManager.createQuery("FROM BancoDeIdeias b WHERE b.id =:param1" );
            query.setParameter("param1", id);           
            
            return  (BancoDeIdeias) query.getSingleResult();
        } catch (Exception e) {
            return new BancoDeIdeias();
        }
    }
    @Transactional
    public List<BancoDeIdeias> listarporstatusTodos(){
        try {
            Query query = this.entityManager.createQuery("FROM BancoDeIdeias b " );

            
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    
      @Transactional
    public BancoDeIdeias buscaPorId(Long Id){
        try {
            Query query = this.entityManager.createQuery("FROM BancoDeIdeias b WHERE b.id =:param1" );
            query.setParameter("param1", Id);
                      
            return (BancoDeIdeias) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    
    
}
