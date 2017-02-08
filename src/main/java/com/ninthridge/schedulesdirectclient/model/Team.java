package com.ninthridge.schedulesdirectclient.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Team {
  private String name;
  private Boolean isHome;
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Boolean getIsHome() {
    return isHome;
  }
  public void setIsHome(Boolean isHome) {
    this.isHome = isHome;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
