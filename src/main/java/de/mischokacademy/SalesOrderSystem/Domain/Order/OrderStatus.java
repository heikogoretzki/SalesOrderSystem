package de.mischokacademy.SalesOrderSystem.Domain.Order;

public enum OrderStatus {
    CREATE(0),
    SHIPPING(1),
    DELIVERED(2),
    PAID(3),
    ;

    OrderStatus(int i) {

    }
}
