package com.ninthridge.schedulesdirectclient.model;

import java.util.Date;
import java.util.List;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.fasterxml.jackson.annotation.JsonFormat;

@AutoProperty
public class Status {
  
  private Account account;
  private List<Lineup> linesups;
  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssX")
  private Date lastDataUpdate;
  private List<String> notifications;
  private List<SystemStatus> systemStatus;
  private String serverID;
  private Long code;
  
  public Account getAccount() {
    return account;
  }
  public void setAccount(Account account) {
    this.account = account;
  }
  public List<Lineup> getLinesups() {
    return linesups;
  }
  public void setLinesups(List<Lineup> linesups) {
    this.linesups = linesups;
  }
  public Date getLastDataUpdate() {
    return lastDataUpdate;
  }
  public void setLastDataUpdate(Date lastDataUpdate) {
    this.lastDataUpdate = lastDataUpdate;
  }
  public List<String> getNotifications() {
    return notifications;
  }
  public void setNotifications(List<String> notifications) {
    this.notifications = notifications;
  }
  public List<SystemStatus> getSystemStatus() {
    return systemStatus;
  }
  public void setSystemStatus(List<SystemStatus> systemStatus) {
    this.systemStatus = systemStatus;
  }
  public String getServerID() {
    return serverID;
  }
  public void setServerID(String serverID) {
    this.serverID = serverID;
  }
  public Long getCode() {
    return code;
  }
  public void setCode(Long code) {
    this.code = code;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
