package com.cogni.action.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cogni.action.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}