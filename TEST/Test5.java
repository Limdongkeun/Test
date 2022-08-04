package SoloTest.TEST;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String input = sc.nextLine();
//
//        switch (input){
//            case "1":
//                System.out.println(1); break;
//            case "2":
//                System.out.println(2); break;
//            default:
//                System.out.println("없는 숫자!");
//        }

//        switch (input){  //이렇게 쓰는 방식은 JDK14부터 가능
//            case "Senior" -> System.out.println("7000만원");
//        }
//        int num = 1234;
//
//        System.out.println(num%10);//4
//        System.out.println(num%100);//34
//        System.out.println(num%100/10);//3
//        System.out.println(num%100%10);//4
//        System.out.println(num%1000);//234
//        System.out.println(num%10000);//1234
//        System.out.println(num%10 == (num%100)/10);
//
//        int i = 10; //일의 자리랑 십의자리랑 같은 것만 뽑는 것
//        while (i++ < 150) {
//            int one = i % 10;
//            int ten = (i % 100)/10;
//            if (one == ten) {
//                System.out.println(i);
//            }
//        }
//        String str = "abcdefghijk";
//        for(int i =0;i<str.length();i++){
//            char s = str.charAt(i);
//            System.out.println(s);
////            위와 아래와 같은 결과가 나온다 하지만 위에 s는 char이기 때문에 하나씩 잘라서 나올 수 있지만
////             아래 s1은 String타입이기 때문에 String.valueOf를 사용해서 형변환을 해준다
//            String s1 = String.valueOf(str.charAt(i));
//            System.out.println(s1);
//        }

        int input = 0, randomNum = 0;

        randomNum = (int)(Math.random() * 10) + 1; // 1 ~ 10 임의의 수를 생성
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("1과 10 사이의 정수를 입력하세요");
            input = scanner.nextInt();

            if(input > randomNum) {
                System.out.println("더 작은 정수를 입력하세요");
            } else if (input < randomNum) {
                System.out.println("더 큰 정수를 입력하세요");
            }
        } while(input != randomNum);
        System.out.println(randomNum +" 정답입니다!");

    }//main
}//class