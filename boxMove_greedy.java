package SoloTest.codeStatusProblem;

import java.util.Arrays;
import java.util.Scanner;

public class boxMove_greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] stuff = new int[num];

        int limit = sc.nextInt();

        int min = 0;
        int max = stuff.length -1;
        int count =0;

        Arrays.sort(stuff);
        int i=0;
        while (min<max){
            stuff[i] = sc.nextInt();
            if(stuff[min] + stuff[max] <limit){
                min++;
                max--;
                count++;
            }else{
                max--;
                count++;
            }
        }
        System.out.println(count);
    }
}
