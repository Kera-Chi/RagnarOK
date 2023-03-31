package getSet;

public class Magician extends Charactor {
    public void attack() {
        System.out.println("Magic");
    }

    public void attack(String type) {
        System.out.println("Magic " + type);
    }
    public Magician(int hp) {
        super(hp);
    }
}
