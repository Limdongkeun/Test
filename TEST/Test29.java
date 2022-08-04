package SoloTest.TEST;

import java.awt.*;
import java.util.List;

class MenuController{
    private MenuService menuservice;

    public MenuController(MenuService menuservice) {
        this.menuservice = menuservice;
    }

    List<Menu> getMenu(){
        return menuservice.getMenuList();
    }
}

class MenuService{
    List<Menu> getMenuList(){
        return null;
    }
}

//
//class MenuController{
//    private MenuServiceStub menuServiceStub;
//
//    public MenuController(MenuServiceStub menuServiceStub) {
//        this.menuServiceStub = menuServiceStub;
//    }
//
//    List<Menu> getMenu(){
//        return menuServiceStub.getMenuList();
//    }
//}
//class MenuServiceStub{
//    List<Menu> getMenuList(){
//        return List.of(
//                new Menu("아메리카노"),
//                new Menu("라떼"),
//                new Menu("핫식스")
//        );
//    }
//}

public class Test29 {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        MenuController menuController = new MenuController(menuService);

        List<Menu> menuList = menuController.getMenu();
        System.out.println(menuList);


    }
}
