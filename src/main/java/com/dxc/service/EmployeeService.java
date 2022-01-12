package com.dxc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dxc.model.Employee;
@Service
public interface EmployeeService {
	
	public List<Employee> selectEmployee();
	public List<Employee> updateEmployee(Employee emp);
	public List<Employee> deleteEmployee(Integer id);
	public List<Employee> insertEmployee(Employee emp);
}
