package com.ef.optidata.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStatus {
    PENDING("Pendiente"),
    IN_PRODUCTION("En Producción"),
    READY("Listo para Retirar"),
    DELIVERED("Entregado"),
    CANCELLED("Cancelado");

    private final String description;
}
