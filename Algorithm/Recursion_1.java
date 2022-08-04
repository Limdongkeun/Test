package SoloTest.Algorithm;

public class Recursion_1 {
    public static void main(String[] args) {
        func(5);
    }
    public static void func(int k){
        if(k<=0){
            return;
        }else {
            System.out.println("Hello recursion");
            func(k-1);
        }
    }
}
