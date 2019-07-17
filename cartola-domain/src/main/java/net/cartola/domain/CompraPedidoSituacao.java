package net.cartola.domain;

/**
 * 05/11/2015 16:19:37
 * @author murilo
 */
public enum CompraPedidoSituacao {

    EM_ABERTO,
    ENTREGUE_PARCIALMENTE_ABERTO,
    ENTREGUE_PARCIALMENTE_FECHADO,
    ENTREGUE_TOTALMENTE,
    FECHADO_SEM_ENTREGA;
}
