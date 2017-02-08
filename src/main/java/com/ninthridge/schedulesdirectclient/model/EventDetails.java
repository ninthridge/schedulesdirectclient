package com.ninthridge.schedulesdirectclient.model;

import java.util.Date;
import java.util.List;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.fasterxml.jackson.annotation.JsonFormat;

@AutoProperty
public class EventDetails {
  private String venue100;
  private List<Team> teams;
  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
  private Date gameDate;
  
  public String getVenue100() {
    return venue100;
  }
  public void setVenue100(String venue100) {
    this.venue100 = venue100;
  }
  public List<Team> getTeams() {
    return teams;
  }
  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }
  public Date getGameDate() {
    return gameDate;
  }
  public void setGameDate(Date gameDate) {
    this.gameDate = gameDate;
  }

  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
