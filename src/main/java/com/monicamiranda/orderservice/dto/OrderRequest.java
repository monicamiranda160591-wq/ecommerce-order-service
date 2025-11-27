package com.monicamiranda.orderservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

public class OrderRequest {

  @NotNull(message = "{order.productId.notnull}")
  @Positive(message = "{order.productId.positive}")
  private Long productId;

  @NotNull(message = "{order.quantity.notnull}")
  @Positive(message = "{order.quantity.positive}")
  @Max(value = 100, message = "{order.quantity.max}")
  private Integer quantity;

  @NotBlank(message = "{order.customerName.notblank}")
  @Size(min = 3, max = 100, message = "{order.customerName.size}")
  private String customerName;

  @NotBlank(message = "{order.customerEmail.notblank}")
  @Email(message = "{order.customerEmail.email}")
  private String customerEmail;

  @NotNull(message = "{order.totalAmount.notnull}")
  @Positive(message = "{order.totalAmount.positive}")
  private BigDecimal totalAmount;

  // Getters y Setters
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }
}
