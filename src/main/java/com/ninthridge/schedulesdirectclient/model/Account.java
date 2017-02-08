package com.ninthridge.schedulesdirectclient.model;

import java.util.Date;
import java.util.List;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.fasterxml.jackson.annotation.JsonFormat;

@AutoProperty
public class Account {
  
  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ssX")
  private Date expires;
  private List<String> messages;
  private Long maxLineups;
  
  public Date getExpires() {
    return expires;
  }
  public void setExpires(Date expires) {
    this.expires = expires;
  }
  public List<String> getMessages() {
    return messages;
  }
  public void setMessages(List<String> messages) {
    this.messages = messages;
  }
  public Long getMaxLineups() {
    return maxLineups;
  }
  public void setMaxLineups(Long maxLineups) {
    this.maxLineups = maxLineups;
  }
  
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
