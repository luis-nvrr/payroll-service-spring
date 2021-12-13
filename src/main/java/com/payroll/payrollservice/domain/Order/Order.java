package com.payroll.payrollservice.domain.Order;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order {
  private @Id @GeneratedValue Long id;
  private String description;
  private Status status;

  public Order() {
  }

  public Order(String description, Status status) {
    this.description = description;
    this.status = status;
  }

  public Long getId() {
    return this.id;
  }

  public String getDescription() {
    return this.description;
  }

  public Status getStatus() {
    return this.status;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setDescripton(String description) {
    this.description = description;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Order))
      return false;

    Order order = (Order) o;
    return order.id.equals(this.id)
        && order.description.equals(this.description)
        && order.status.equals(this.status);

  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.description, this.status);
  }

  @Override
  public String toString() {
    return "Order{" + "id=" + this.id + ", description='" + this.description + '\'' + ", status=" + this.status + '}';
  }
}