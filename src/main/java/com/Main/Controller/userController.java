package com.Main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Main.Entity.User;

import com.Main.Repository.userRepository;
import com.Main.Service.userService;

@Controller
public class userController {
	
	@Autowired
	private userService uSer;
	
	@GetMapping("/")
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<String>("welcome to User Api...!",HttpStatus.OK);
	}
	
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User createUser = uSer.createUser(user);
		return new ResponseEntity<User>(createUser,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUserHandler(){
		List<User> allUser = uSer.getAllUser();
		return new ResponseEntity<List<User>>(allUser,HttpStatus.OK);
		
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable (value = "id")int id){
		User userById = uSer.getUserById(id);
		return new ResponseEntity<User>(userById,HttpStatus.OK);
				
	}
	
	
//	@GetMapping("/users")
//	public List<User> getAllUser(){
//		return this.uRepo.findAll();
//	}
	
//	@GetMapping("users/{id}")
//	public User getUserById(@PathVariable (value = "id")int id) {
//		
//		return this.uRepo.findById(id);
//		
//	}
//	
//	
	
//	
//	@PutMapping("/users/{id}")
//	public User updateUser(@RequestBody User user, @PathVariable (value ="id" )int id) {
//		
//		User exUser= this.uRepo.findById(id)
//				.orElseThrow(()-> new resourceNotFoundException("User not found with this "+id));
//		exUser.setFirstName(user.getFirstName());
//		exUser.setLastName(user.getLastName());
//		exUser.setEmail(user.getEmail());
//		
//		return this.uRepo.save(exUser);
//		
//	}
//	
//	@DeleteMapping("/users/{id}")
//	public ResponseEntity<User> deleteUserById(@PathVariable (value ="id" )int id){
//		
//		User u= this.uRepo.findById(id)
//				.orElseThrow(()-> new resourceNotFoundException("User not found with this "+id));
//		
//	    this.uRepo.delete(u);
//	    return ResponseEntity.ok().build();
//		
//	}

}
