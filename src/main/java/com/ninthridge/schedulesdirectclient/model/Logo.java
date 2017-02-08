package com.ninthridge.schedulesdirectclient.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

@AutoProperty
public class Logo {
  
  @JsonProperty(value="URL")
  private String url;
  private Long height;
  private Long width;
  private String md5;
  
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }
  public Long getHeight() {
    return height;
  }
  public void setHeight(Long height) {
    this.height = height;
  }
  public Long getWidth() {
    return width;
  }
  public void setWidth(Long width) {
    this.width = width;
  }
  public String getMd5() {
    return md5;
  }
  public void setMd5(String md5) {
    this.md5 = md5;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
