/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodeideias.model.viewmodel;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author G0042204
 */
@XmlRootElement(name = "colaborador")
public class Colaborador {

    private String matricula, nome, cargo, supervisor, area, pabx;

    public Colaborador() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPabx() {
        return pabx;
    }

    public void setPabx(String pabx) {
        this.pabx = pabx;
    }

}
