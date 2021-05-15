package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "jopseekers")
public class Jopseeker {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int user_id;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	public Jopseeker() {
		super();
	}

	public Jopseeker(int user_id, String firstname, String lastname) {
		super();
		this.user_id = user_id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

}
