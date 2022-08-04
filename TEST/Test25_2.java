package SoloTest.TEST;

/// ====================== 지역 내부 클래스 =========================

class Outer10 { //외부 클래스
    int num = 5;
    void test() {
        int num2 = 6;
        class LocalInClass { //지역 내부 클래스
            void getPrint() {
                System.out.println(num);
                System.out.println(num2);
            }
        }
        LocalInClass localInClass = new LocalInClass();
        localInClass.getPrint();
    }
}
public class Test25_2 {
    public static void main(String[] args) {
        Outer10 outer = new Outer10();
        outer.test();
    }
}

