package com.ninthridge.schedulesdirectclient.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Rating {
  
  private String body;
  private String code;
  
  public String getBody() {
    return body;
  }
  public void setBody(String body) {
    this.body = body;
  }
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
