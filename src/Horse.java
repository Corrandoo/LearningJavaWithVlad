/**
 * Created by user on 15.06.2016.
 */
public class Horse {
    private double speed;
    private String name;
    private double distance;

    public Horse(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
