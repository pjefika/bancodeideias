package vraptor_suporten2.model.entitiy;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "BANCOIDEIAS_IDEIA")
public class Ideia extends AbstractEntity {

    private String loginCriador;

    @Lob
    private String descricao;

    @Lob
    private String ganhos;

    @Lob
    private String descComo;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar dataCadastro;

//    private List<Curtida> curtidas;
    public Ideia() {
        super();
    }

    public String getLoginCriador() {
        return loginCriador;
    }

    public void setLoginCriador(String loginCriador) {
        this.loginCriador = loginCriador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGanhos() {
        return ganhos;
    }

    public void setGanhos(String ganhos) {
        this.ganhos = ganhos;
    }

    public String getDescComo() {
        return descComo;
    }

    public void setDescComo(String descComo) {
        this.descComo = descComo;
    }

//    public List<Curtida> getCurtidas() {
//        return curtidas;
//    }
//
//    public void setCurtidas(List<Curtida> curtidas) {
//        this.curtidas = curtidas;
//    }
    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

}
