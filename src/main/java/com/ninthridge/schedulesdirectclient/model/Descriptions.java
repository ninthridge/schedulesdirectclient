package com.ninthridge.schedulesdirectclient.model;

import java.util.List;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Descriptions {
  
  private List<Description> description1000;
  private List<Description> description100;
  
  public List<Description> getDescription1000() {
    return description1000;
  }
  public void setDescription1000(List<Description> description1000) {
    this.description1000 = description1000;
  }
  public List<Description> getDescription100() {
    return description100;
  }
  public void setDescription100(List<Description> description100) {
    this.description100 = description100;
  }

  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
