package section01;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static section01.Template.getSqlSession;

    public class Service {

        private Mapper mapper;

        public List<EmployeeDTO> allEmployee() {

            SqlSession sqlSession = getSqlSession();

            mapper = sqlSession.getMapper(Mapper.class);

            List<EmployeeDTO> employeeList = mapper.allEmployee();

            sqlSession.close();

            return employeeList;

        }

        public EmployeeDTO employByCode(int empId) {

            SqlSession sqlSession = getSqlSession();

            mapper = sqlSession.getMapper(Mapper.class);

            EmployeeDTO employ = mapper.employByCode(empId);

            sqlSession.close();

            return employ;
        }

        public EmployeeDTO registemployee(int employ) {

            SqlSession sqlSession = getSqlSession();

            mapper = sqlSession.getMapper(Mapper.class);

            int result = mapper.insertEmployee(employ);

            if(result > 0) {
                sqlSession.commit();
            } else {
                sqlSession.rollback();
            }

            sqlSession.close();

            return result > 0 ? true : false;

        }

        public boolean modifyEmployee(EmployeeDTO employ) {

            SqlSession sqlSession = getSqlSession();

            mapper = sqlSession.getMapper(Mapper.class);

            int result = mapper.modifyMenu(employ);

            if(result > 0) {
                sqlSession.commit();
            } else {
                sqlSession.rollback();
            }

            sqlSession.close();

            return result > 0 ? true : false;
        }


        public boolean deleteEmployee(int empid) {

            SqlSession sqlSession = getSqlSession();

            mapper = sqlSession.getMapper(Mapper.class);

            int result = mapper.deleteEmployee(empid);

            if(result > 0) {
                sqlSession.commit();
            } else {
                sqlSession.rollback();
            }

            sqlSession.close();

            return result > 0 ? true : false;
        }

}
