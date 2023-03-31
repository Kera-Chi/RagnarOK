package getSet;

public class Charactor {
    private int hp;
    private int sp;
    public Charactor(int hp, int sp) {
        setHp(hp);
        setSp(sp);
    }

    public Charactor(int hp) {
        setHp(hp);
    }

    public Charactor() {
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public void attack() {
        System.out.println("attack");
    }

    public void attack(String type) {
        System.out.println("attack " + type);
    }
}
