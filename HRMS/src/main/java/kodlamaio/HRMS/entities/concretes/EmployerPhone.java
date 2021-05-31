package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity

@AllArgsConstructor
@NoArgsConstructor

@Table(name = "employer_phones")
public class EmployerPhone {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "employer_id")
	@NotNull
	@NotBlank
	private int employer_id;
	
	@Column(name = "phone_number")
	@NotBlank
	@NotNull
	private String phone_number;
	
}
