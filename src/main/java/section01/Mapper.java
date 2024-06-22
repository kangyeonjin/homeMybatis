package section01;

import java.util.List;

public interface Mapper {

    List<EmployeeDTO> allEmployee();

    EmployeeDTO employByCode(int empId);

    int insertEmployee(EmployeeDTO employ);

    int modifyMenu(EmployeeDTO employ);

    int deleteEmployee(int empId);


}
