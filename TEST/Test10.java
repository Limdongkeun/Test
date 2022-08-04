package SoloTest.TEST;

class Shape {
    public void area() { // 메서드 오버로딩. 같은 이름의 메서드 4개.
        System.out.println("넓이");
    }
    public void area(int r) {//메서드 오버로딩
        System.out.println("원 넓이 = " + 3.14 * r * r);
    }

    public void area(int w, int l) {
        System.out.println("직사각형 넓이 = " + w * l);
    }

    public void area(double b, double h) {
        System.out.println("삼각형 넓이 = " + 0.5 * b * h);
    }
    public void area(double x, int y){
        System.out.println("그냥 계산 = "+ x + y);
    }
}


public class Test10 {
    public static void main(String[] args) {
        Shape s = new Shape(); // 객체 생성

        s.area(); // 메서드 호출
        s.area(5);
        s.area(10,10);
        s.area(6.0, 12.0);
        s.area(10.0,4);
    }
}
