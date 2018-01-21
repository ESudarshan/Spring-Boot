package org.esudarshan.springbootdemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.esudarshan.springbootdemo.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> users = new ArrayList<>(Arrays.asList(new User(1, "Sudarshan"), new User(2, "Ajinkya"),
			new User(3, "Ravish"), new User(4, "Manish")));

	public List<User> getAllUsers() {
		return users;
	}

	public User getUserById(int id) {
		return users.stream().filter(u -> u.getId() == id).findFirst().get();
	}

	public User createUser(User user) {
		users.add(user);
		return user;
	}

	public User updateUser(int id, User user) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == id) {
				users.set(i, user);
				break;
			}
		}
		return user;
	}

	public String deleteUser(int id) {
		users.removeIf(u -> u.getId() == id);
		return "User with id " + id + " is deleted!";
	}

}
