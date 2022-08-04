package SoloTest.TEST;

/// ====================== 익명 내부 클래스 =========================

//interface Name {
//    String name = "Kim Coding";
//    void getName();
//}
//
//class TestClass implements Name {
//    //TestClass 클래스는 Name 인터페이스를 구현받아 작성합니다.
//    public void getName() {
//        System.out.print("내 이름은 "+ name);
//    }
//}
//
//class Main {
//    public static void main(String [] args) {
//        TestClass obj = new TestClass();
//        obj.getName();
//    }
//}


//위에 있는걸 아래처럼 바꾼것 익명 내부 클래역
interface Name {
    String name = "Kim Coding";
    void getName();
}

class Test25_3 {
    public static void main(String [] args) {
        Name obj = new Name() {
            public void getName() {
                System.out.println("내 이름은" + name);
            }
        };//익명내부클래스
        obj.getName();
    }
}