package com.ninthridge.schedulesdirectclient.model;

import java.util.List;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

@AutoProperty
public class Schedule {
  
  private String stationID;
  private ScheduleMetadata metadata;
  @JsonProperty(value="programs")
  private List<Airing> airings;
  
  public String getStationID() {
    return stationID;
  }
  public void setStationID(String stationID) {
    this.stationID = stationID;
  }
  public ScheduleMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(ScheduleMetadata metadata) {
    this.metadata = metadata;
  }
  public List<Airing> getAirings() {
    return airings;
  }
  public void setAirings(List<Airing> airings) {
    this.airings = airings;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
