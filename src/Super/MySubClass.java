<<<<<<<< HEAD:src/Super0326/MySubClass.java
package Super0326;
========
package Super;
>>>>>>>> 2143f0f (refactor the file location):src/Super/MySubClass.java

public class MySubClass extends MySuperClass{

    String sameName = "我是小弟Str";

    public MySubClass(String subStr) {
        super(subStr);
        System.out.println("小弟控制器");
    }

    public void subClassMethod() {
        System.out.println("小弟方法1");
    }

    public void printWhatDoYouWant() {
        System.out.println("我應該是小弟喔： " + sameName);
        System.out.println("我繼承我大哥： " + super.sameName);
    }

    public void commentMethod() {

        System.out.println("小弟方法之－我字串到底會不會被覆蓋勒");
    }

    public void subCommentMethod() {

        commentMethod();
        super.commentMethod();
    }

    public static void main(String[] args) {

    }
}
