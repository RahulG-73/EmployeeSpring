package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;


@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
	
	public String getSingle(Employee e) {
		er.save(e);
		return "post single object succcessfully";
	}
	
	public String getSingle(List<Employee> e) {
		er.saveAll(e);
		return "post single object succcessfully";
	}

	public Employee getEmp( int n ) {
		return er.findById(n).get();
	}
	
	public List<Employee> getLiEmp(){
		   return er.findAll();
		}
	public String getDel( int n ) {
	     er.deleteById(n);
	     return "Deletion Successful";
	}
	public String getModify(int n , Employee e) {
	     Employee e1 = er.findById(n).get();
	     e1.setName(e.getName());
	     e1.setSalary(e.getSalary());
	     e1.setAge(e.getAge());
	     e1.setExperience(e.getExperience());
	     er.save(e1);
	     return "Modify Successfully...";
	}
	public String getPatch(int n ,Employee name) {
		 Employee e1 = er.findById(n).get();
		 e1.setName(name.getName());
		 er.save(e1);
		   return "Modify Successfully";
	   }
}
