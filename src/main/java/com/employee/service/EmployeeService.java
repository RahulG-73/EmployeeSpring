package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;

@Service
public class EmployeeService {
	@Autowired 
	EmployeeDao ed;
	
	public String getSingle(Employee e) {
		return ed.getSingle(e);
	}
	
	public String getSingle(List<Employee> e) {
		return ed.getSingle(e);
	}
	

	public Employee getEmp( int n ) {
		return ed.getEmp(n);
	}
	
	public List<Employee> getLiEmp(){
	   return ed.getLiEmp();
	}
	
	public String getDel( int n ) {
		return ed.getDel(n);
	}
	
	public String getModify(int n , Employee e) {
	   return ed.getModify(n,e);
	}
	
	public String getPatch( int n , Employee name) {
		   return ed.getPatch(n,name);
	   }

}
