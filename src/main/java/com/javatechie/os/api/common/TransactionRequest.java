package com.javatechie.os.api.common;

import com.javatechie.os.api.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionRequest {

    private Order order;
    private Payment payment;
}
