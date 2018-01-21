package org.esudarshan.springbootdemo.service;

import java.util.Arrays;
import java.util.List;

import org.esudarshan.springbootdemo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> users = Arrays.asList(new User(1, "Sudarshan"), new User(2, "Ajinkya"), new User(3, "Ravish"),
			new User(4, "Manish"));

	public List<User> getAllUsers() {
		return users;
	}

	public User getUserById(int id) {
		return users.stream().filter(u -> u.getId() == id).findFirst().get();
	}

}
