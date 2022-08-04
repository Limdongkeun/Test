package SoloTest.TEST;

import java.util.StringTokenizer;

public class Test4 {
    public static void main(String[] args) {
        String str = "Java";
//        String str1 = "";
//        System.out.println(str);
//
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(1));
//        System.out.println(str.charAt(2));
//        System.out.println(str.charAt(3));
//
//        System.out.println(str);
//
//         문자끼리 비교하면 첫번째 문자부터 비교 한 후 다른 문자가 나오면 아스키코드로 변환해 그 차이를 알려준다
//         숫자 비교할 경우 기준값.compareTo(비교대상) 같으면 0 & 기준값이 크면 1 & 비교대상이 크면 -1
//        Integer a =10;
//        System.out.println(a.compareTo(10)); // 0
//        System.out.println(a.compareTo(9)); // 1
//        System.out.println(a.compareTo(11)); //-1
//        System.out.println(str.compareTo("abcd")); //
//        System.out.println(str.compareToIgnoreCase("Ja"));
//        System.out.println(str.compareToIgnoreCase("JAVA"));
//        System.out.println(str.compareToIgnoreCase("dasas"));
//        System.out.println(str.compareToIgnoreCase("Jdsasadsa"));
//        System.out.println(str.compareTo("java"));
//
////        문자열 뒤에 연결해서 나오게 된다 앞에 붙는 문자열의 길이가 0이면 그냥 나온다
//        System.out.println(str1.concat("fuck you"));
//
//        //문자열에서 해당 문자 혹은 문자열이 인덱스번호 몇번째 있는지 알려준다 없으면 -1
//        System.out.println(str.indexOf('a'));
//        System.out.println(str.indexOf('v'));
//        System.out.println(str.indexOf('v',1));
//============================================================================================

//        String str2 = "This is a string example using StringTokenizer";
//        StringTokenizer tokenizer = new StringTokenizer(str2);
//        System.out.println(str2);
//        System.out.println("token 갯수 : " + tokenizer.countTokens()); //str2문자열을 띄어쓰기를 기준으로 하나씩 토큰이라고해서 갯수를 센다
//        System.out.println();
//
//        while(tokenizer.hasMoreTokens()){ //hasMoreTokens 토큰이 있으면 true 없으면 false
//            System.out.println(tokenizer.nextToken()); //nextToken 다음에 있는 토큰을 불러온다
//        }
//        System.out.println("total tokens:"+tokenizer.countTokens()); //토큰으로 다 세고 나면 str2의 문자열의 길이는 0이 된다
//============================================================================================
        //문자열의 길이를 가변적을 추가하기 위해서 사용한다 //단일 스레드에서는 성능이 좋음
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("문자열 ").append("연결").append(11);
        String str3 = stringBuilder.toString();

        System.out.println(stringBuilder.toString());
        System.out.println(str3);
        System.out.println(stringBuilder.append(" 이렇게되 추가 되냐??")); //처음 추가한 곳과 다른곳에서 추가하면 해당하는 곳에서만 추가 된다다
        System.out.println(stringBuilder.capacity()); // 기본으로 16자리를 만들어 준내

        //멀티스레드에서 성능이 좋음
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1).append("자바").append("공부").append("갯수가 늘어날까 과연 몇일까??");
        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.append(" 이것도 되냐??").toString());
        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.delete(0,2));
        System.out.println(stringBuffer.deleteCharAt(4));
    }
}
