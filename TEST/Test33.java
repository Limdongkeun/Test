package SoloTest.TEST;

public class Test33 {
    public static void main(String[] args) {
        int[] num = {50, 40, 60, 88, 90};
        int m = num[0];
        for (int var : num){
            if(m<var){
                m=var;
            }
        }
        System.out.println("m = " + m);
    }
}
