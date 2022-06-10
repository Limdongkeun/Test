package SoloTest.codeStatusProblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrcopy {
    public static void main(String[] args) {
        int[] num = new int[]{3,4,5,6,7,8,9};

        int[] head = Arrays.copyOfRange(num,num.length-1,num.length);
        int[] tail = Arrays.copyOfRange(num,0,num.length-1);
        System.out.println(Arrays.toString(head));
        System.out.println(Arrays.toString(tail));


        System.out.println("===================================");

        int[] result = new int[head.length+ tail.length];

        System.arraycopy(head,0,result,0,head.length);
        System.arraycopy(tail,0,result,head.length,tail.length);

        System.out.println(Arrays.toString(result));

        System.out.println("===================================");


        Integer[] num2 = new Integer[]{1,2,3,4};
        List<Integer> list = Arrays.asList(num2);
        System.out.println(Arrays.toString(num2));

        Collections.reverse(list);
        Integer[] reverseArr = list.toArray(num2);

        System.out.println(Arrays.toString(reverseArr));

        System.out.println("===================================");

        Integer[] b = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Collections.reverse(Collections.singletonList(b));

        Integer[] c = list.toArray(b);

        System.out.println(Arrays.toString(c));




    }
}
