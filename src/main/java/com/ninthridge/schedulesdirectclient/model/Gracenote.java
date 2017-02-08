package com.ninthridge.schedulesdirectclient.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Gracenote {

  private Integer season;
  private Integer episode;
  
  public Integer getSeason() {
    return season;
  }
  public void setSeason(Integer season) {
    this.season = season;
  }
  public Integer getEpisode() {
    return episode;
  }
  public void setEpisode(Integer episode) {
    this.episode = episode;
  }

  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
