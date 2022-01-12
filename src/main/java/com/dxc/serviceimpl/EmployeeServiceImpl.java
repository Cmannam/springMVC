package com.dxc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxc.dao.EmployeeDAO;
import com.dxc.model.Employee;
import com.dxc.service.EmployeeService;

public class EmployeeServiceImpl  implements EmployeeService{
	
	
	EmployeeDAO employee=new EmployeeDAO();

	public List<Employee> selectEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> insertEmployee(Employee emp) {
		
		return employee.saveEmployee(emp);
	}

}
