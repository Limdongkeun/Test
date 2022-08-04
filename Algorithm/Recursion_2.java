package SoloTest.Algorithm;

public class Recursion_2 {
    public static void main(String[] args) {
        int result1 = func(5);
        int result2 = func2(5);
        double result3 = power(2, 5);
        int result4 = fibonacci(10);
        int result5 = gcd(24,3 );
        int result6 = length("abcde");
        int result7 = sum(5, new int[]{1, 2, 3, 4, 5});

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("power = " + result3);
        System.out.println("fibonacci = " + result4);
        System.out.println("gcd = " + result5);
        System.out.println("length = " + result6);
        System.out.println("sum = " + result7);
    }
    public static int func(int k){
        if(k<=0){
            return 0;
        }else {
            return k + func(k - 1);
        }
    }
    //factorial
    public static int func2(int k){
        if(k<=0){
            return 1;
        }else {
            return k * func2(k-1);
        }
    }
    //x의 k승
    public static double power(double x, int k){
        if(k<=0){
            return 1;
        }else {
            return x * power(x, k - 1);
        }
    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n = fibonacci(n - 1) + fibonacci(n - 2);

    }

    //최대공약수

    /**
     *
     * m>=n인 두 양수 m,n에 대하여 m이 n의 배수이면 gec(m,n) == n이고,
     * 그렇지 않으면 gcd(m,n) = gcd(n,m%n)이다
     */
    public static int gcd(int m, int n){
        if(m<n){ // 큰수로 나눠야하기 떄문에 바꾼다 
            int tmp=m;
            m=n;
            n=tmp;
        }
        if(m%n==0){
            return n;
        }else {
            return gcd(n,m%n);
        }
    }

    public static int length(String str){
        if(str.equals("")){
            return 0;
        }else {
//            char a = str.charAt(0);
            return 1 + length(str.substring(1));
        }
    }

    //data[0]에서 n만큼 data[n...]을 더하기
    public static int sum(int n, int[] data){
        if (n<=0){
            return 0;
        }else {
            return sum(n - 1, data) + data[n - 1];
        }
    }
}
