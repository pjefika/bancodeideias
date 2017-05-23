package bancodeideias.controller.routes;

import bancodeideias.dal.IdeiaDAO;
import bancodeideias.dal.InterfaceDAO;
import bancodeideias.model.annotation.Admin;
import bancodeideias.model.annotation.Logado;
import bancodeideias.model.entities.StatusIdeia;
import bancodeideias.model.entitiy.Ideia;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import java.util.Calendar;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

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
    public void form() {
    }
    
    
    /**
     * Rota para cadastro
     *
     * @param i
     */
    @Logado
    public void add(Ideia i) {
        try {
            i.setLoginCriador(this.session.getUsuario().getLogin());
            i.setStatus(StatusIdeia.ENVIADO);
            dao.cadastrar(i);
            this.result.redirectTo(IdeiaController.class).minhasIdeias();
        } catch (Exception e) {
            validation.onErrorForwardTo(this).form();
        }
    }

    @Logado
    @Path("/ideia/{id}")
    public void view(Long id) {
        System.out.println(id);
        this.result.include("i", ideiaDAO.find(id));
    }

    public void status() {
        result.include("todosStatus", StatusIdeia.values());
    }

    @Logado
    public void ideiasCadastradas() {
        this.result.include("ideias", ideiaDAO.listar());

    }

    @Logado
    public void minhasIdeias() {
        this.result.include("ideias", ideiaDAO.listarIdeiasPorLogin(session.getUsuario().getLogin()));

    }

    /**
     *
     */
    @Admin
    public void painel() {
        this.result.include("ideias", ideiaDAO.listar());

    }
//    @Admin
//    @Path("editar/{i.id}")
//    public void editar(Ideia bb) {
//        try {
//            this.ideiaDAO.editar(bb);
//            this.result.include("mensagem", "Status modificado com sucesso");
//        } catch (Exception e) {
//            this.result.include("mensagemFalha", "erro ao modificar");
//        }
//    }
    
    @Admin
    @Path("editar/{i.id}")
    public void update(Ideia bb){

        editar tratada1 = ideiaDAO.listarIdeiasPendentes(i.getId());
        Calendar calendar = Calendar.getInstance();
        tratada1.setStatus(bb.getStatus());
        tratada1.setUserbackoffice(this.session.getUsuario().getLogin());
        try {
            ideiaDAO.editar(tratada1);
            result.redirectTo(IdeiaController.class).editar();
        } catch (Exception ex) {
//            Logger.getLogger(BaixaBaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

}
