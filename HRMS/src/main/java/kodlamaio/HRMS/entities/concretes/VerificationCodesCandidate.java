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

@Table(name = "verification_codes_candidates")
public class VerificationCodesCandidate {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;

	@Column(name = "candidate_id")
	@NotNull
	@NotBlank
	private int candidate_id;

}
