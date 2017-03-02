package vraptor_suporten2.model.entities;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

public class BancoDeIdeias {

    private String colaborador;
    private String supervisor;
    private String equipe;
    private String login;
    private String id;
    private String ideia;
    private String implantar;
    private String ganhos;
    private String processos;
    private String status;
    private Calendar data;

    public String getColaborador() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdeia() {
        return ideia;
    }

    public void setIdeia(String ideia) {
        this.ideia = ideia;
    }

    public String getImplantar() {
        return implantar;
    }

    public void setImplantar(String implantar) {
        this.implantar = implantar;
    }

    public String getGanhos() {
        return ganhos;
    }

    public void setGanhos(String ganhos) {
        this.ganhos = ganhos;
    }

    public String getProcessos() {
        return processos;
    }

    public void setProcessos(String processos) {
        this.processos = processos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Calendar getData() {
        return data;
    }

    public static class Addideia {

        public Addideia() {
        }
    }

    
}
