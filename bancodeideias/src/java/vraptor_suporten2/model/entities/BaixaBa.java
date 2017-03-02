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
@Table(name = "SuporteN2_BaixaBa")
public class BaixaBa {
    @Id
    @GeneratedValue
    private Long id;
    private String instancia;
    private String cidade;
    private String ordem;
    private String fechamento1 ,fechamento2, fechamento3;
    private StatusBaixa status;
    private Calendar data;
              

    public BaixaBa(){
                
    }
          
                    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
   }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getFechamento1() {
        return fechamento1;
    }

    public void setFechamento1(String fechamento1) {
        this.fechamento1 = fechamento1;
    }

    public String getFechamento2() {
        return fechamento2;
    }

    public void setFechamento2(String fechamento2) {
        this.fechamento2 = fechamento2;
    }

    public String getFechamento3() {
        return fechamento3;
    }

    public void setFechamento3(String fechamento3) {
        this.fechamento3 = fechamento3;
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
