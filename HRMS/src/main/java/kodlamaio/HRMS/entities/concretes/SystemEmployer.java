package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "system_emploees")
public class SystemEmployer {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int user_id;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "position_id")
	private String position_id;

	public SystemEmployer() {
		super();
	}

	public SystemEmployer(int user_id, String firstname, String lastname, String position_id) {
		super();
		this.user_id = user_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.position_id = position_id;
	}

}
