package bancodeideias.controller.system;

import java.util.Calendar;

import javax.validation.constraints.NotNull;

public class Relatorio {

    private String relato;

    public String getRelato() {
        return relato;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }

    @NotNull(message = "Campo requerido!")
    public Calendar dataInicio;

    @NotNull(message = "Campo requerido!")
    public Calendar dataFinal;

    public Relatorio() {

    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Calendar getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }
}
