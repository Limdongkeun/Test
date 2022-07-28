package SoloTest.TEST;

class mom {
    int com(int num){
        if(num<=1){
            return 1;
        }
        return num*com(num-1);
    }

    public void MMMM(){
        System.out.println("난 엄마");
    }
}

class Child extends mom{
    int com(int num){
        if(num<=1){
            return 1;
        }
        return num * com(num-2);
    }

    public void String(){
        super.MMMM();
        System.out.println("난 자식");
    }

    @Override
    public void MMMM() {
        super.MMMM();
        System.out.println("둘째");
    }
}
public class Test34 {
    public static void main(String[] args) {
        mom obj = new Child();
        obj.MMMM();
        System.out.println(obj.com(4));
        Child child = new Child();
        child.String();
    }
}
