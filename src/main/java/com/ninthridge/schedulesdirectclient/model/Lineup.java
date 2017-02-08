package com.ninthridge.schedulesdirectclient.model;

import java.util.Date;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.fasterxml.jackson.annotation.JsonFormat;

@AutoProperty
public class Lineup {
  
  private String lineup;
  private String name;
  private Transport transport;
  private String location;
  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssX")
  private Date modified;
  private String uri;
  
  public String getLineup() {
    return lineup;
  }
  public void setLineup(String lineup) {
    this.lineup = lineup;
  }
  public Date getModified() {
    return modified;
  }
  public void setModified(Date modified) {
    this.modified = modified;
  }
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Transport getTransport() {
    return transport;
  }
  public void setTransport(Transport transport) {
    this.transport = transport;
  }
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
