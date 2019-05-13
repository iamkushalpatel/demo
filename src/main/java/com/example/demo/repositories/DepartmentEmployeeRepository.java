package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.DepartmentEmployee;

@Repository
public interface DepartmentEmployeeRepository
		extends JpaRepository<DepartmentEmployee, DepartmentEmployee.DepartmentEmployeeIdentity> {

}
