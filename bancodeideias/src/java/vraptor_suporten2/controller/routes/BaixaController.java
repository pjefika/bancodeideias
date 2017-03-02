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
import vraptor_suporten2.dal.BaixaDAO;
import vraptor_suporten2.model.entities.BaixaBa;
import vraptor_suporten2.model.entities.BaixaTt;
import vraptor_suporten2.model.entities.StatusBdi;

/**
 *
 * @author G0025381
 */
@Controller
public class BaixaController extends AbstractCrudController {

    @Inject
    private BaixaDAO baixaDAO;

    public BaixaController() {
    }

    @Path("/baixa/")
    public void create() {

    }
    @Path("/buscaba/")
    public void buscaba() {

    }

    @Path("/baixa/addba/")
    public void addBA() {

    }
    @Path("/index/")
    public void index() {

    }

    @Path("/baixa/addtt/")
    public void addTT() {

    }

    @Path("/baixa/backoffice/")
    public void backOffice() {

    }

    @Path("/baixa/backoffice/backlistba/")
    public void backlistba() {
        this.listarBA();
        this.status();
    }
    
    @Path("/baixa/backoffice/backlisttt/")
    public void backlisttt() {
        this.listarTT();
        this.status();
    }

    @Path("/baixa/adicionar/ba/")
    public void create(BaixaBa baixaba) {
        try {
            //this.result.include("mensagem", "Cadastro Baixa Off Line");

            Calendar calendar = Calendar.getInstance();

            baixaba.setData(calendar);

            baixaba.setStatus(StatusBdi.ENVIADO);

            this.baixaDAO.cadastrar(baixaba);
            result.include("mensagem", "Sucesso no cadastro");
        } catch (Exception ex) {
            //result.include("mensagemFalha", "Falha ao cadastrar " + baixa.getInstancia() + "!");
            result.include("mensagemFalha", ex.getMessage());
        }
    }

    @Path("/baixa/adicionar/tt/")
    public void create(BaixaTt baixatt) {
        try {
            //this.result.include("mensagem", "Cadastro Baixa Off Line");

            Calendar calendar = Calendar.getInstance();

            baixatt.setData(calendar);

            baixatt.setStatus(StatusBdi.ENVIADO);

            this.baixaDAO.cadastrar(baixatt);
            result.include("mensagem", "Sucesso no cadastro");
        } catch (Exception ex) {
            //result.include("mensagemFalha", "Falha ao cadastrar " + baixa.getInstancia() + "!");
            result.include("mensagemFalha", ex.getMessage());
        }
    }

    /**
     *
     */
    public void listarBA() {
        try {
            List<BaixaBa> l = this.baixaDAO.listarporstatus();
            result.include("listastatus", l);

        } catch (Exception e) {

            List<BaixaBa> l = new ArrayList<>();

        }
    }

    public void listarTT() {
        try {
            List<BaixaTt> l = this.baixaDAO.listarporstatus1();
            result.include("listastatus1", l);

        } catch (Exception e) {

            List<BaixaBa> l = new ArrayList<>();

        }

    }

    @Path("mod/status/ba/{baixaBa.id}")
    public void modificstatusba(BaixaBa bb) {
        try {
            this.baixaDAO.editar(bb);
            this.result.include("mensagem", "Status modificado com sucesso");
        } catch (Exception e) {
            this.result.include("mensagemFalha", "erro ao modificar");
        }
    }

    public void modificstatustt(BaixaTt bb) {
        try {
            this.baixaDAO.editar(bb);
            this.result.include("mensagem", "Status modificado com sucesso");
        } catch (Exception e) {
            this.result.include("mensagemFalha", "erro ao modificar");
        }
    }

    public void status() {
        result.include("todosStatus", StatusBdi.values());
    }

    public void listar() {
        listarBA();
        listarTT();

    }

    @Path("baixa/backoffice/backlistba1/{id}")
    public void backlist(Long id) throws Exception {
        BaixaBa b = baixaDAO.buscaPorId(id);
        b.setStatus(StatusBdi.ANALISE);
        baixaDAO.editar(b);
        result.include("resultado", b);
        StatusBdi[] listaBaixa = StatusBdi.values();
        result.include("StatusBaixa", listaBaixa);

    }

    public void update(BaixaBa m) {

        validation.onErrorForwardTo(this).create();

        BaixaBa tratada1 = (BaixaBa) baixaDAO.buscaPorId(m.getId());
        tratada1.setStatus(m.getStatus());

        try {
            baixaDAO.editar(tratada1);
            result.redirectTo(BaixaController.class).backlistba();
        } catch (Exception ex) {
            Logger.getLogger(BaixaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
}
