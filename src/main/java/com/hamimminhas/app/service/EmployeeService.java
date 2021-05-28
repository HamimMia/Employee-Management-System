package com.hamimminhas.app.service;

import java.util.List;
import org.springframework.data.domain.Page;
import com.hamimminhas.app.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployee();

	void saveEmployee(Employee employee);

	Employee getEmployeeById(long id);

	void deleteEmployeeById(long id);

	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
