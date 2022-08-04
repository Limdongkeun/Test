package SoloTest.TEST;

abstract class Animal {
    public String kind;
    public abstract void sound();
}

class Dog extends Animal { // Animal 클래스로부터 상속
    public Dog() {
        this.kind = "포유류";
    }

    public void sound() { // 메서드 오버라이딩 -> 구현부 완성
        System.out.println("멍멍");
    }
}

class Cat extends Animal { // Animal 클래스로부터 상속
    public Cat() {
        this.kind = "포유류";
    }

    public void sound() { // 메서드 오버라이딩 -> 구현부 완성
        System.out.println("야옹");
    }
}

class Test19_abstract {
    public static void main(String[] args) throws Exception {
        Animal dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
        cat.kind = "후추";
        System.out.println(cat.kind);

        Dog dog1 = new Dog();
        dog1.sound();
        dog1.kind = "댕댕스";
        System.out.println(dog1.kind);


    }
}
