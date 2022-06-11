package SoloTest;
class Car{
    String name; //인스턴스 변수(전역변수)
    String color; //인스턴스 변수
    static int door =4;  //클래스 변수 여기서 바로 초기화를 해줘도 되고 메인에서 해줘도 된다
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public  void start()
    { String speed = "veryFest"; //지역 변수 메서드내에서만 사용 가능

        System.out.println("시동걸고 "+ speed);
    }

    public static void stop(){System.out.println("멈추고");}

    public static void charge(){System.out.println("충전하고");}

    static class airplane{ // 중첩클래스
        String airName;
        String airColor;

        public airplane(String airName, String airColor) {
            this.airName = airName;
            this.airColor = airColor;
        }

        void takeOff(){
            System.out.println("이륙한다");
        }

        void landing(){
            System.out.println("착륙한다");
        }

    }
}

class lv_cv_Test{ //인스턴스변수  클래스변수 test
    String strLv = "Lim";
    static String strCv = "Park";
}

public class Test7 {
    public static void main(String[] args) {

        Car car = new Car("tesla3","white");
        Car car1 = new Car("EV6", "cloudwhite");
//        Car.door =4; // 클래스변수는 객체 생성 없이 사용 가능
        System.out.println("차 이름 :" + car.name + "색은 : " + car.color + " 창문의 갯수 : "+ Car.door);
        car.start();// 인스턴스 메서드이기 때문에 객체를 생성하고 메서드 사용
        Car.stop(); // static 메서드이기 때문에 객체 생성없이 사용가능
        Car.charge(); // static 메서드이기 때문에 객체 생성없이 사용가능
        System.out.println("==================");
        System.out.println("차 이름 :" + car1.name + "색은 : " + car1.color + " 창문의 갯수 : "+ Car.door);
        car1.start(); // 인스턴스 메서드이기 때문에 객체를 생성하고 메서드 사용
        Car.stop();
        Car.charge();
        System.out.println("==================");
        //중첩클래스의 객체 생성
        Car.airplane airplane1 = new Car.airplane("korea","blue");
        System.out.println("비행기 이름은 : " + airplane1.airName + " 색은 : " + airplane1.airColor);
        airplane1.landing();
//        airplane1.takeOff();

        //객체 2개 생성
        lv_cv_Test lv_cv_test1 = new lv_cv_Test();
        lv_cv_Test lv_cv_test2 = new lv_cv_Test();

        //Lv는 개별적이기 때문에 이름이 바뀐다
        lv_cv_test1.strLv = "Dongkeun";
        lv_cv_test2.strLv = "gahee";
        System.out.println(lv_cv_test1.strLv);
        System.out.println(lv_cv_test2.strLv);

        //Cv는 공통적으로 되는 아이기 때문에 모든 객체가 다 참조해서 똑같이 바뀐다
        lv_cv_Test.strCv = "yoyo";
        lv_cv_Test.strCv = "hoho";
        System.out.println(lv_cv_Test.strCv);
        System.out.println(lv_cv_Test.strCv);
        System.out.println(lv_cv_Test.strCv = "abcd");

    }
}
