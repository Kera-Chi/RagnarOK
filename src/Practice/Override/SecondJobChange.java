package Practice.Override;

public class SecondJobChange extends Beginner{

    @Override
    int hp() {
        return initialHp + 1000;
    }

    static String incantation() {
        return "sasasasasa";
    }

}
