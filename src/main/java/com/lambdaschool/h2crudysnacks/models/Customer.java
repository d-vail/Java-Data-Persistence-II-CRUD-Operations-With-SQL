package com.lambdaschool.h2crudysnacks.models;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(nullable = false)
  private String name;

  private double cashonhand;

  /**
   * Default Constructor
   */
  public Customer() {}

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCashonhand() {
    return cashonhand;
  }

  public void setCashonhand(double cashonhand) {
    this.cashonhand = cashonhand;
  }
}
