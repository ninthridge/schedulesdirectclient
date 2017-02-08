package com.ninthridge.schedulesdirectclient.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Person {
  
  private String personId;
  private String nameId;
  private String name;
  private String role;
  private String billingOrder;
  
  public String getPersonId() {
    return personId;
  }
  public void setPersonId(String personId) {
    this.personId = personId;
  }
  public String getNameId() {
    return nameId;
  }
  public void setNameId(String nameId) {
    this.nameId = nameId;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }
  public String getBillingOrder() {
    return billingOrder;
  }
  public void setBillingOrder(String billingOrder) {
    this.billingOrder = billingOrder;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
