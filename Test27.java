package SoloTest.TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test27 {
    public static void main(String[] args) {
        System.out.println("=========================");

        int[] arr = new int[]{1,2,3,4,5};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        int count = (int) Arrays.stream(arr).count();
        System.out.println(count);

        List<String> sList = new ArrayList<>();
        sList.add("haha");
        sList.add("mmm");
        sList.add("aaa");

        Stream<String> stream = sList.stream();//.forEach(s -> System.out.println(s));
        stream.forEach(s-> System.out.println(s));

        sList.stream().sorted().forEach(s -> System.out.println(s));
        sList.stream().forEach(s -> System.out.println(s));

        System.out.println("=========================");


        System.out.println("=========================");

        Stream<String[]> stringArraysStream = Stream.of(
                new String[]{"hello", "world", "java"},
                new String[]{"code", "states"});

        stringArraysStream.flatMap(Arrays::stream).forEach(System.out::println);

        System.out.println("=========================");

        int[] intArr = {2,4,6};
        boolean result = Arrays.stream(intArr).allMatch(a->a%2==0);
        System.out.println("모두 2의 배수인가? " + result);

        result = Arrays.stream(intArr).anyMatch(a->a%3==0);
        System.out.println("하나라도 3의 배수가 있는가? " + result);

//        result = Arrays.stream(intArr).noneMatch(a->a%3==0);
        System.out.println(Arrays.stream(intArr).noneMatch(a->a%3==0));

        System.out.println("=========================");

    }//main
}//class
