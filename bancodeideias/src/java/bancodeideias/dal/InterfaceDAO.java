package bancodeideias.dal;

import bancodeideias.model.viewmodel.Relatorio;
import java.util.List;

public interface InterfaceDAO<T> {

    public T cadastrar(T t);

    public T editar(T t);

    public void excluir(T t);

    public List<T> listar();

    public List<T> listar(Relatorio r);

}
