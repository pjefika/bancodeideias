package bancodeideias.model.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G0025381
 */
public enum StatusIdeia {

    ENVIADO("Enviado"),
    ANALISE("Em Análise"),
    DIVULGADO("Divulgado"),
    NEGADO("Negado");

    private final String status;

    private StatusIdeia(String valueStatus) {
        status = valueStatus;
    }

    public String getStatus() {
        return status;

    }

    public static List<StatusIdeia> toList() {
        List<StatusIdeia> a = new ArrayList<>();
        for (StatusIdeia v : StatusIdeia.values()) {
            a.add(v);
        }
        return a;

    }
}