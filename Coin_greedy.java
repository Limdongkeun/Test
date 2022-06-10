package SoloTest.codeStatusProblem;

import java.util.Scanner;

public class Coin_greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int[] coin = new int[]{500,100,50,10,5,1};
        int hap=0;
        int sum=0;
        int result=0;
        for(int i=0;i< coin.length;i++){
            if(price>0){
                hap = price/coin[i];
                result += hap;
                price = price - (hap*coin[i]);
            }
        }
        System.out.println(result);
    }
}
