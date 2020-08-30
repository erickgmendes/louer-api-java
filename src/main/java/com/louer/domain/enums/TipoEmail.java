package com.louer.domain.enums;

public enum TipoEmail {
    PESSOAL(1, "Pessoal"),
    COMERCIAL(2, "Comercial");

    private final int id;
    private final String descricao;

    private TipoEmail(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }
}
