<<<<<<<< HEAD:src/Super0326/MyClass.java
package Super0326;
========
package Super;
>>>>>>>> 2143f0f (refactor the file location):src/Super/MyClass.java

public class MyClass {

    public static void main(String[] args) {
        MySubClass mySubClass = new MySubClass("本地字串啦~~到底要被覆蓋幾次！！！");
        mySubClass.superClassMethod();
        mySubClass.superClassMethod2();
        System.out.println(mySubClass.superClassStr);
        mySubClass.subClassMethod();
        mySubClass.printWhatDoYouWant();
        mySubClass.commentMethod();
        mySubClass.subCommentMethod();
    }
    }
