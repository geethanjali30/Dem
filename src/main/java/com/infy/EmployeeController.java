package com.infy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.Employee;
import com.infy.repository.EmployeeRepository;

@RestController
@RequestMapping("/rest")
public class EmployeeController {
	
	@Autowired
	
	EmployeeRepository repo;
	public String SsyHe()
	{
		return"welcome";
	}
	@PostMapping("/addemp")
	public Employee addEmployee(@RequestBody Employee e)
	{
		repo.save(e);
		return e;
	}
	
@GetMapping("/emp/{id}")
public Employee getEmployee(@PathVariable("id")int id)
{
	return repo.findById(id).get();
			}
}
