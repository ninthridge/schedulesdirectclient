package com.ninthridge.schedulesdirectclient;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ninthridge.schedulesdirectclient.exception.SchedulesDirectException;
import com.ninthridge.schedulesdirectclient.model.Channel;
import com.ninthridge.schedulesdirectclient.model.Headend;
import com.ninthridge.schedulesdirectclient.model.Lineup;
import com.ninthridge.schedulesdirectclient.model.Lineups;
import com.ninthridge.schedulesdirectclient.model.Program;
import com.ninthridge.schedulesdirectclient.model.Schedule;
import com.ninthridge.schedulesdirectclient.model.Station;
import com.ninthridge.schedulesdirectclient.model.StationChannelMap;
import com.ninthridge.schedulesdirectclient.model.Status;
import com.ninthridge.schedulesdirectclient.model.Token;

public class SdClient {

  public static String HOST = "json.schedulesdirect.org";
  public static String API_VERSION = "20141201";
  public static String USER_AGENT = "com.ninthridge.schedulesdirectclient";
  
  private static ObjectMapper objectMapper;
  
  static {
    objectMapper = new ObjectMapper();
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }
  
  public static Token requestToken(String username, String password) throws SchedulesDirectException, IOException {
    Map<String, String> requestBodyObj = new HashMap<>();
    requestBodyObj.put("username", username);
    requestBodyObj.put("password", DigestUtils.sha1Hex(password));
    
    HttpResponse response = Request.Post("https://" + HOST + "/" + API_VERSION + "/token")
        .userAgent(USER_AGENT)
        .bodyString(objectMapper.writeValueAsString(requestBodyObj), ContentType.APPLICATION_JSON)
        .execute().returnResponse();

    int statusCode = response.getStatusLine().getStatusCode();
    String body = EntityUtils.toString(response.getEntity());
    
    if(statusCode != 200) {
      SchedulesDirectException exception = objectMapper.readValue(body, SchedulesDirectException.class);
      throw exception;
    }
    else {
      Date date = new Date();
      Token token = objectMapper.readValue(body, Token.class);
      token.setCreatedDate(date);
      return token;
    }
  }

  public static Status getStatus(Token token) throws SchedulesDirectException, IOException {
    HttpResponse response = Request.Get("https://" + HOST + "/" + API_VERSION + "/status")
        .userAgent(USER_AGENT)
        .addHeader("token", token.getToken())
        .execute().returnResponse();

    int statusCode = response.getStatusLine().getStatusCode();
    String body = EntityUtils.toString(response.getEntity());
    
    if(statusCode != 200) {
      SchedulesDirectException exception = objectMapper.readValue(body, SchedulesDirectException.class);
      throw exception;
    }
    else {
      Status status = objectMapper.readValue(body, Status.class);
      return status;
    }
  }

  public static List<Headend> getHeadends(Token token, String countryCode, String postalCode) throws SchedulesDirectException, IOException {
    HttpResponse response = Request.Get("https://" + HOST + "/" + API_VERSION + "/headends?country=" + URLEncoder.encode(countryCode, "UTF-8") + "&postalcode=" + URLEncoder.encode(postalCode, "UTF-8"))
        .userAgent(USER_AGENT)
        .addHeader("token", token.getToken())
        .execute().returnResponse();

    int statusCode = response.getStatusLine().getStatusCode();
    String body = EntityUtils.toString(response.getEntity());
    
    if(statusCode != 200) {
      SchedulesDirectException exception = objectMapper.readValue(body, SchedulesDirectException.class);
      throw exception;
    }
    else {
      List<Headend> headEnds = objectMapper.readValue(body, new TypeReference<List<Headend>>(){});
      return headEnds;
    }
  }

  public static List<Lineup> getLineups(Token token) throws SchedulesDirectException, IOException {
    HttpResponse response = Request.Get("https://" + HOST + "/" + API_VERSION + "/lineups")
        .userAgent(USER_AGENT)
        .addHeader("token", token.getToken())
        .execute().returnResponse();

    int statusCode = response.getStatusLine().getStatusCode();
    String body = EntityUtils.toString(response.getEntity());
    
    if(statusCode != 200) {
      SchedulesDirectException exception = objectMapper.readValue(body, SchedulesDirectException.class);
      throw exception;
    }
    else {
      Lineups lineups = objectMapper.readValue(body, Lineups.class);
      return lineups.getLineups();
    }
  }

  public static void addLineup(Token token, String lineup) throws SchedulesDirectException, IOException {
    HttpResponse response = Request.Put("https://" + HOST + "/" + API_VERSION + "/lineups/" + URLEncoder.encode(lineup, "UTF-8"))
        .userAgent(USER_AGENT)
        .addHeader("token", token.getToken())
        .execute().returnResponse();

    int statusCode = response.getStatusLine().getStatusCode();
    String body = EntityUtils.toString(response.getEntity());
    
    if(statusCode != 200) {
      SchedulesDirectException exception = objectMapper.readValue(body, SchedulesDirectException.class);
      throw exception;
    }
  }

