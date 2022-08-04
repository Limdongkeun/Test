package SoloTest.TEST;

public class Test2 {
    public static void main(String[] args) {
        HelloWorld(5);

        int N =5;

        System.out.println("1부터" + N +"까지의 합은 " + plus(5));


        // 배열의 최대값을 가져온다
        int arr[] = {0, 80, 60, 40, 20, 100};
        System.out.println(ArraySort(arr, 4));

    }
    public static void HelloWorld(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello world!!");
        HelloWorld(n-1);
    }

    public static int plus(int n){
        if(n==1){
            return 1;
        }
//        return n += plus(n - 1);
        return n = n + plus(n-1);
    }

    // 크기가 N인 경우 최대값을 가져오는 메서드 선언
    public static int ArraySort(int[] arr, int n)
    {
        int x;
        if(n == 1)
            return arr[0];
        else
            x = ArraySort(arr, n - 1);

        if(x > arr[n - 1])
            return x;
        else
            return arr[n - 1];
    }
}
