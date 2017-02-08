package com.ninthridge.schedulesdirectclient.model;

import java.util.List;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Station {
  
  private List<Channel> channels;
  private String stationID;
  private String name;
  private String callsign;
  private String affiliate;
  private List<String> broadcastLanguage;
  private List<String> descriptionLanguage;
  private Broadcaster broadcaster;
  private Boolean isCommercialFree;
  private Logo logo;
  
  public String getStationID() {
    return stationID;
  }
  public void setStationID(String stationID) {
    this.stationID = stationID;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getCallsign() {
    return callsign;
  }
  public void setCallsign(String callsign) {
    this.callsign = callsign;
  }
  public String getAffiliate() {
    return affiliate;
  }
  public void setAffiliate(String affiliate) {
    this.affiliate = affiliate;
  }
  public List<String> getBroadcastLanguage() {
    return broadcastLanguage;
  }
  public void setBroadcastLanguage(List<String> broadcastLanguage) {
    this.broadcastLanguage = broadcastLanguage;
  }
  public List<String> getDescriptionLanguage() {
    return descriptionLanguage;
  }
  public void setDescriptionLanguage(List<String> descriptionLanguage) {
    this.descriptionLanguage = descriptionLanguage;
  }
  public Broadcaster getBroadcaster() {
    return broadcaster;
  }
  public void setBroadcaster(Broadcaster broadcaster) {
    this.broadcaster = broadcaster;
  }
  public Boolean getIsCommercialFree() {
    return isCommercialFree;
  }
  public void setIsCommercialFree(Boolean isCommercialFree) {
    this.isCommercialFree = isCommercialFree;
  }
  public Logo getLogo() {
    return logo;
  }
  public void setLogo(Logo logo) {
    this.logo = logo;
  }
  public List<Channel> getChannels() {
    return channels;
  }
  public void setChannels(List<Channel> channels) {
    this.channels = channels;
  }
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
