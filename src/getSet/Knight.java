package getSet;

public class Knight extends Charactor{
    public void attack() {
        System.out.println("HAHA");
    }

    public void attack(String type) {
        System.out.println("HAHA " + type);
    }
    public Knight(int hp) {
        super(hp);
    }


}
