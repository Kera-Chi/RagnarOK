package Super;
import Practice.Super.MySubClass;

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