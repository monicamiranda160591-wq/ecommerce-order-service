package com.monicamiranda.orderservice.mapper;

import com.monicamiranda.orderservice.dto.OrderRequest;
import com.monicamiranda.orderservice.dto.OrderResponse;
import com.monicamiranda.orderservice.kafka.event.OrderPlacedEvent;
import com.monicamiranda.orderservice.model.Order;

public class OrderMapper {

  private OrderMapper() {
    throw new AssertionError("Utility class, no debe instanciarse");
  }

  public static OrderResponse toResponse(Order order) {
    /*return new OrderResponse(
        order.getId(),
        order.getProductId(),
        order.getQuantity(),
        order.getCustomerName(),
        order.getCustomerEmail(),
        order.getTotalAmount(),
        order.getTotalAmount(),
        order.getCreatedAt()
    );*/
    OrderResponse response = new OrderResponse();
    response.setId(order.getId());
    response.setProductId(order.getProductId());
    response.setQuantity(order.getQuantity());
    response.setCustomerName(order.getCustomerName());
    response.setCustomerEmail(order.getCustomerEmail());
    response.setTotalAmount(order.getTotalAmount());
    response.setStatus(order.getStatus());
    response.setCreatedAt(order.getCreatedAt());
    return response;
  }


  public static Order toEntity(OrderRequest request, Order order) {
    order.setProductId(request.getProductId());
    order.setQuantity(request.getQuantity());
    order.setCustomerName(request.getCustomerName());
    order.setCustomerEmail(request.getCustomerEmail());
    order.setTotalAmount(request.getTotalAmount());
    return order;
  }

}
