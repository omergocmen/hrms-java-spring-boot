package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {
	
	private UserService userService;
	
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService=userService;
	}

	@GetMapping("/getAll")
	public List<User> getll(){
		return this.userService.getAll();
	}

	@GetMapping("/email")
	public DataResult<User> getByEmail(@RequestParam String email){
		return userService.getByEmail(email);
	}

}
