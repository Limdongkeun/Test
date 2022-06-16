package SoloTest;
class basket<T>{ //제네릭 클래스
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
//=============================================
class TestClass { //일반 클래스 내부의 제네릭 메서드를 선언
    public <T> T accept(T t){
        return t;
    }
    public <K, V> void getPrint(K k, V v) { //리턴 타입 앞에 타입 매개변수 선언
        System.out.println(k+ ":" + v);
    }
}


public class Test22 {
    public static void main(String[] args) {
        basket<String> strBasket = new basket<>();
        strBasket.setT("임동근");
        System.out.println(strBasket.getT());

        basket<Integer> intBasket = new basket<>();
        intBasket.setT(27);
        System.out.println(intBasket.getT());


        TestClass testClass = new TestClass();
        String tstr = testClass.accept("심영해");
//        testClass.<String>accept("심영해"); //위에랑 같지만 생략할 수 있음
        System.out.println(tstr);
        testClass.getPrint(26,"심영해");
    }
}
