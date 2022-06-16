package SoloTest;

interface Customer5 {
    String getOrder();
}

class CafeCustomerA5 implements Customer5 {
    public String getOrder(){
        return "a glass of iced americano";
    }
}

class CafeCustomerB5 implements Customer5 {
    public String getOrder(){
        return "a glass of strawberry latte";
    }
}

class CafeOwner5 {
    public void giveItem(Customer5 customer) {
        System.out.println("Item : " + customer.getOrder());
    }
}

public class Test21_1 {
    public static void main(String[] args) throws Exception {
        CafeOwner5 cafeowner = new CafeOwner5();
        Customer5 cafeCustomerA = new CafeCustomerA5();
        Customer5 cafeCustomerB = new CafeCustomerB5();

        cafeowner.giveItem(cafeCustomerA);
        cafeowner.giveItem(cafeCustomerB);
    }
}
