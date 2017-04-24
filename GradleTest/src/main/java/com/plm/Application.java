package com.plm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@ComponentScan("com.plm.*")
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
}

	/*
public CommandLineRunner addData(EmployeeRepository respository){
	Set<Role> role = new HashSet<>();
	return (args) -> {
		role.add(new Role( "Developer"));
		respository.save(new Employee("Sudarshan", "Gaikwad", "advm1h", "Software Engineer", new Address("Akluj", 413101, "Akluj Rd"),role, new Department("Mind Sphere", new Address("pune", 411056, "Baner"))));
	};
}

 public CommandLineRunner addData(DepartmentRepository respository){
	return (args) -> {
		respository.save(new Department("Engineering", new Address("pune", 413101, "Karve Rd")));
	};
	}
 public CommandLineRunner addData(ProjectRepository respository){
		List<Task> list = new ArrayList<>();
		list.add(new Task("task1"));
		list.add(new Task("task2"));
		list.add(new Task("task3"));
		return (args) -> {
			respository.save(new Project("Mindsphrere 1", new Date(), new Date(),list));
		};
	}
	*/
	
}
