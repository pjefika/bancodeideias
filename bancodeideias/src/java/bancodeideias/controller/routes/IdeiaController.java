package bancodeideias.controller.routes;

import bancodeideias.dal.IdeiaDAO;
import bancodeideias.dal.InterfaceDAO;
import bancodeideias.model.annotation.Admin;
import bancodeideias.model.annotation.Logado;
import bancodeideias.model.enums.StatusIdeia;
import bancodeideias.model.entitiy.Ideia;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.validation.Valid;

@Controller
@RequestScoped
public class IdeiaController extends AbstractCrudController {

    @Inject
    private InterfaceDAO<Ideia> dao;

    public IdeiaController() {
    }

    @Inject
    private IdeiaDAO ideiaDAO;

    /**
     * Form de Cadastro
     */
    @Logado
    public void form(Ideia i) {
        this.result.include("i", i);
    }

    /**
     * Rota para cadastro
     *
     * @param i
     */
    @Logado
    public void add(@Valid Ideia i) {

        validation.onErrorForwardTo(this).form(i);

        try {
            i.setLoginCriador(this.session.getUsuario().getLogin());
            i.setStatus(StatusIdeia.ENVIADO);
            ideiaDAO.cadastrar(i);
            this.result.redirectTo(IdeiaController.class).minhasIdeias();
        } catch (Exception e) {
            validation.onErrorForwardTo(this).form(i);
        }
    }

    @Logado
    @Path("/ideia/{id}")
    public void view(Long id) {
        this.result.include("i", ideiaDAO.find(id));
    }

    @Admin
    @Path("/editar/{id}")
    public void editar(Long id) {
        this.result.include("i", ideiaDAO.find(id));

        this.result.include("StatusIdeia", StatusIdeia.values());
    }

    public void status() {
        result.include("todosStatus", StatusIdeia.values());
    }

    @Logado
    public void ideiasCadastradas() {
        List<Ideia> l = ideiaDAO.listar();
        for (Ideia ideia : l) {
            if (ideia.getDescricao().length() > 50) {
                ideia.setDescricao(ideia.getDescricao().substring(0, 100).concat("..."));
            }
        }
        this.result.include("ideias", l);

    }

    @Logado
    public void minhasIdeias() {
        List<Ideia> l = ideiaDAO.listarIdeiasPorLogin(session.getUsuario().getLogin());
        for (Ideia ideia : l) {
            if (ideia.getDescricao().length() > 50) {
                ideia.setDescricao(ideia.getDescricao().substring(0, 100).concat("..."));
            }
        }
        this.result.include("ideias", l);

    }

    /**
     *
     */
    @Admin
    public void painel() {
        List<Ideia> l = ideiaDAO.listarIdeiasPendentes();
        for (Ideia ideia : l) {
            if (ideia.getDescricao().length() > 50) {
                ideia.setDescricao(ideia.getDescricao().substring(0, 100).concat("..."));
            }
        }
        this.result.include("ideias", l);

    }

//    @Admin
//    @Path("/editar/{i.id}")
//    public void editar(Long id) {
//        this.result.include("i", ideiaDAO.find(id));
//    }
//    @Admin
//    public void update(Ideia i) {
//        try {
//            ideiaDAO.editar(s);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    @Admin

    public void updateStatus(Ideia i) {
        Ideia a = this.ideiaDAO.find(i.getId());
        a.setStatus(i.getStatus());

        try {
            ideiaDAO.editar(a);
            result.redirectTo(IdeiaController.class).painel();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
