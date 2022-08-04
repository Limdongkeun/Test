package SoloTest.TEST;

@FunctionalInterface
interface myNumber{
     int maxNum(int x, int y);
}

@FunctionalInterface
interface makeString{
    public void Str(String s1, String s2);
}

interface problemTest{
    public void m1(int a1, int b1);
    public void m2(String aa, String bb);
}

public class Test26_lambda {
    public static void main(String[] args) {

        myNumber num = (x, y) -> (x >= y)? x:y;
        int a = num.maxNum(10,20);
        System.out.println(a);

        myNumber sum = (x,y) -> x+y;
        System.out.println(sum.maxNum(5,5));

//        myNumber mynumber = new myNumber() { // 함수형 인터페이스를 생성했을때 사용해야 하는 익명내부 클래스
//            @Override
//            public int maxNum(int x, int y) {
//                return 0;
//            }
//        };

        makeString makestring = (s1,s2) -> System.out.println(s1 + ":::" + s2);
        makestring.Str("hello", "world");
//        makeString mmm = new makeString() { /// 내가 쓰지 않아도 IDE가 알아서 익명 내부클래스를 만들어줌 원래는 내가 만들어야 함
//            @Override
//            public void Str(String s1, String s2) {
//            }
//        };

//        problemTest pp1 = (a1,b1) -> System.out.println("람다로  " + a1+b1); //에러 인터페이스에 두개 있으면 람다로 못바꿈
//        pp1.m1(1,3);

//        problemTest pp = new problemTest() {
//            @Override
//            public void m1(int a, int b) {
//                System.out.println("인터페이스의 익명내부클래스 " + a+b);
//            }
//
//            @Override
//            public void m2(String aa, String bb) {
//                System.out.println("인터페이스의 익명내부클래스 "+ aa + " ::: " + bb);
//            }
//        };
//        pp.m1(100,200);
//        pp.m2("Hello","hell");
    }
}
