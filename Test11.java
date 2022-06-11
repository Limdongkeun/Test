package SoloTest;

class Constructor {
    Constructor() { // (1) 생성자 오버로딩
        System.out.println("1번 생성자");
    }

    Constructor(String str) { // (2)

        System.out.println("2번 생성자 " + str);
    }

    Constructor(int a) { // (3)
        System.out.println("3번 생성자");
    }
}

public class Test11 {
    public static void main(String[] args) {
        Constructor constructor1 = new Constructor();
        Constructor constructor2 = new Constructor("Hello world");
        Constructor constructor3 = new Constructor(5);
    }
}
