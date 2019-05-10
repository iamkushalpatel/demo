package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Salary;

public interface SalaryRepository extends JpaRepository<Salary, Salary.SalaryIdentity> {

}
