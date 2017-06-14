package bancodeideias.model.entitiy;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BANCOIDEIAS_VISUALIZACAO_IDEIA")
public class VisualizacaoIdeia extends AbstractLogEntity {

    public VisualizacaoIdeia() {
        super();
    }
 
}
