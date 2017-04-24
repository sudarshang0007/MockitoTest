package com.plm.restcontroller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.plm.beans.Address;
import com.plm.beans.Department;
import com.plm.beans.Employee;
import com.plm.beans.Role;
import com.plm.dao.EmployeeDao;
import com.plm.dao.RoleDao;
import com.plm.repository.EmployeeRepository;

@RestController("/employee")
public class EmployeeController {


	@Autowired
	EmployeeDao empdao;

	@Autowired
	EmployeeRepository repository;

	@Autowired
	RoleDao roleDao;
	
	//get All Employee
	@RequestMapping(method= RequestMethod.GET , produces ={"application/json"})
	public List<Employee> getAllEmployee(Employee employee) {
		return empdao.getAllEmployee();
	}
	
	@RequestMapping(method= RequestMethod.POST , produces ={"application/json"}, consumes={"application/json"})
	public void createEmployee(@RequestBody Employee employee) {
		 empdao.saveEmployee(employee);
	}


}
