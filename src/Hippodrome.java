import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by user on 15.06.2016.
 */
public class Hippodrome {
    private static ArrayList<Horse> horses;
    private static Hippodrome game;

    public Hippodrome(ArrayList<Horse> horses) {
        this.horses = new ArrayList<Horse>();
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new Hippodrome(horses);
        horses.add(new Horse("Рыжун"));
        horses.add(new Horse("Плотва"));
        horses.add(new Horse("Владик"));
        game.run();
        game.getWinners();
        game.printWinners();

    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            move();
            print();
        }
    }
    public void move(){
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }
    public void print(){
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
            System.out.println();
            System.out.println();
        }
    }
    public ArrayList<Horse> getWinners(){
        Collections.sort(getHorses(), new Comparator<Horse>() {
            @Override
            public int compare(Horse o1, Horse o2) {
                return (int) o2.getDistance() - (int) o1.getDistance();
            }
        });

        return getHorses();
    }
    public void printWinners(){
        for (int i = 0; i < getHorses().size(); i++){
            System.out.println("Место " + (i+1) + ": " + getHorses().get(i).getName() + ".");
        }
    }

}
