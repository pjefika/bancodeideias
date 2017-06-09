package bancodeideias.model.viewmodel;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Relatorio {
	
	@NotNull(message="Campo requerido!")
	private Date dataInicio;
	
	@NotNull(message="Campo requerido!")
	private Date dataFinal;
		
	public Relatorio() {

	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

    public Object getRelato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
