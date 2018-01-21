package org.esudarshan.springbootdemo.controller;

import java.util.List;

import org.esudarshan.springbootdemo.model.User;
import org.esudarshan.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public User getAllUsers(@PathVariable int id) {
		return userService.getUserById(id);
	}

}
