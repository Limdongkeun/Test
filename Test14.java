package SoloTest;

public class Test14 {
    int id;
    String name;
    Address address;
    Hobby hobbykkk;

    public Test14(int id, String name, Address address, Hobby hobby) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hobbykkk = hobby;
    }


    void showInfo() {
        System.out.println(id + " " + name);
        System.out.println(address.city+ " " + address.country + " " +hobbykkk.hobby);
    }

    public static void main(String[] args) {
        Address address1 = new Address("서울", "한국");
        Address address2 = new Address("도쿄", "일본");
        Hobby hobby1 = new Hobby("Soccer");
        Hobby hobby2 = new Hobby("baseball");

        Test14 e = new Test14(1, "김코딩", address1,hobby1);
        Test14 e2 = new Test14(2, "박해커", address2,hobby2);

        e.showInfo();
        e2.showInfo();

    }
}

class Address {
    String city, country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }
}

class Hobby{
    String hobby;

    public Hobby(String hobby) {
        this.hobby = hobby;
    }
}