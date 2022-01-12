package com.dxc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.model.Employee;
import com.dxc.util.MyConnection;


@Component
public class EmployeeDAO {
	
	 final Connection con=MyConnection.getConnection();
	
	public List<Employee>  saveEmployee(Employee emp)
	{
	
String query="insert into employee values(null,'"+ emp.getiD()+"','"+emp.getPassword()+"','"+emp.getFirstName()+"','"+emp.getLastName()+"','"+emp.getSalary()+"')";
		
		try
		{
		
		Statement statment=con.createStatement();
		statment.executeUpdate(query);
		
		}
		catch(Exception e)
		{
		 e.printStackTrace();
		}
		
		//adding the new employee ends
		
		
		//selected the employee list starts
		
       List<Employee> employeeList=new ArrayList<Employee>();
		
		String querySelect="select * from employee order  by id desc";
		try
		{
		Statement st=con.createStatement();
		
		ResultSet result=st.executeQuery(querySelect);
		
		while(result.next())
		{
			//printing the record
			System.out.println("id "+result.getInt(1));
			System.out.println("username"+result.getString(2));
			System.out.println("password "+result.getString(3));
			System.out.println("First Name"+result.getString(4));
			System.out.println("Last Name "+result.getString(5));
			System.out.println("Salary "+result.getString(6));
			
			//storing into variable
			int idDb=result.getInt(1);
			String usernameDb=result.getString(2);
			String passwordDb=result.getString(3);
			String fnameDb=result.getString(4);
			String lnameDb=result.getString(5);
			int salaryDb=result.getInt(6);
			//store to employee class
			Employee employee=new Employee();
			
			employee.setiD(idDb);
			employee.setUserName(usernameDb);
			employee.setPassword(passwordDb);
			employee.setFirstName(fnameDb);
			employee.setLastName(lnameDb);
			employee.setSalary(salaryDb);
			employeeList.add(employee);
			
			
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	
	
	
	
	
		return employeeList;
	}
	
}
