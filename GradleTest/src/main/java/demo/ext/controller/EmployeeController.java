package demo.ext.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController("/client")
public class EmployeeController {

	public String getEmployee(){
		return "running";
	}
	
}
