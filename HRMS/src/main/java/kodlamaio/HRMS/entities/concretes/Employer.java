package kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

@Table(name = "employers")
public class Employer {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "company_name")
	@NotNull
	@NotBlank
	private String company_name;

	@Column(name = "web_address")
	@NotNull
	@NotBlank
	private String web_address;
	
	@ManyToOne
	@JoinColumn(name = "id")
	private EmployerPhone employerPhone;
}
