package SoloTest;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = new int[10];


// 배열 요소 초기화 : 반복문 완료 후 arr -> {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
        System.out.println("==================================");
// 배열 요소 수정 : 반복문 완료 후 arr -> {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 10;
//            arr[i] = arr[i] * 10;
            System.out.println(arr[i]);
        }
    }
}
