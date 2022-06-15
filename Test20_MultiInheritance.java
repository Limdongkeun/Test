package SoloTest;

interface Animal5 {
    public abstract void cry();
}
interface Pet {
    void play();  // 인터페이스 선언. public abstract 생략 가능.
}

class Dog5 implements Animal5, Pet { // Animal5와 Pet 인터페이스 다중 구현
    public void cry(){ //메서드 오버라이딩
        System.out.println("멍멍!");
    }

    public void play(){ //메서드 오버라이딩
        System.out.println("원반 던지기");
    }
}

class Cat5 implements Animal5, Pet { // Animal5와 Pet 인터페이스 다중 구현
    public void cry(){
        System.out.println("야옹~!");
    }

    public void play(){
        System.out.println("쥐 잡기");
    }
}

public class Test20_MultiInheritance {
    public static void main(String[] args) {
        Dog5 dog = new Dog5();
        Cat5 cat = new Cat5();

        dog.cry();
        dog.play();
        cat.cry();
        cat.play();
    }
}