package bancodeideias.model.entitiy;

import java.util.Calendar;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractLogEntity extends AbstractEntity {

    @ManyToOne
    private Ideia ideia;

    private Calendar data;

    private String login;

    public AbstractLogEntity() {
        ideia = new Ideia();
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Ideia getIdeia() {
        return ideia;
    }

    public void setIdeia(Ideia ideia) {
        this.ideia = ideia;
    }

}
