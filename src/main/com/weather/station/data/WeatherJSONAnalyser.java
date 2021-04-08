package main.com.weather.station.data;

import main.com.weather.station.beans.MainDetail;

import java.util.List;

public interface WeatherJSONAnalyser {
    public List<MainDetail> getRecordFromJSON();
}
