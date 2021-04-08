package main.com.weather.station.beans;

import java.util.List;

public class WeatherReport {
    private String code;
    private double calcTime;
    private int cnt;
    private Town town;


    /**
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return
     */
    public double getCalcTime() {
        return calcTime;
    }

    /**
     *
     * @param calcTime
     */
    public void setCalcTime(double calcTime) {
        this.calcTime = calcTime;
    }

    /**
     *
     * @return
     */
    public int getCnt() {
        return cnt;
    }

    /**
     *
     * @param cnt
     */
    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    /**
     *
     * @return
     */
    public Town getTown() {
        return town;
    }

    /**
     *
     * @param town
     */
    public void setTownList(Town town) {
        this.town = town;
    }
}
