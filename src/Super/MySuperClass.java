<<<<<<<< HEAD:src/Super0326/MySuperClass.java
package Super0326;
========
package Super;
>>>>>>>> 2143f0f (refactor the file location):src/Super/MySuperClass.java

public class MySuperClass {

    String superClassStr = "大哥字串hi";
    String sameName = "我是老大Str";

    public MySuperClass(String hello) {
        System.out.println("大哥控制器！");
        System.out.println(hello);
    }

    public void superClassMethod() {
        System.out.println("大哥方法1");
    }

    public void superClassMethod2() {
        System.out.println("大哥方法2");
    }

    public void commentMethod() {

        System.out.println("老大方法之－印字串啦");
    }

    public static void main(String[] args) {
    }
}
