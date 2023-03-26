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

    public static void main(String[] args) {

    }
}
