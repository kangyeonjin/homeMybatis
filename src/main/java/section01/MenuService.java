package section01;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static section01.Template.getSqlSession;


public class MenuService {

    private final MenuDAO menuDAO;

    public MenuService(){
        menuDAO = new MenuDAO();
    }

    public List<MenuDTO> selectAllMenu(){

        SqlSession sqlSession = getSqlSession();
        List<MenuDTO> menuList = menuDAO.selectAllMenu(sqlSession);
        sqlSession.close();

        return menuList;

    }


}
