package bancodeideias.model.entitiy;

import java.util.List;

public interface InterfaceDAO<T> {

    public T cadastrar(T t);

    public T editar(T t);

    public void excluir(T t);

    public List<T> listar();

}
