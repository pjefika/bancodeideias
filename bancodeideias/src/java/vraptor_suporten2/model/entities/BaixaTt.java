package vraptor_suporten2.model.entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author G0025381
 */
@Entity
@Table(name = "SuporteN2_BaixaTT")
public class BaixaTt {
    @Id
    @GeneratedValue
    private Long id;
    private String ss;
    private String dabertura;
    private String dfechamento;
    private String codfechamento;
    private StatusBaixa status;
    private Calendar data;
            

     public Long getId() {
        return id;
     }
    public void setId(Long id) {
        this.id = id;
    } 

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public String getDabertura() {
        return dabertura;
    }

    public void setDabertura(String dabertura) {
        this.dabertura = dabertura;
    }

    public String getDfechamento() {
        return dfechamento;
    }

    public void setDfechamento(String dfechamento) {
        this.dfechamento = dfechamento;
    }

    public String getCodfechamento() {
        return codfechamento;
    }

    public void setCodfechamento(String codfechamento) {
        this.codfechamento = codfechamento;
    }

    public StatusBaixa getStatus() {
        return status;
    }

    public void setStatus(StatusBaixa status) {
        this.status = status;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
}