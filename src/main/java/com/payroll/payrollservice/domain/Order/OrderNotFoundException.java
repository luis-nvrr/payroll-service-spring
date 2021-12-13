package com.payroll.payrollservice.domain.Order;

public class OrderNotFoundException extends RuntimeException {
  public OrderNotFoundException(Long id) {
    super("Could not find order" + id);
  }

}
