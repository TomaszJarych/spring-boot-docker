package tj.dev.test.user.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import tj.dev.test.commons.base.entity.BaseEntity;

@Entity
@Table(name = "app_user")
public class User extends BaseEntity {

	private String firstName;
	private String lastName;
	private String email;
	private String login;

	public User(Long id, String firstName, String lastName, String email, String login) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.login = login;
	}

	public User() {
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
