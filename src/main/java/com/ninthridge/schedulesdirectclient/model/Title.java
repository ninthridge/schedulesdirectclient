package com.ninthridge.schedulesdirectclient.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Title {
  private String title120;

  public String getTitle120() {
    return title120;
  }

  public void setTitle120(String title120) {
    this.title120 = title120;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
