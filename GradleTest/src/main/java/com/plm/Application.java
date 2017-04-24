package com.plm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.plm.beans.Address;
import com.plm.beans.Department;
import com.plm.beans.Role;
import com.plm.repository.DepartmentRepository;
import com.plm.repository.RoleRepository;



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

	public CommandLineRunner addData(DepartmentRepository respository){
		return (args) -> {
			respository.save(new Department("Developement", new Address("pune", 411025, "Baner")));
			respository.save(new Department("Quality Engineering", new Address("pune", 415214, "Karve Rd")));
			respository.save(new Department("Production Engineering", new Address("pune", 487522, "University Rd")));
		};
	}
	
	public CommandLineRunner addData1(RoleRepository respository){
		return (args) -> {
			respository.save(new Role("Developer"));
			respository.save(new Role("Q/A"));
			respository.save(new Role("Team Lead"));
			respository.save(new Role("Manager"));
		};
	}

}
