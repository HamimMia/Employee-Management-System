package com.hamimminhas.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hamimminhas.app.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
