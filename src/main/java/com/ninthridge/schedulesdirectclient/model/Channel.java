package com.ninthridge.schedulesdirectclient.model;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class Channel {
  
  // cable / satellite
  private String stationID;
  private String channel;
  
  private Transport transport;
  
  //antenna
  private Long uhfVhf;
  private Long atscMajor;
  private Long atscMinor;
  private Long frequencyHz;
  
  // dvbc
  // private String channel;
  private String deliverySystem;
  private String modulationSystem;
  private Long symbolrate;
  private Long serviceID;
  private Long networkID;
  private Long transportID;
  
  //dvbs
  //private Long frequencyHz;
  private String polarization;
  //private String deliverySystem;
  //private String modulationSystem;
  //private Long symbolrate;
  private String fec;
  //private Long serviceID;
  //private Long networkID;
  //private Long transportID;
  
  //dvbt
  //private String channel;
  //private Long frequencyHz;
  //private Long serviceID;
  //private Long networkID;
  //private Long transportID;
  
  //qam
  //private String channel;
  private String virtualChannel;
  //private String deliverySystem;
  private Long channelMajor;
  private Long channelMinor;
  private String providerCallsign;
  private String matchType;
  
  public String getStationID() {
    return stationID;
  }
  public void setStationID(String stationID) {
    this.stationID = stationID;
  }
  public String getChannel() {
    return channel;
  }
  public void setChannel(String channel) {
    this.channel = channel;
  }
  public Long getUhfVhf() {
    return uhfVhf;
  }
  public void setUhfVhf(Long uhfVhf) {
    this.uhfVhf = uhfVhf;
  }
  public Long getAtscMajor() {
    return atscMajor;
  }
  public void setAtscMajor(Long atscMajor) {
    this.atscMajor = atscMajor;
  }
  public Long getAtscMinor() {
    return atscMinor;
  }
  public void setAtscMinor(Long atscMinor) {
    this.atscMinor = atscMinor;
  }
  public Long getFrequencyHz() {
    return frequencyHz;
  }
  public void setFrequencyHz(Long frequencyHz) {
    this.frequencyHz = frequencyHz;
  }
  public String getDeliverySystem() {
    return deliverySystem;
  }
  public void setDeliverySystem(String deliverySystem) {
    this.deliverySystem = deliverySystem;
  }
  public String getModulationSystem() {
    return modulationSystem;
  }
  public void setModulationSystem(String modulationSystem) {
    this.modulationSystem = modulationSystem;
  }
  public Long getSymbolrate() {
    return symbolrate;
  }
  public void setSymbolrate(Long symbolrate) {
    this.symbolrate = symbolrate;
  }
  public Long getServiceID() {
    return serviceID;
  }
  public void setServiceID(Long serviceID) {
    this.serviceID = serviceID;
  }
  public Long getNetworkID() {
    return networkID;
  }
  public void setNetworkID(Long networkID) {
    this.networkID = networkID;
  }
  public Long getTransportID() {
    return transportID;
  }
  public void setTransportID(Long transportID) {
    this.transportID = transportID;
  }
  public String getPolarization() {
    return polarization;
  }
  public void setPolarization(String polarization) {
    this.polarization = polarization;
  }
  public String getFec() {
    return fec;
  }
  public void setFec(String fec) {
    this.fec = fec;
  }
  public String getVirtualChannel() {
    return virtualChannel;
  }
  public void setVirtualChannel(String virtualChannel) {
    this.virtualChannel = virtualChannel;
  }
  public Long getChannelMajor() {
    return channelMajor;
  }
  public void setChannelMajor(Long channelMajor) {
    this.channelMajor = channelMajor;
  }
  public Long getChannelMinor() {
    return channelMinor;
  }
  public void setChannelMinor(Long channelMinor) {
    this.channelMinor = channelMinor;
  }
  public String getProviderCallsign() {
    return providerCallsign;
  }
  public void setProviderCallsign(String providerCallsign) {
    this.providerCallsign = providerCallsign;
  }
  public String getMatchType() {
    return matchType;
  }
  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }
  public Transport getTransport() {
    return transport;
  }
  public void setTransport(Transport transport) {
    this.transport = transport;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
