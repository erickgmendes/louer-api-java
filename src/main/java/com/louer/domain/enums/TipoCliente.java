package com.louer.domain.enums;

public enum TipoCliente {

    NORMAL(1, "Normal"),
    VIP(2, "Vip"),
    INADIMPLENTE(3, "Inadimplente");

    private final int id;
    private final String descricao;

    private TipoCliente(int id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }

}