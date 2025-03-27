package com.patterns.pedido_venda;

import com.patterns.pedido_venda.model.PedidoVenda;
import com.patterns.pedido_venda.model.builder.PedidoVendaBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class PedidoVendaApplicationTests {

	@Test
	public void deveCalcularValorTotalPedidoParaClienteVip(){

		PedidoVenda pedidoVenda = new PedidoVendaBuilder()
				.comClienteVip("João Silva")
				.comItem("Calculadora", 2, "200")
				.comItem("Mochila", 1, "200")
				.comNumero("02020")
				.construir();

		BigDecimal valorTotal = pedidoVenda.getValorTotal();
		assertEquals(new BigDecimal("576").doubleValue(), valorTotal.doubleValue(), 0.0001);
	}
}
