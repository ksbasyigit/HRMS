package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name="users")

public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, int user_id, String email, String password) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
