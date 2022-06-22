package SoloTest.TEST;


interface PrintString{
    void showString(String str);
}
@FunctionalInterface
interface MyFunctionalInterface {
    public void accept();
}
public class Test26_1_lambda {
    public static void main(String[] args) {

        PrintString lambdaPrint = str -> System.out.println(str);
        lambdaPrint.showString("변수처럼 사용하는 람다");

        showMyString(lambdaPrint);//매개변수로 사용하는 람다"


        //매개변수가 없는 람다
        MyFunctionalInterface example = () -> {
            String str = "Calling Method, First";
            System.out.println(str);
        };
        example.accept();
            //위 아래가 같은 문잘 한줄일경우 중괄호 생략 가능
        example = () -> System.out.println("Calling method, Second");
        //실행문이 하나라면 중괄호 { }는 생략 가능
        example.accept();

    }//main
    public static void showMyString(PrintString lambda){
        lambda.showString("매개변수로 사용하는 람다");
    }
}//class
