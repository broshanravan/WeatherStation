package main.com.weather.station.beans;

public class Town {
    private long id;
    private String name;
    private Coordinate coordinate;
    private Rain rain;
    private MainDetail mainDetail;

    /**
     * retrieves the value for id
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     * sets the value for id
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * retrieves the value for name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * sets the value for name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * retrieves the value for Coordinate
     * @return
     */
    public Coordinate getCoordinate() {
        return coordinate;
    }

    /**
     * sets the value for Coordinate
     * @param coordinate
     */
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * retrieves the value for Rain
     * @return
     */
    public Rain getRain() {
        return rain;
    }

    /**
     * sets the value for Rain
     * @param rain
     */
    public void setRain(Rain rain) {
        this.rain = rain;
    }

    /**
     * retrieves the value for MainDetail
     * @return
     */
    public MainDetail getMainDetail() {
        return mainDetail;
    }

    /**
     *  setss the value for MainDetail
     * @param mainDetail
     */
    public void setMainDetail(MainDetail mainDetail) {
        this.mainDetail = mainDetail;
    }
}
