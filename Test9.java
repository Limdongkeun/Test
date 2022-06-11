package SoloTest;

class Fruit{
    String name;

//    public Fruit(String name) {
//        this.name = name;
//    }

    public static String selling(){

        return " 팔아요";
    }
}


public class Test9 {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        Fruit grape = new Fruit();
        apple.name = "Apple";
//         apple.selling();
        Fruit.selling();
//        System.out.println(apple.name + apple.selling());
        System.out.println(apple.name + Fruit.selling());
    }
}
