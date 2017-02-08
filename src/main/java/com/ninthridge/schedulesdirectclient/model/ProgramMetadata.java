package com.ninthridge.schedulesdirectclient.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

@AutoProperty
public class ProgramMetadata {

  @JsonProperty(value="Gracenote")
  private Gracenote gracenote;
  
  public Gracenote getGracenote() {
    return gracenote;
  }
  public void setGracenote(Gracenote gracenote) {
    this.gracenote = gracenote;
  }

  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
