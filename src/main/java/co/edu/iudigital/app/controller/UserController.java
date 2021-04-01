package co.edu.iudigital.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.app.model.entity.Users;
import co.edu.iudigital.app.service.iface.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")

public class UserController {
	
	@Autowired
	private UserService userService;
	@GetMapping 
	public List<Users> getAll(){
		return userService.getAll();
	}

}
