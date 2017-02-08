package com.ninthridge.schedulesdirectclient.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.fasterxml.jackson.annotation.JsonFormat;

@AutoProperty
public class Program {
  
  private String programID;
  private List<Title> titles;
  private EventDetails eventDetails;
  private Descriptions descriptions;
  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
  private Date originalAirDate;
  private List<String> genres;
  private String episodeTitle150;
  private List<ProgramMetadata> metadata;
  private List<Person> cast;
  private List<Person> crew;
  private String entityType;
  private String showType;
  private Boolean hasImageArtwork;
  private String md5;
  private Map<String, List<String>> keyWords;
  
  public String getProgramID() {
    return programID;
  }
  public void setProgramID(String programID) {
    this.programID = programID;
  }
  public List<Title> getTitles() {
    return titles;
  }
  public void setTitles(List<Title> titles) {
    this.titles = titles;
  }
  public EventDetails getEventDetails() {
    return eventDetails;
  }
  public void setEventDetails(EventDetails eventDetails) {
    this.eventDetails = eventDetails;
  }
  public Descriptions getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(Descriptions descriptions) {
    this.descriptions = descriptions;
  }
  public Date getOriginalAirDate() {
    return originalAirDate;
  }
  public void setOriginalAirDate(Date originalAirDate) {
    this.originalAirDate = originalAirDate;
  }
  public List<String> getGenres() {
    return genres;
  }
  public void setGenres(List<String> genres) {
    this.genres = genres;
  }
  public String getEpisodeTitle150() {
    return episodeTitle150;
  }
  public void setEpisodeTitle150(String episodeTitle150) {
    this.episodeTitle150 = episodeTitle150;
  }
  public List<ProgramMetadata> getMetadata() {
    return metadata;
  }
  public void setMetadata(List<ProgramMetadata> metadata) {
    this.metadata = metadata;
  }
  public List<Person> getCast() {
    return cast;
  }
  public void setCast(List<Person> cast) {
    this.cast = cast;
  }
  public List<Person> getCrew() {
    return crew;
  }
  public void setCrew(List<Person> crew) {
    this.crew = crew;
  }
  public String getShowType() {
    return showType;
  }
  public void setShowType(String showType) {
    this.showType = showType;
  }
  public Boolean getHasImageArtwork() {
    return hasImageArtwork;
  }
  public void setHasImageArtwork(Boolean hasImageArtwork) {
    this.hasImageArtwork = hasImageArtwork;
  }
  public String getMd5() {
    return md5;
  }
  public void setMd5(String md5) {
    this.md5 = md5;
  }
  public String getEntityType() {
    return entityType;
  }
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }
  public Map<String, List<String>> getKeyWords() {
    return keyWords;
  }
  public void setKeyWords(Map<String, List<String>> keyWords) {
    this.keyWords = keyWords;
  }
  @Override
  public String toString() {
    return Pojomatic.toString(this);
  }
}
