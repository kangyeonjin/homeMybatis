package section01;

import java.util.Date;
import java.util.Map;
import section01.Service;
import section01.PrintResult;
import java.util.List;

public class Controller {

    private final PrintResult printResult;
    private final Service service;

    public Controller(){
        printResult = new PrintResult();
        service = new Service();
    }

  //전체 조회
    public void allEmployee(){

        List<EmployeeDTO> employeeList = service.allEmployee();

        if(employeeList != null){
            printResult.printEmployList(employeeList);
        }else{
            printResult.printErrorMessage("selectList");
        }
    }

//     코드 조회
    public void employeeByCode(Map<String, String> parameter) {

        int empId = Integer.parseInt(parameter.get("empId")); //형변환

        EmployeeDTO employ = service.employByCode(empId);

        if(employ != null) {
            printResult.printEmployee(employ);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registemployee(Map<String, String> parameter){

        String emp_id = parameter.get("emp_id");
        String emp_name = parameter.get("emp_name");
        String emp_no = parameter.get("emp_no");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String dept_code = parameter.get("dept_code");
        String job_code = parameter.get("job_code");
        String sal_level = parameter.get("sal_level");
        double salary = Integer.parseInt(parameter.get("salary"));
        double bonus = Integer.parseInt(parameter.get("bonus"));
        String manager_id = parameter.get("manager_id");
        String hire_date = parameter.get("hire_date");
        String ent_date =parameter.get("ent_date");
        String ent_yn = parameter.get("ent_yn");

        EmployeeDTO employ = new EmployeeDTO();
        employ.setEmpId(emp_id);
        employ.setEmpName(emp_name);
        employ.setEmpNo(emp_no);
        employ.setEmail(email);
        employ.setPhone(phone);
        employ.setDeptCode(dept_code);
        employ.setJobCode(job_code);
        employ.setSalLevel(sal_level);
        employ.setSalary(salary);
        employ.setBonus(bonus);
        employ.setManagerId(manager_id);
        employ.setHireDate(hire_date);
        employ.setEntDate(ent_date);
        employ.setEntYn(ent_yn);

        boolean result = service.registemployee(employ);

        if(result) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("selectOne");
        }

    }

//    public void modifyEmployee(){
//
//
//    }
//
//
//    public void deleteEmployee(){
//
//
//
//    }





}