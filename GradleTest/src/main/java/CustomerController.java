

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plm.beans.Project;
import com.plm.beans.Task;
import com.plm.repository.ProjectRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	ProjectRepository repository;
	
	@RequestMapping(method = RequestMethod.GET, 
					produces={"application/json"})
	public void getCustomer(){

		List<Task> list = new ArrayList<>();
		list.add(new Task("task1"));
		list.add(new Task("task2"));
		list.add(new Task("task3"));
		
		repository.save(new Project("Mindsphrere 1", new Date(), new Date(),list));
		
	}
	
	
}
