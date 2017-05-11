package bancodeideias.controller.intercepter;

import bancodeideias.controller.auth.SessionUsuarioEfika;
import bancodeideias.controller.auth.UsuarioController;
import bancodeideias.model.annotation.Logado;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.interceptor.AcceptsWithAnnotations;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@Intercepts
@RequestScoped
@AcceptsWithAnnotations(Logado.class)
public class LogadoInterceper {

    @Inject
    private Result result;

    @Inject
    private SessionUsuarioEfika session;

    /**
     * @deprecated CDI eyes only
     */
    protected LogadoInterceper() {

    }

    @Inject
    public LogadoInterceper(SessionUsuarioEfika session) {
        this.session = session;
    }

    @AroundCall
    public void around(SimpleInterceptorStack stack) {
        if (session.getUsuario() != null) {
            stack.next();
        } else {
            result.forwardTo(UsuarioController.class).create();
        }
    }

}
