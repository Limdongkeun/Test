package SoloTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3_1 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");

        List<String> result = new ArrayList<>();
        reculsion(arr,result,arr.size(),2); //r이 뽑는 갯수
    }

    /**
     * 순열 구하기
     *
     * @param arr    : 기준 리스트
     * @param result : 결과를 담아줄 리스트
     * @param n      : 전체 갯수
     * @param r      : 뽑을 갯수
     */
    public static void reculsion(List<String> arr,List<String> result,int n,int r){
        if(r==0){
            System.out.println(result.toString());
            return;
        }
        for (int i=0;i<n;i++){
            result.add(arr.remove(i));
            reculsion(arr, result, n-1, r-1);
            arr.add(i,result.remove(result.size()-1));
        }
    }


//    public void premutation(List<Integer> nums, int[] result, int depth, int n, int r){
//        if(depth ==r){
//            System.out.println(Arrays.toString(result));
//            return;
//        }
//
//        for (int i=0; i<n-depth;i++){
//            result[depth] = nums.remove(i);
//            premutation((arr,nums,result,depth+1,n,r);
//            nums.add(i,result[depth]);
//        }
//    }

}
//while(small!=0){
//    int r =big%small;
//    big = small;
//    small = r;
//        }