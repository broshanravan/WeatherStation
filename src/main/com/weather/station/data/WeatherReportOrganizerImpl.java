package main.com.weather.station.data;

import main.com.weather.station.beans.MainDetail;
import main.com.weather.station.beans.Town;
import main.com.weather.station.beans.WeatherReport;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;

public class WeatherReportOrganizerImpl {


    @Autowired
    WeatherJSONAnalyserImpl weatherJSONAnalyserImpl;

    String URL = "https://samples.openweathermap.org/data/2.5/box/city?bbox=12,32,15,37,10&appid=b6907d289e10d714a6e88b30761fae22.";

    public List<Town> getTownsWithStartingLetter(String firstLetter){

        List<Town> townList = new LinkedList<Town>();
        try {
            List<WeatherReport> reportListList = weatherJSONAnalyserImpl.readJsonFromUrl(URL);
            for(WeatherReport weatherReport: reportListList){
                Town town = weatherReport.getTown();
                String name = town.getName();
                if(name.substring(0,1).equalsIgnoreCase(firstLetter)) {
                    townList.add(town);
                }
            }
        }catch (MalformedURLException mfe){
            mfe.printStackTrace();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }




        return townList;
    }
}
