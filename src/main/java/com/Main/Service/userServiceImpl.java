package com.Main.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Main.Entity.User;
import com.Main.Repository.userRepository;


@Service
public class userServiceImpl implements userService{
	@Autowired
	private userRepository uRepo;

	@Override
	public User createUser(User user) {
		User saveUser = uRepo.save(user);
		return saveUser;
	}

	@Override
	public List<User> getAllUser() {
		List<User> allUser = uRepo.findAll();
		return allUser;
	}

	@Override
	public User getUserById(int id) {
		return uRepo.findById(id).get();
				
		
	}

}
