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

        public EmployeeDTO registemployee(int emp_id) {

            SqlSession sqlSession = getSqlSession();

            mapper = sqlSession.getMapper(Mapper.class);

            int result = Mapper.insertEmployee(emp_id);

            if(result > 0) {
                sqlSession.commit();
            } else {
                sqlSession.rollback();
            }

            sqlSession.close();

            return result > 0 ? true : false;

        }




}
