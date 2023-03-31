package Practice.Override;

public class MyOverloadingClass {

    public void incantation(String incantation) {
        System.out.println(incantation);
    }

    public void incantation(String incantation, int type) {
        System.out.println(incantation + type);
    }

    public void incantation(int type) {
        System.out.println(type);
    }
}
