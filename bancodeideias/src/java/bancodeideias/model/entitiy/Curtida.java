package bancodeideias.model.entitiy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BANCOIDEIAS_CURTIDA")
public class Curtida extends AbstractLogEntity {

    public Curtida() {
        super();
    }
 
}
