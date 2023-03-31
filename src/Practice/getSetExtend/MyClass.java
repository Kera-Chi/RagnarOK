package Practice.getSetExtend;

public class MyClass {

//    public static void main(String[] args) {
//
//        getSet getSet = new getSet();
//        getSet.setMyBoss("DDDDDDD達達");
//        System.out.println(getSet.getMyBoss());
//
//    }
    //0331

    public static void main(String[] args) {


//        Charactor chi = new Charactor(9999);
        Charactor chi = new Magician(999999);
        Charactor darren = new Knight(888);

        System.out.println(chi.getHp());
        System.out.println(darren.getHp());

        darren.setHp(5201314);

        System.out.println(chi.getHp());
        System.out.println(darren.getHp());

        chi.attack();
        chi.attack("Darren");
        darren.attack();
        darren.attack("Chi");




    }
}
