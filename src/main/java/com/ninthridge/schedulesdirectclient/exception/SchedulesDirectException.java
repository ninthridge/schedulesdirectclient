package com.ninthridge.schedulesdirectclient.exception;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SchedulesDirectException extends Exception {

  private static final long serialVersionUID = 1L;

  private String response;
  private Integer code;
  private String serverID;
  private String message;
  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssX")
  private Date datetime;
  
  public String getResponse() {
    return response;
  }
  public void setResponse(String response) {
    this.response = response;
  }
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }
  public String getServerID() {
    return serverID;
  }
  public void setServerID(String serverID) {
    this.serverID = serverID;
  }
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  public Date getDatetime() {
    return datetime;
  }
  public void setDatetime(Date datetime) {
    this.datetime = datetime;
  }
  
  
}
