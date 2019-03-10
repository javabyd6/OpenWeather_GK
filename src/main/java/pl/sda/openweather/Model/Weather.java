package pl.sda.openweather.Model;

public class Weather {

    private Location location;
    private Current current;

    public Weather(Location location, Current current) {
        Location location1 = location;
        Current current1 = current;
    }

    public Weather() {

    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}


