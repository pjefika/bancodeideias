package bancodeideias.controller.system;

import bancodeideias.controller.routes.AbstractCrudController;
import bancodeideias.dal.IdeiaDAO;
import bancodeideias.model.annotation.Admin;
import bancodeideias.model.viewmodel.Relatorio;

import java.io.IOException;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;

@Controller
@RequestScoped
public class RelatorioController extends AbstractCrudController {

    @Inject
    private IdeiaDAO dao;

    public RelatorioController() {

    }

    @Admin
    public void create() {
    }

    @Admin
    public void lista() {
    }

    @Admin
    public void add(Relatorio r) throws IOException {
        result.include("relato", dao.listar(r));
    }
}
