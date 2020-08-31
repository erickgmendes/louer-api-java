package com.louer.domain.enums;

public enum TipoPessoa {

    FISICA(1, "Física"),
    JURIDICA(2, "Jurídica");

    private final int id;
    private final String descricao;

    private TipoPessoa(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

}
