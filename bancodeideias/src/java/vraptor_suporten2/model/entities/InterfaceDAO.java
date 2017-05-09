package vraptor_suporten2.model.entities;

public interface InterfaceDAO<T> {
    
    public T cadastrar(T t);
    
    public T editar(T t);
    
    public void excluir(T t);
    
}
