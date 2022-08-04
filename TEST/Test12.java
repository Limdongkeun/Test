package SoloTest.TEST;
class Example  {
    public Example() {
        System.out.println("Example의 기본 생성자 호출!");
    };

    public Example(int x) {
        this();
        System.out.println("Example의 두 번째 생성자 호출!");
    }
}

public class Test12 {
    public static void main(String[] args) {
        Example example = new Example();
        Example example2 = new Example(5);

    }
}
