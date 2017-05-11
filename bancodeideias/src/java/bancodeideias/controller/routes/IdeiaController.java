package bancodeideias.controller.routes;

import bancodeideias.dal.InterfaceDAO;
import bancodeideias.model.entitiy.Ideia;
import br.com.caelum.vraptor.Controller;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@Controller
@RequestScoped
public class IdeiaController {

    @Inject
    private InterfaceDAO<Ideia> dao;

    public IdeiaController() {
    }

    /**
     * Form de Cadastro
     */
    public void form() {
    }

    /**
     * Rota para cadastro
     *
     * @param i
     */
    public void add(Ideia i) {
        try {
            dao.cadastrar(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void view() {

    }
}
