/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodeideias.model.enums;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0025381
 */
public enum StatusBdi {

    ENVIADO("Enviado"),
    ANALISE("Em Análise"),
    ENCERRADO("Aprovado"),
    NEGADO("Negado");

    private final String status;

    private StatusBdi(String valueStatus) {

        status = valueStatus;

    }

    public String getStatus() {
        return status;

    }

    public List<StatusBdi> toList() {
        List<StatusBdi> a = new ArrayList<>();
        for (StatusBdi v : StatusBdi.values()) {
            a.add(v);
        }
        return a;

    }
}
