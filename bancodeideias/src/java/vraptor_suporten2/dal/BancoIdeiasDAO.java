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


/**
 *
 * @author G0025381
 */
public class BancoIdeiasDAO extends AbstractDAO{

    public BancoIdeiasDAO() {
    }

    @Transactional
    public void cadastrar (cadIdeia cadideia) throws Exception {
        try {
            this.entityManager.persist(cadideia);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
            //throw new PersistenciaException("Falha ao cadastrar " + c.getClass().getSimpleName() + ".");
        }
    }
    
    
    @Transactional
    public void editar(cadIdeia cadideia) throws Exception {
        try {
            this.entityManager.merge(cadideia);
        } catch (Exception e) {
            throw new Exception();
        }
    }

    @Transactional
    public void excluir(cadIdeia cadideia) throws Exception {
        try {
            this.entityManager.remove(this.entityManager.merge(cadideia));
        } catch (Exception e) {
            throw new Exception();
        }
    }
    @Transactional
    public List<cadIdeia> listarporstatus(){
        try {
            Query query = this.entityManager.createQuery("FROM cadIdeia b WHERE b.status =:param1 OR b.status =:param2 =:param3 OR b.status =:param4" );
            query.setParameter("param1", cadIdeia.ANALISE);
            query.setParameter("param2", cadIdeia.ENVIADO);
            query.setParameter("param3", cadIdeia.APROVADA);
            query.setParameter("param4", cadIdeia.NEGADA);

            
            return query.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    
     
    public cadIdeia buscaPorId(Long Id){
        try {
            Query query = this.entityManager.createQuery("FROM cadIdeia b WHERE b.id =:param1" );
            query.setParameter("param1", Id);
                      
            return (cadIdeia) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
}
