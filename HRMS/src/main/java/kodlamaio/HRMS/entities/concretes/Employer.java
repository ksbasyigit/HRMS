package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 * @return
 */
@Data
@Entity
@Table(name="Employers")
public class Employer {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="phone_number")
	private String phone_number;
	
	public Employer() {
		super();
	}

	public Employer(int user_id, String company_name, String phone_number) {
		super();
		this.user_id = user_id;
		this.company_name = company_name;
		this.phone_number = phone_number;
	}

}
