package SoloTest.Algorithm;

public class Recursion_3 {
    public static void main(String[] args) {
        int result1 = search1(new int[]{1, 2, 3, 4, 5, 6}, 1, 6, 4);
        int result2 = search2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 6);
        int result3 = findMax(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 1, 8);

        System.out.println("search1 = " + result1);
        System.out.println("search2 = " + result2);
        System.out.println("findMax = " + result3);

    }

    public static int search1(int[] data, int begin, int end, int target ){
        if(begin>end){
            return -1;
        }else {
            int middle = (begin+end)/2;
            if(data[middle] == target) {
                return middle;
            }
            int index = search1(data, begin, middle-1, target);
            if(index != -1){
                return index;
            }else {
                return search1(data, middle + 1, end, target);
            }
        }
    }

    public static int search2(int[]items, int target){
        int low = 0;
        int high = items.length-1;
        while (low<=high){
            int middle = (low+high)/2;
            if(items[middle] == target){
                return target;
            } else if (target < items[middle]) {
                high = middle - 1;
            }else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public static int findMax(int[] items, int begin, int end){
        if(begin==end){
            return items[begin];
        }else {
            return Math.max(items[begin], findMax(items, begin + 1, end));
        }
    }
}
