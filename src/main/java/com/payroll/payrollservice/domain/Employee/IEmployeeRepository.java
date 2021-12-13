package com.payroll.payrollservice.domain.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
