package bancodeideias.model.entitiy;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "BANCOIDEIAS_IDEIA")
public class Ideia extends AbstractEntity {

    @NotEmpty
    private String loginCriador;

    @NotEmpty
    private String titulo;

    @Lob
    @NotEmpty
    private String descricao;

    @Lob
    @NotEmpty
    private String ganhos;

    @Lob
    @NotEmpty
    private String descComo;

    @NotNull
    private Date dataCadastro;

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
    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
