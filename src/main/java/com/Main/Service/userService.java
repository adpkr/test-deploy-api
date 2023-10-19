package com.Main.Service;



import java.util.List;

import com.Main.Entity.User;


public interface userService {
	
	public User createUser(User user);
	
	public List<User> getAllUser();
	
	public User getUserById(int id);

}
