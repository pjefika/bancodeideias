package bancodeideias.controller.system;

import bancodeideias.controller.routes.AbstractCrudController;
import bancodeideias.model.annotation.Admin;

import java.io.IOException;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;

@Controller
@RequestScoped
public class RelatorioController extends AbstractCrudController {

    @Inject
    private bancodeideias.dal.IdeiaDAO dao;

    public RelatorioController() {

    }

    @Admin
    public void create() {
    }

    @Admin
    public void lista() {
    }

    public void add(Relatorio r) throws IOException {
        result.include("relatorio", dao.listar(r));
    }

}
