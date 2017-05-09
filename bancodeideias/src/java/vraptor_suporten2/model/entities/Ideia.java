package vraptor_suporten2.model.entities;

import java.util.List;

import javax.persistence.Lob;

public class Ideia {
    
    private String loginCriador;
    
    @Lob
    private String descricao;
    
    @Lob
    private String ganhos;
    
    @Lob
    private String descComo; 
    
    private List<Curtida> curtidas;
    
    public Ideia() {
        super();
    }
}
