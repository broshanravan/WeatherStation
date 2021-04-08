package main.com.weather.station.beans;

public class MainDetail {
    private double temperature ;
    private double temperatureMin;
    private double temperatureMax;
    private double pressure;
    private double seaLevel;
    private double groundLevel;
    private double humidity;

    public MainDetail(double temperature, double temperatureMin, double temperatureMax, double pressure, double seaLevel, double groundLevel, double humidity) {
        this.temperature = temperature;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
        this.pressure = pressure;
        this.seaLevel = seaLevel;
        this.groundLevel = groundLevel;
        this.humidity = humidity;
    }

    public MainDetail(){

    }

    /**
     * Retrieves the value for temperature
     * @return
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Sets the value for temperature
     * @param temperature
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Retrieves the value for temperatureMin
     * @return
     */
    public double getTemperatureMin() {
        return temperatureMin;
    }

    /**
     * Sets the value for temperatureMin
     * @param temperatureMin
     */
    public void setTemperatureMin(double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    /**
     * Retrieves the value for temperatureMax
     * @return
     */
    public double getTemperatureMax() {
        return temperatureMax;
    }

    /**
     * Sets the value for temperatureMax
     * @param temperatureMax
     */
    public void setTemperatureMax(double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    /**
     * Retrieves the value for pressure
     * @return
     */
    public double getPressure() {
        return pressure;
    }

    /**
     * Sets the value for pressure
     * @param pressure
     */
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    /**
     * Retrieves the value for seaLevel
     * @return
     */
    public double getSeaLevel() {
        return seaLevel;
    }

    /**
     * Sets the value for seaLevel
     * @param seaLevel
     */
    public void setSeaLevel(double seaLevel) {
        this.seaLevel = seaLevel;
    }

    /**
     * Retrieves the value for groundLevel
     * @return
     */
    public double getGroundLevel() {
        return groundLevel;
    }

    /**
     * Sets the value for groundLevel
     * @param groundLevel
     */
    public void setGroundLevel(double groundLevel) {
        this.groundLevel = groundLevel;
    }

    /**
     * Retrieves the value for humidity
     * @return
     */
    public double getHumidity() {
        return humidity;
    }

    /**
     * Sets the value for humidity
     * @param humidity
     */
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }


    //"temp": 9.68, "temp_min": 9.681, "temp_max": 9.681, "pressure": 961.02, "sea_level": 1036.82, "grnd_level": 961.02, "humidity": 85
}
