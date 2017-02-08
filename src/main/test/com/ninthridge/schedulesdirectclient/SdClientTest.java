package com.ninthridge.schedulesdirectclient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.ninthridge.schedulesdirectclient.exception.SchedulesDirectException;
import com.ninthridge.schedulesdirectclient.model.Airing;
import com.ninthridge.schedulesdirectclient.model.Lineup;
import com.ninthridge.schedulesdirectclient.model.Program;
import com.ninthridge.schedulesdirectclient.model.Schedule;
import com.ninthridge.schedulesdirectclient.model.Station;
import com.ninthridge.schedulesdirectclient.model.Token;

@Ignore
public class SdClientTest {

  private String username = "XXXXX";
  private String password = "XXXXX";
  private String lineupId = "USA-UT43414-X";
  
  @Test
  public void testClient() throws SchedulesDirectException, IOException {
    Token token = SdClient.requestToken(username, password);
    Assert.assertNotNull(token);
    Assert.assertNotNull(token.getToken());
    Assert.assertNotNull(token.getCreatedDate());
  
    List<Lineup> lineups = SdClient.getLineups(token);
    Assert.assertNotNull(lineups);
    System.out.println("lineups:" + lineups.size());
    
    Lineup lineup = null;
    for(Lineup l : lineups) {
      if(l.getLineup().equals(lineupId)) {
        lineup = l;
      }
    }
    
    Assert.assertNotNull(lineup);
    
    List<Station> stations = SdClient.getStations(token, lineups.get(0));
    Assert.assertNotNull(stations);
    Assert.assertFalse(stations.isEmpty());
    System.out.println("stations:" + stations.size());
    
    List<Schedule> schedules = SdClient.getSchedules(token, stations);
    Assert.assertNotNull(schedules);
    Assert.assertFalse(schedules.isEmpty());
    System.out.println("schedules:" + schedules.size());
    
    List<String> programIds = new ArrayList<>();
    for(Schedule schedule : schedules) {
      if(schedule.getAirings() != null) {
        System.out.println("ScheduleAirings:" + schedule.getAirings().size());
        for(Airing airing : schedule.getAirings()) {
          programIds.add(airing.getProgramID());
        }
      }
      else {
        System.out.println("ScheduleAirings: null");
      }
    }
    
    Assert.assertFalse(programIds.isEmpty());
    System.out.println("programIds:" + programIds.size());
    
    List<Program> programs = SdClient.getPrograms(token, programIds);
    Assert.assertNotNull(programs);
    Assert.assertFalse(programs.isEmpty());
    System.out.println("programs:" + programs.size());
  }
  
}
