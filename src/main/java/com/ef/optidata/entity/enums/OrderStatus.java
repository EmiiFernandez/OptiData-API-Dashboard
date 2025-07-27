package com.ef.optidata.entity.enums;

import com.ef.optidata.config.Translator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStatus {
    PENDING("orderStatus.pending"),
    IN_PRODUCTION("orderStatus.in_production"),
    READY("orderStatus.ready"),
    DELIVERED("orderStatus.delivered"),
    CANCELLED("orderStatus.cancelled");

    private final String messageKey;

    public String getOrderStatusDescription() {
        return Translator.toLocale(this.messageKey);
    }
}
