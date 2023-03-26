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
