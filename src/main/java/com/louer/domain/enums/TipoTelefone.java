package com.louer.domain.enums;

public enum TipoTelefone {

    RESIDENCIAL(1, ""),
    CELULAR(2, ""),
    COMERCIAL(3, "");

    private final int id;
    private final String descricao;

    private TipoTelefone(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

}
