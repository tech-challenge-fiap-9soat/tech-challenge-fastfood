package com.techchallenge.fastfood.domain.enums;

public enum StatusPedido {
    RECEBIDO(1,"Recebido"),
    EM_PREPARACAO(2,"Em preparação"),
    PRONTO(3,"Pronto"),
    FINALIZADO(4,"Finalizado");

    private int id;
    private String descricao;

    StatusPedido(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
}
