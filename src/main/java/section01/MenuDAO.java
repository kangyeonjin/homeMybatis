package section01;

import org.apache.ibatis.session.SqlSession;
import java.util.List;

public class MenuDAO {

    public List<MenuDTO> selectAllMenu(SqlSession sqlSession){
        return sqlSession.selectList("MenuMapper.selectAllMenu");
    }

}
