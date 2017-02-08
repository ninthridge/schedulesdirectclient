package com.ninthridge.schedulesdirectclient.model;

import java.util.List;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Lineups {
  private List<Lineup> lineups;

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
