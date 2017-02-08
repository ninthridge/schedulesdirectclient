package com.ninthridge.schedulesdirectclient.model;

import java.util.List;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Headend {
  
  private String headend;
  private String transport;
  private String location;
  private List<Lineup> lineups;
  
  public String getHeadend() {
    return headend;
  }
  public void setHeadend(String headend) {
    this.headend = headend;
  }
  public String getTransport() {
    return transport;
  }
  public void setTransport(String transport) {
    this.transport = transport;
  }
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }
  public List<Lineup> getLineups() {
    return lineups;
  }
  public void setLineups(List<Lineup> lineups) {
    this.lineups = lineups;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
