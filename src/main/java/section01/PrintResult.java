package section01;

import java.util.List;

public class PrintResult {
    public void printMenuList(List<MenuDTO> menuList) {

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }

    }


    public void printErrorMessage(String selectList) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "메뉴 목록 조회를 실패했습니다."; break;
            case "selectOne" : errorMessage = "메뉴 조회를 실패했습니다."; break;
            case "insert" : errorMessage = "신규 메뉴 등록을 실패했습니다."; break;
            case "update" : errorMessage = "메뉴 수정을 실패했습니다."; break;
            case "delete" : errorMessage = "메뉴 삭제를 실패했습니다."; break;
        }

        System.out.println(errorMessage);

    }
}
