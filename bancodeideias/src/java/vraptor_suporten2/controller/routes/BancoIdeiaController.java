package vraptor_suporten2.controller.routes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.transaction.Transactional;
import vraptor_suporten2.dal.BancoIdeiasDAO;
import vraptor_suporten2.model.entities.BancoDeIdeias.Addideia;
import vraptor_suporten2.model.entities.BancoIdeias;


/**
 *
 * @author G0025381
 */
@Controller
public class BancoIdeiaController extends AbstractCrudController {

    @Inject
    private BancoIdeiasDAO bancodeideias;

    public BancoIdeiaController() {
    }

    @Path("/bancodeideias/create/")
    public void create() {

    }
    @Path("/bancodeideias/buscaideias/")
    public void buscaideias() {

    }

    
    @Path("/bancodeideias/addideia/")
    public void addideia() {

    }
   
    @Path("/index/")
    public void index() {

    }
    @Path("/edit/")
    public void edit() {

    }

    @Path("/buscaideias/votos/")
    public void votos() {

    }
//@Path("/bancodeideias/addideia/")
//    public void create(Addideia addideia) {
//        try {
//            //this.result.include("mensagem", "Cadastro Baixa Off Line");
//
//            Calendar calendar = Calendar.getInstance();
//
//            addideia.setData(calendar);
//
//            addideia.setStatus(StatusIdeia.ENVIADO);
//
//            this.baixaDAO.cadastrar(baixaba);
//            result.include("mensagem", "Sucesso no cadastro");
//        } catch (Exception ex) {
//            //result.include("mensagemFalha", "Falha ao cadastrar " + baixa.getInstancia() + "!");
//            result.include("mensagemFalha", ex.getMessage());
//        }
//    }
}
