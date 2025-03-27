package com.patterns.pedido_venda.model.builder;

import com.patterns.pedido_venda.model.PedidoVenda;

public class PedidoVendaBuilderValido {

    private PedidoVenda instancia;

    public PedidoVendaBuilderValido(PedidoVenda instancia) {
        this.instancia = instancia;
    }

    public PedidoVenda construir() {
        return this.instancia;
    }

}
