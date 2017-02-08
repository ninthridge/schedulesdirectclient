package com.ninthridge.schedulesdirectclient.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Description {
  
  private String descriptionLanguage;
  private String description;
  
  public String getDescriptionLanguage() {
    return descriptionLanguage;
  }
  public void setDescriptionLanguage(String descriptionLanguage) {
    this.descriptionLanguage = descriptionLanguage;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
