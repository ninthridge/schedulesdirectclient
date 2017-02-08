package com.ninthridge.schedulesdirectclient.model;

import java.util.Date;
import java.util.List;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@AutoProperty
public class Airing {
  
  private String programID;
  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssX")
  private Date airDateTime;
  private Long duration;
  private String md5;
  
  @JsonProperty(value = "new")
  private Boolean newAiring;
  private List<String> audioProperties;
  private List<String> videoProperties;
  private List<Rating> ratings;
  
  public String getProgramID() {
    return programID;
  }
  public void setProgramID(String programID) {
    this.programID = programID;
  }
  public Date getAirDateTime() {
    return airDateTime;
  }
  public void setAirDateTime(Date airDateTime) {
    this.airDateTime = airDateTime;
  }
  public Long getDuration() {
    return duration;
  }
  public void setDuration(Long duration) {
    this.duration = duration;
  }
  public String getMd5() {
    return md5;
  }
  public void setMd5(String md5) {
    this.md5 = md5;
  }
  public Boolean getNewAiring() {
    return newAiring;
  }
  public void setNewAiring(Boolean newAiring) {
    this.newAiring = newAiring;
  }
  public List<String> getAudioProperties() {
    return audioProperties;
  }
  public void setAudioProperties(List<String> audioProperties) {
    this.audioProperties = audioProperties;
  }
  public List<String> getVideoProperties() {
    return videoProperties;
  }
  public void setVideoProperties(List<String> videoProperties) {
    this.videoProperties = videoProperties;
  }
  public List<Rating> getRatings() {
    return ratings;
  }
  public void setRatings(List<Rating> ratings) {
    this.ratings = ratings;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
