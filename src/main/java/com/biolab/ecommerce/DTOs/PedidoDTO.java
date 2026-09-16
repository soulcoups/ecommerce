package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entities.StatusPedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {

    private long id;
    private Instant momento;
    private StatusPedido status;
    private Long idcliente;

    public PedidoDTO(Long idcliente) {
        this.momento = Instant.now();
        this.status = StatusPedido.CRIANDO_PEDIDO;
        this.idcliente = idcliente;
    }
}
