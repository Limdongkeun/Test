package SoloTest.TEST;
class Friend {
    public void friendInfo() {
        System.out.println("나는 당신의 친구입니다.");
    }

    public void goodFriend(){
        System.out.println("싸우자");
    }
}

class BoyFriend extends Friend {

    public void friendInfo() {
        System.out.println("나는 당신의 남자친구입니다.");
    }
}

class GirlFriend extends Friend {

    public void friendInfo() {
        System.out.println("나는 당신의 여자친구입니다.");
    }

    public void bite(){
        System.out.println("남자친구를 물어버렸다");
    }
}

public class Test17 {

    public static void main(String[] args) {
        Friend friend = new Friend(); // 객체 타입과 참조변수 타입의 일치
        BoyFriend boyfriend = new BoyFriend();
        GirlFriend girlFriend2 = new GirlFriend();
        Friend girlfriend = new GirlFriend(); // 객체 타입과 참조변수 타입의 불일치

        friend.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo();
        girlFriend2.bite();
//        girlfriend.bite(); //에러 Friend의 타입이기 때문에 Girlfriend의 있는 bite를 사용할 수 없다
        girlfriend.goodFriend(); // friend에 있는 것은 사용할 수 있다
        boyfriend.goodFriend();// Friend를 확장 받은것이기 때문에 오버라이드하지 않아도 사용할 수 있다

    }
}
