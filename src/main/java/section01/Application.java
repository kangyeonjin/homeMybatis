package section01;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do{
            System.out.println("=====메뉴관리시스템=======");
            System.out.println("1.메뉴전체 조회하기");
            System.out.println("메뉴관리번호를 입력해주세요 :");
            int no = sc.nextInt();

            switch(no) {
                case 1:
                    menuController.selectAllMenu();
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다");
                    break;
            }
        }while (true);

    }

}
