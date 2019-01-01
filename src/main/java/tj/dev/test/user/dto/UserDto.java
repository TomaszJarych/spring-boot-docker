package tj.dev.test.user.dto;

import tj.dev.test.commons.base.dto.BaseDTO;

public class UserDto extends BaseDTO {

	private String firstName;
	private String lastName;
	private String email;
	private String login;

	public UserDto(Long id, String firstName, String lastName, String email, String login) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.login = login;
	}

	public UserDto() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
