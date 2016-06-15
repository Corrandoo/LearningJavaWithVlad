/**
 * Created by user on 15.06.2016.
 */
public class Horse {
    private double speed;
    private String name;
    private double distance;

    public Horse(String name) {
        this.name = name;
        this.distance = 0;
        this.speed = 1;
    }


    public double getSpeed() {
        return speed * Math.random();
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
    public void move(){
        setDistance(getDistance() + getSpeed());
    }
    public void print(){
        for (int i = 0; i < (int)getDistance(); i++) {
            System.out.print(".");
        }
        System.out.println(getName());
    }
}
