package Practice.Override;

public class FirstJobChange extends Beginner{

    @Override
    int hp() {
        return initialHp + 100;
    }

    void skill() {

    }

    static String incantation() {
        return "flaflaflafla";
    }
}
