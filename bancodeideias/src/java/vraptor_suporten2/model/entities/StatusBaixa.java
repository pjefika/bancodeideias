/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraptor_suporten2.model.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0025381
 */
public enum StatusBaixa {

    ENVIADO("Enviado"),
    ANALISE("Em Análise"),
    ENCERRADO("Encerrado"),
    NEGADO("Negado");

    private final String status;

    private StatusBaixa(String valueStatus) {

        status = valueStatus;

    }

    public String getStatus() {
        return status;

    }

    public List<StatusBaixa> toList() {
        List<StatusBaixa> a = new ArrayList<>();
        for (StatusBaixa v : StatusBaixa.values()) {
            a.add(v);
        }
        return a;

    }
}
