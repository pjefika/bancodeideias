package bancodeideias.controller.routes;

import bancodeideias.model.annotation.Admin;
import bancodeideias.model.annotation.Logado;
import javax.faces.bean.RequestScoped;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;

@Controller
@RequestScoped
public class HomeController {
	
	public HomeController() {

	}
	
        @Logado
	@Path("/")
	public void index(){
		
	}
	@Admin
	public void restrito(){
	}
}
