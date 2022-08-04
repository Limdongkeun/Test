package SoloTest.TEST;

public class Test15 {
    public static void main(String[] args) {
        Lower l = new Lower();
        l.callNum();
    }
}

class Upper {
    int count = 20; // super.count
}

class Lower extends Upper {
    int count = 15; // this.count

    void callNum() {
        System.out.println("count = " + count); //lower의 count
        System.out.println("this.count = " + this.count); //lower의 count
        System.out.println("super.count = " + super.count); //upper의 count
    }
}
