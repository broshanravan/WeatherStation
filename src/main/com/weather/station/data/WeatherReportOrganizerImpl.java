package main.com.weather.station.data;

import main.com.weather.station.beans.MainDetail;
import main.com.weather.station.beans.Town;
import main.com.weather.station.beans.WeatherReport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.List;

public class WeatherReportOrganizerImpl {

    @Autowired
    WeatherJSONAnalyserImpl weatherJSONAnalyserImpl;

    public List<Town> getTownsWithStartingLetter(String firstLetter){

        List<Town> townList = new LinkedList<Town>();
        List<WeatherReport> reportListList = weatherJSONAnalyserImpl.getRecordFromJSON();

        for(WeatherReport weatherReport: reportListList){
            Town town = weatherReport.getTown();
            String name = town.getName();
            if(name.substring(0,1).equalsIgnoreCase(firstLetter)) {
                townList.add(town);
            }
        }


        return townList;
    }
}
