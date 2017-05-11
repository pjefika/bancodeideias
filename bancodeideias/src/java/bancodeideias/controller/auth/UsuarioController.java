package bancodeideias.controller.auth;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import bancodeideias.controller.routes.HomeController;
import bancodeideias.dal.webservice.EfikaUsersProxy;
import bancodeideias.dal.webservice.Usuario;

@Controller
@RequestScoped
public class UsuarioController {

	@Inject
    private Result result;
	
	@Inject
    private SessionUsuarioEfika session;
    
    private EfikaUsersProxy ws;    
	
    public UsuarioController() {

    }
    
	public void create(){
	}
	
	public void login(Usuario u){
		
		try {
			
			ws = new EfikaUsersProxy();
			
			if(ws.autenticarUsuario(u.getLogin(), u.getSenha())){
				
				u = ws.consultarUsuario(u.getLogin());
				session.setUsuario(u);
				result.redirectTo(HomeController.class).index();
				
			}else{
				
				result.include("mensagemFalha", "Credênciais incorrentas.");
				result.forwardTo(this).create();
			}
			
		} catch (Exception e) {
			
			result.include("mensagemFalha", e.getMessage());
			result.forwardTo(this).create();
		}
	}
	
	public void restrito() {
		result.include("mensagem", "Acesso restrito!");
	}
	
	public void logout(){
		session.setUsuario(new Usuario());
		result.forwardTo(UsuarioController.class).create();
	}
	
}
