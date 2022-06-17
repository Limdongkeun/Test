package SoloTest;

import java.util.HashMap;
import java.util.Scanner;

public class Test24_3 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("dongkeun","1007");
        hashMap.put("younghae","0904");
        hashMap.put("yun","0614");
        hashMap.put("gahee","0926");

        System.out.println(hashMap);

        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("이름을 입력하세요");
            System.out.println("이름 : ");
            String id = sc.nextLine();

            System.out.println("생일을 입력하세요");
            System.out.println("생일 : ");
            String birthDay = sc.nextLine();

//            hashMap.put(id,birthDay);

            if (hashMap.containsKey(id)){//아이디인 키가 존재하는지 확인한다.
                if (hashMap.get(id).equals(birthDay)){ // 아이디의 생일과 동일한지 비교
                    System.out.println("일치합니다"); break;
                }else {
                    System.out.println("생일이 다릅니다");
                }
            }else {
                System.out.println("아이디가 존재하지 않습니다");
            }
        }//while
    }//main
}//class
