package com.ninthridge.schedulesdirectclient.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.fasterxml.jackson.annotation.JsonValue;

@AutoProperty
public enum Transport {
  Antenna("Antenna"),
  Cable("Cable"),
  DVBC("DVB-C"),
  DVBS("DVB-S"),
  DVBT("DVB-T"),
  QAM("QAM"),
  Satellite("Satellite");
  
  private final String name;
  
  Transport(String name) { 
    this.name = name; 
  }
  
  @JsonValue
  public String getName() {
    return name;
  }
  
  public static Transport fromName(String name) {
    for(Transport transport : Transport.values()) {
      if(transport.getName().equalsIgnoreCase(name)) {
        return transport;
      }
    }
    return null;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
