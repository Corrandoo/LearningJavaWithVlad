import java.util.ArrayList;

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
        run();
    }

    public static void run(){
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            move();
            print();
        }
    }
    public static void move(){
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();
        }
    }
    public static void print(){
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).print();
            System.out.println();
            System.out.println();
        }
    }

}
