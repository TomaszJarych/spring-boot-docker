package tj.dev.test.user.dto;

import tj.dev.test.commons.base.dto.BaseDTO;

public class UserDto extends BaseDTO {

	private String firstName;
	private String lastName;
	private String email;
	private String login;

	private UserDto(Long id, String firstName, String lastName, String email, String login) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.login = login;
	}

	public UserDto() {
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

	public static class UserDtoBuilder {

		private Long id;
		private String firstName;
		private String lastName;
		private String email;
		private String login;
		
		public UserDtoBuilder() {
		}

		public UserDtoBuilder setId(Long id) {
			this.id = id;
			return this;
		}

		public UserDtoBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public UserDtoBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public UserDtoBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public UserDtoBuilder setLogin(String login) {
			this.login = login;
			return this;
		}

		public UserDto build() {
			return new UserDto(id, firstName, lastName, email, login);
		}

	}

	public static void main(String[] args) {
		UserDto dto = new UserDto.UserDtoBuilder().setId(1L)
				.setFirstName("Jan")
				.setLastName("Kowalski")
				.setEmail("jankowal@wp.pl")
				.setLogin("jank")
				.build();
	}

}
