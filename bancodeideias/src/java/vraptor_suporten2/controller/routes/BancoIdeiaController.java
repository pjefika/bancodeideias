package vraptor_suporten2.controller.routes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import java.util.Calendar;
import javax.inject.Inject;
import vraptor_suporten2.dal.BancoIdeiasDAO;
import vraptor_suporten2.model.entities.BancoDeIdeias;
import vraptor_suporten2.model.entities.StatusBdi;

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

    @Path("/buscaideias/")
    public void buscaideias() {

    }

//    @Path("/addideia/")
//    public void addideia(BancoDeIdeias addbd) {
//        
//            }
    @Path("/edit/")
    public void edit() {

    }

    @Path("/votos/")
    public void votos() {

    }

    @Path("/addideia/")
    public void addideia() {
        

    }
    
    @Path ("/bancodeideias/addideia/")
    public void cadastrarideia(BancoDeIdeias addbd) {
        try {
            
            Calendar calendar = Calendar.getInstance();
            addbd.setData(calendar);
            addbd.setStatus(StatusBdi.ENVIADO);
            this.result.redirectTo(BancoIdeiaController.class).addideia();
            this.result.include("mensagem", "Cadastrado com sucesso");
        } catch (Exception e) {
            this.result.include("mensagemFalha", "Erro ao cadastras as informações.");
        }
    }
}

//
//
//@Path("/baixa/adicionar/ba/")
//    public void create(BaixaBa baixaba) {
//        try {
//            //this.result.include("mensagem", "Cadastro Baixa Off Line");
//
//            Calendar calendar = Calendar.getInstance();
//
//            baixaba.setData(calendar);
//
//            baixaba.setStatus(StatusBaixa.ENVIADO);
//
//            this.baixaDAO.cadastrar(baixaba);
//            result.include("mensagem", "Sucesso no cadastro");
//        } catch (Exception ex) {
//            //result.include("mensagemFalha", "Falha ao cadastrar " + baixa.getInstancia() + "!");
//            result.include("mensagemFalha", ex.getMessage());
//        }
//    }
//
////
////public void cadastrarideia(BancoDeIdeias addbd) {
////        try {
////            this.bancodeideias.cadastrar(addbd);
////            Calendar calendar = Calendar.getInstance();
////            addbd.setData(calendar);
////            addbd.setStatus(StatusBdi.ENVIADO);
////            this.result.redirectTo(BancoIdeiaController.class).addideia();
////            this.result.include("mensagem", "Cadastrado com sucesso");
////        } catch (Exception e) {
////            this.result.include("mensagemFalha", "Erro ao cadastras as informações.");
////        }
////    }