package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired 
	EmployeeService es;
	
	@PostMapping (value = "/getsingle")
	public String getSingle(@RequestBody Employee e) {
		return es.getSingle(e);
	}
	
	@PostMapping (value = "/getsingle1")
	public String getSingle(@RequestBody List<Employee> e) {
		return es.getSingle(e);
	}
	
	@GetMapping (value = "/getobj/{n}")
	public Employee getEmp(@PathVariable int n ) {
		return es.getEmp(n);
	}
	
   @GetMapping (value = "/getlistobj")
   public List<Employee> getLiEmp(){
	   return es.getLiEmp();
   }
   
   @DeleteMapping (value = "/getdel/{n}")
	public String getDel(@PathVariable int n ) {
		return es.getDel(n);
	}
   
   @PutMapping (value = "/getmodify/{n}")
   public String getModify(@PathVariable int n , @RequestBody Employee e) {
	   return es.getModify(n,e);
   }
   
   @PatchMapping (value = "/getpatch/{n}")
   public String getPatch(@PathVariable int n , @RequestBody Employee name) {
	   return es.getPatch(n,name);
   }
}
