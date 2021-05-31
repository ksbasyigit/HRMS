package kodlamaio.HRMS.entities.concretes;

import java.time.LocalDate;

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

@Table(name = "candidates")
public class Candidate {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	@NotNull
	@NotBlank
	private String first_name;

	@Column(name = "last_name")
	@NotNull
	@NotBlank
	private String last_name;

	@Column(name = "identification_number")
	@NotNull
	@NotBlank
	private String identification_number;

	@Column(name = "birth_date")
	@NotNull
	@NotBlank
	private LocalDate birth_date;

	@ManyToOne()
	@JoinColumn(name = "id")
	private VerificationCodesCandidate verificationCodesCandidate;

}
