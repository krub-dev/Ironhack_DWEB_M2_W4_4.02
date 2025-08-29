package com.krub.hosp_manager.repository;

import com.krub.hosp_manager.enums.EmployeeStatus;
import com.krub.hosp_manager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByStatus(EmployeeStatus status);
    List<Employee> findByDepartment(String department);
}