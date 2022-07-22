package com.infy.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.dto.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{



}
