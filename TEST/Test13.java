package SoloTest.TEST;
class Person{
    String name;

//    public Person(String name, String sex, int age) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//    }

    String sex;
    int age;

    public void talk(){
        System.out.println("말을 한다");
    }

    public void walk(){
        System.out.println("걷는다");
    }

    public void money(){
        System.out.println("돈을 번다");
    }
}

class backProgrammer extends Person{
//    public backProgrammer(String name, String sex, int age) {
//        super(name, sex, age);
//    }

    @Override
    public void talk() {
        System.out.println("프로그래머는 코딩으로 말한다"); //상위클래스의 메서드를 오버라이드해서 내가 바꾼다
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void money() {
        super.money();
    }

    public void programming(){
        System.out.println("자바를 사용한다");
    }
}

class frontProgrammer extends Person{

    public frontProgrammer(String name, String s, int a) {
        this.name =name;
        this.sex =s;
        this.age=a;

    }

    @Override
    public void talk() {
        System.out.println("프로그래머가되기 위해 열심히 공부하자");
    }

    public void programming(){
        System.out.println("자바스크립트를 사용한다");
    }
}

public class Test13 { //이건 상속관계 extends를 사용한것임 프로그래머는 사람이다 라는 문장이 성립됨
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "임동근";
        p.age = 27;
        p.sex = "men";

        System.out.println(p.name + " " + p.sex + " " + p.age);
        p.money();
        p.walk();
        p.talk();

        backProgrammer bp = new backProgrammer();
        bp.age = 30;
        bp.name = "임동근2";
        bp.sex = "men";
        System.out.println(bp.name + " " + bp.sex + " " + bp.age);
        bp.talk();
        bp.programming();

        frontProgrammer fp = new frontProgrammer("임동근3","men",31);
        System.out.println(fp.name + " " + fp.sex + " " + fp.age);
        fp.programming();

    //확장된 클래스들을 이런식으로도 선언해서 사용할 수 있다
        Person[] p2 = new Person[]{new backProgrammer(),new frontProgrammer("임동근4","men",32)};
        for (Person forp : p2){
            forp.talk();
        }
    }
}
