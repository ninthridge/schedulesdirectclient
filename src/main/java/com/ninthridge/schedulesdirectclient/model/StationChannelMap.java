package com.ninthridge.schedulesdirectclient.model;

import java.util.List;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class StationChannelMap {
  private List<Channel> map;
  private List<Station> stations;
  
  public List<Channel> getMap() {
    return map;
  }
  public void setMap(List<Channel> map) {
    this.map = map;
  }
  public List<Station> getStations() {
    return stations;
  }
  public void setStations(List<Station> stations) {
    this.stations = stations;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
