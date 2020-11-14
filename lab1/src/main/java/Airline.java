public class Airline {
    public String destination;
    public int flightNum;
    public String airplaneType;
    public double departureTime;
    public String weekday;


    public Airline(String destination, int flightNum, String airplaneType, double departureTime, String weekday){
        this.destination = destination;
        this.flightNum = flightNum;
        this.airplaneType = airplaneType;
        this.departureTime = departureTime;
        this.weekday = weekday;
    }

    //Getter
    public String getDestination() {
        return destination;
    }

    //Setter
    public void setDestination(String destination) {
        this.destination = destination;
    }

    //Getter
    public int getFlightNum() {
        return flightNum;
    }

    //Setter
    public void setFlightNum (int flightNum) {
        this.flightNum = flightNum;
    }

    //Getter
    public String getAirplaneType() {
        return airplaneType;
    }

    //Setter
    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    //Getter
    public double getDepartureTime() {
        return departureTime;
    }

    //Setter
    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    //Getter
    public String getWeekday() {
        return weekday;
    }

    //Setter
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

}