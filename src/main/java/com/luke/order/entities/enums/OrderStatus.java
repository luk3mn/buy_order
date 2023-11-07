package com.luke.order.entities.enums;

public enum OrderStatus {
    
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    // turn this code public
    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        /**
         * param: code (int): status code
         * 
         */

        // A way to range all values of order status
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code){ // valid if code is in OrderStatus enum
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Order Status code"); // if code doesn't found
    }
}
