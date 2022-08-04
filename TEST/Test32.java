package SoloTest.TEST;

class SuperObj{
    public void show(){
        print();
    }
    public void print(){
        print();
        System.out.println("Super");
    }
}

class SubObj extends SuperObj{
    @Override
    public void show() {
        super.print();
    }

    @Override
    public void print() {
        System.out.println("Sub");
    }
}

public class Test32 {
    public static void main(String[] args) {
        SuperObj s = new SubObj();
        s.show();
    }
}
