package main.com.weather.station.data;

import main.com.weather.station.beans.Town;

import java.util.List;

public interface WeatherReportOrganizer {
    public List<Town> getTownsWithStartingLetter(String letter);
}
