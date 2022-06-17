package SoloTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test24_2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("피카츄", 85);
        map.put("꼬부기", 95);
        map.put("야도란", 75);
        map.put("파이리", 65);
        map.put("피존투", 15);

        //저장된 총 Entry 수 얻기
        System.out.println("총 entry 수: " + map.size());

        //객체 찾기
        System.out.println("파이리 : " + map.get("파이리")); //이름(key)로 점수(value)검색
        System.out.println("///");

        //객체를 하나씩 처리
        Set<String> keySet = map.keySet(); //Set 컬렉션으로 이름(key) 얻기
        System.out.println(keySet); //map에 있는 키를 set에 넣은 후 뽑음
        //반복해서 이름(key)를 얻고, 값을 Map에서 얻어냄
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }



        //객체 삭제
        map.remove("피존투");
        System.out.println("///");

        System.out.println("총 entry 수: " + map.size());

        //객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        //Set 컬렉션으로 Map.Entry 얻기
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        //반복해서 Map.Entry를 얻고 키와 값을 얻어냄
        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        //객체 전체 삭제
        map.clear();
    }
}