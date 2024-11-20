package com.fernandogreca.palavra.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PalavraModel {
    
    private String palavra;
    private String descricao;
    private String dica;

    public PalavraModel(String palavra, String descricao, String dica) {
        this.palavra = palavra;
        this.descricao = descricao;
        this.dica = dica;
    }
}
