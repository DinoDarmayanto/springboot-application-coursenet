package com.coursenet;

import java.util.List;

import com.coursenet.model.OrderDTO;

public interface OrderService {
    void createNewOrder(String name, String user);
    List<OrderDTO> getOrderList();
    OrderDTO getOrder(Long orderId);
}
