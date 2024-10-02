package ma.solide.springdatarest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.solide.springdatarest.model.User;
import ma.solide.springdatarest.model.UserDto;
import ma.solide.springdatarest.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDto getUser(Long id) {
		Optional<User> user = this.userRepository.findById(id);
		if (user.isPresent())
			return User.toUserDto(user.get());
		else
			return null;
	}

	public User saveUser(UserDto userDto) {
		return this.userRepository.save(UserDto.toUser(userDto));
	}

	public void deleteUser(Long id) {
		this.userRepository.deleteById(id);
	}

	public List<User> getAll() {
		return this.userRepository.findAll();
	}
}
