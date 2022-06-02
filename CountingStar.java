package SoloTest;

public class CountingStar {
    public static void main(String[] args) {
        System.out.println("2차원 별찍기");
        for(int i=0; i<=5;i++) {
            System.out.println("******");
        }


        System.out.println("=============================");
        System.out.println("직각삼각형 별찍기1");
        for (int i =1; i< 6;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("=============================");
        System.out.println("직각삼각형 별찍기2");
        for(int i=0; i<6;i++){
            for(int j=5;j>0;j--){
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        System.out.println("=============================");
        System.out.println("역삼각형 별찍기1");
        for(int i=5; i>0; i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("=============================");
        System.out.println("역삼각형 별찍기2");
        for (int i = 0; i <6; i++) {  // 4줄 생성
            for (int j = 0; j < i; j++) { // j가 빈칸(i)보다 작으면
                System.out.print(" "); //공백 출력
            }
            for (int j = 4; j >=i; j--){ // j가 빈칸(i) 보다 크거나 같다면
                System.out.print("*"); //별 출력
            }
            System.out.println();
        }


        System.out.println("=============================");
        System.out.println("피라미드 별찍기");
        for(int i=0;i<4;i++){
            for(int j=0;j<3-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }


        System.out.println("=============================");
        System.out.println("역피라미드 별찍기");
        for (int i = 0; i < 5; i++) { //4줄 출력
            for (int j = 1; j <= i; j++) { //삼각형 별을 출력하기 위해 공백 생성
                System.out.print(" ");
            }
            for (int j = 7 ; j >= i*2+1; j--) { //각행의 홀수(삼각형줄) 만큼 별출력
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("=============================");
        System.out.println("마름모 별찍기"); //홀수를 입력하여 찍기
        for (int i=0;i<5;i++){
            for (int j=0; j<5;j++)
            {
                if (i<=5/2)// 위쪽 영역
                {
                    if (i+j<=5/2-1)// 왼쪽 위 공백찍기
                        System.out.print(" ");
                    else if (j-i>=5/2+1) // 오른쪽 위 공백찍기
                        System.out.print(" ");
                    else
                        System.out.print("*");// *찍기
                }
                else if (i>5/2) //아래쪽 영역
                {
                    if (i-j>=5/2+1) //왼쪽 밑 공백
                        System.out.print(" ");
                    else if (i+j>=5/2*3+1)//오른쪽 밑 공백
                        System.out.print(" ");
                    else
                        System.out.print("*"); // *찍기
                }
            }
            System.out.println();//줄바꿈
        }

    }
}
