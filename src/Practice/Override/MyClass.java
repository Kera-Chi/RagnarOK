package Practice.Override;

public class MyClass {

    public static void main(String[] args) {
        Beginner chi = new FirstJobChange();
        System.out.println("First Health Points: " + chi.hp());
        System.out.println(FirstJobChange.incantation());

        chi = new SecondJobChange();
        System.out.println("Second Health Points: " + chi.hp());
        System.out.println(SecondJobChange.incantation());

        MyOverloadingClass molc = new MyOverloadingClass();
        molc.incantation(520);
        molc.incantation("ulala");
        molc.incantation("hehe", 1314);
    }

}
