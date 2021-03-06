package bancodeideias.model.entitiy;

import bancodeideias.model.enums.StatusIdeia;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "BANCOIDEIAS_IDEIA")
public class Ideia extends AbstractEntity {

    @NotEmpty
    private String loginCriador;

    @NotEmpty(message = "Campo requerido!")
    @Length(min = 0, max = 100)
    private String titulo;

    @Column(length = 255555)
    @NotEmpty(message = "Campo requerido!")
    private String descricao;

    @Column(length = 255555)
    @NotEmpty(message = "Campo requerido!")
    private String ganhos;

    @Column(length = 255555)
    @NotEmpty(message = "Campo requerido!")
    private String realizar;

    private StatusIdeia status;
    
    private String votoP;

    public String getVotoP() {
        return votoP;
    }

    public void setVotoP(String votoP) {
        this.votoP = votoP;
    }

    public String getVotoN() {
        return votoN;
    }

    public void setVotoN(String votoN) {
        this.votoN = votoN;
    }
    
    private String votoN;

    @Column(length = 255555)
    @NotEmpty(message = "Campo requerido!")
    private String descComo;

    private Calendar dataCadastro;

//    private List<Curtida> curtidas;
    public Ideia() {
        super();
    }

    public String getRealizar() {
        return realizar;
    }

    public void setRealizar(String realizar) {
        this.realizar = realizar;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public StatusIdeia getStatus() {
        return status;
    }

    public void setStatus(StatusIdeia status) {
        this.status = status;
    }

}
