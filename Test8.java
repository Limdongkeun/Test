package SoloTest;
class sum{
    int a;
    int b;

    public static int sumTo(int a, int b){
            int result = a + b;
        return result;
    }

    public void minus(int a, int b){
        System.out.println(a-b);
    }
    public static void hello(){
        System.out.println("Hello");
    }
}
public class Test8 {
    public static void main(String[] args) {

        sum add = new sum(); //생성자 없는 객체
        System.out.println(sum.sumTo(5,3)); //static메서드이면서 매개변수를 받는 메서드
        add.minus(5,6); //인스턴스메서드이기 때문에 갹체를 생성해야 사용 가능
        sum.hello(); // static 메서드이기 때문에 객체 생성없이 사용가능

    }
}
