package ma.solide.springdatarest.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

	private long id;
	
	private String firstName;

	private String lastName;

	private String email;

	public static User toUser(UserDto userDto)
	{
		return User.builder()
				.id(userDto.getId())
				.firstName(userDto.getFirstName())
				.lastName(userDto.getLastName())
				.email(userDto.getEmail())
				.build();
	}
}
