package main.com.weather.station.controllers;

import main.com.weather.station.beans.Town;
import main.com.weather.station.data.WeatherJSONAnalyserImpl;
import main.com.weather.station.data.WeatherReportOrganizerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class WeatherStationController {

    @Autowired
    WeatherReportOrganizerImpl weatherReportOrganizer;

    /**
     * Controller function to get list of towns
     * Starting with a particular letter
     * @param startingLetter
     * @param model
     * @return
     */
    @RequestMapping(value="/towsList", params="towns.do",method= RequestMethod.POST)
    @ResponseBody
    public String retrieveExistingBooking(@RequestParam String startingLetter, ModelMap model){

     List<Town>  townList =  weatherReportOrganizer.getTownsWithStartingLetter(startingLetter);
     model.put("townList",townList);

     return "towns";
    }

}
