package com.ofss.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.main.domain.Employee;
import com.ofss.main.repository.EmployeeRepository;

@RestController
@RequestMapping("employeeapi")
public class EmployeeController {

	EmployeeRepository employeeRepository = new EmployeeRepository();

	@RequestMapping(value="employee/{employeeId}" , method = RequestMethod.DELETE)
	public boolean delete(@PathVariable int employeeId) {
		boolean result = employeeRepository.deleteEmployee(employeeId);
		return result;
	}
	
	@RequestMapping(value = "employee", method = RequestMethod.PUT)
	public boolean update(@RequestBody Employee employee) {
		boolean result = employeeRepository.updateEmployee(employee);
		return result;
	}

	@RequestMapping(value = "employee", method = RequestMethod.POST)
	public boolean insert(@RequestBody Employee employee) {
		boolean result = employeeRepository.addNewEmployee(employee);
		return result;
	}

	@RequestMapping(value = "employee/all", method = RequestMethod.GET)
	public List<Employee> all() {
		List<Employee> allEmployees = employeeRepository.selectAllEmployees();
		return allEmployees;
	}

	@RequestMapping(value = "employee/{employeeId}", method = RequestMethod.GET)
	public Employee one(@PathVariable int employeeId) {
		Employee employee = employeeRepository.getOneEmployee(employeeId);
		return employee;
	}
}
