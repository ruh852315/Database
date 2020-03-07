package com.example.jdemo.repository;

import com.example.jdemo.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<Employee, Long> {

}
