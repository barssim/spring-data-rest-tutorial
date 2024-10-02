package ma.solide.springdatarest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.solide.springdatarest.model.User;
import ma.solide.springdatarest.model.UserDto;
import ma.solide.springdatarest.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/get_user")
	public UserDto getUser(@RequestParam Long id) {
		return this.userService.getUser(id);
	}
	
	@PostMapping("/save_user")
	public User saveUser(@RequestBody UserDto userDto) {
		return this.userService.saveUser(userDto);
	}
	
	@DeleteMapping("/delete_user")
	public void deleteUser(@RequestParam Long id)
	{
		this.userService.deleteUser(id);
	}
	
	@GetMapping("get_all")
	public List<User> getAll() {
		return this.userService.getAll();
	}
}