  public static void deleteLineup(Token token, String lineup) throws SchedulesDirectException, IOException {
    HttpResponse response = Request.Delete("https://" + HOST + "/" + API_VERSION + "/lineups/" + URLEncoder.encode(lineup, "UTF-8"))
        .userAgent(USER_AGENT)
        .addHeader("token", token.getToken())
        .execute().returnResponse();

    int statusCode = response.getStatusLine().getStatusCode();
    String body = EntityUtils.toString(response.getEntity());
    
    if(statusCode != 200) {
      SchedulesDirectException exception = objectMapper.readValue(body, SchedulesDirectException.class);
      throw exception;
    }
  }

  public static List<Station> getStations(Token token, Lineup lineup) throws SchedulesDirectException, IOException {
    HttpResponse response = Request.Get("https://" + HOST + "/" + API_VERSION + "/lineups/" + URLEncoder.encode(lineup.getLineup(), "UTF-8"))
        .userAgent(USER_AGENT)
        .addHeader("token", token.getToken())
        .execute().returnResponse();

    int statusCode = response.getStatusLine().getStatusCode();
    String body = EntityUtils.toString(response.getEntity());
    
    if(statusCode != 200) {
      SchedulesDirectException exception = objectMapper.readValue(body, SchedulesDirectException.class);
      throw exception;
    }
    else {
      StationChannelMap map = null;
      map = objectMapper.readValue(body, new TypeReference<StationChannelMap>(){});
      
      for(Station station : map.getStations()) {
        for(Channel channel : map.getMap()) {
          if(station.getStationID().equals(channel.getStationID())) {
            List<Channel> channels = station.getChannels();
            if(channels == null) {
              channels = new ArrayList<>();
              station.setChannels(channels);
            }
            station.getChannels().add(channel);
            channel.setTransport(lineup.getTransport());
            break;
          }
        }
      }
      
      return map.getStations();
    }
  }

  @SuppressWarnings("unchecked")
  public static List<Schedule> getSchedules(Token token, List<Station> stations) throws SchedulesDirectException, IOException {
    List<Schedule> schedules = new ArrayList<Schedule>();
    for(List<Station> splitStations : split(stations, 5000)) {
      
      List<Map<String, String>> requestBodyObj = new ArrayList<>();
      for(Station station : splitStations) {
        Map<String, String> map = new HashMap<>();
        map.put("stationID", station.getStationID());
        requestBodyObj.add(map);
      }
      
      HttpResponse response = Request.Post("https://" + HOST + "/" + API_VERSION + "/schedules")
          .userAgent(USER_AGENT)
          .addHeader("token", token.getToken())
          .bodyString(objectMapper.writeValueAsString(requestBodyObj), ContentType.APPLICATION_JSON)
          .execute().returnResponse();

      int statusCode = response.getStatusLine().getStatusCode();
      
      String body = EntityUtils.toString(response.getEntity());
      
      if(statusCode != 200) {
        SchedulesDirectException exception = objectMapper.readValue(body, SchedulesDirectException.class);
        throw exception;
      }
      else {
        schedules.addAll((List<Schedule>)objectMapper.readValue(body, new TypeReference<List<Schedule>>(){}));
        //schedules.addAll(objectMapper.readValue(body, new TypeReference<List<Schedule>>(){}));
      }
    }

    return schedules;
  }
  
  @SuppressWarnings("unchecked")
  public static List<Program> getPrograms(Token token, List<String> programIds) throws SchedulesDirectException, IOException {
    List<Program> programs = new ArrayList<Program>();
    for(List<String> progIds : split(programIds, 5000)) {
      HttpResponse response = Request.Post("https://" + HOST + "/" + API_VERSION + "/programs")
          .userAgent(USER_AGENT)
          .addHeader("Accept-Encoding", "deflate,gzip")
          .addHeader("token", token.getToken())
          .bodyString(objectMapper.writeValueAsString(progIds), ContentType.APPLICATION_JSON)
          .execute().returnResponse();

      int statusCode = response.getStatusLine().getStatusCode();
      String body = EntityUtils.toString(response.getEntity());
      
      if(statusCode != 200) {
        SchedulesDirectException exception = objectMapper.readValue(body, SchedulesDirectException.class);
        throw exception;
      }
      else {
        programs.addAll((List<Program>)objectMapper.readValue(body, new TypeReference<List<Program>>(){}));
      }
    }

    return programs;
  }
  
  private static <T> List<List<T>> split(List<T> objects, int size) {
    List<List<T>> split = new ArrayList<>();
    for (int i = 0; (i * size) < objects.size(); i++) {
      int start = i * size;
      int end = (i + 1) * size;
      if (end > objects.size()) {
        end = objects.size();
      }
      if (end > start) {
        split.add(objects.subList(start, end));
      }
    }
    return split;
  }
}
