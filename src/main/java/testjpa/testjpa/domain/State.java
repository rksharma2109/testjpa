package testjpa.testjpa.domain;
import javax.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name = "state")
@NamedQuery(name = "State.findBystateCode", query = "SELECT statename FROM state p WHERE p.statecode = (?1)")
@Table(name = "state")
@Data
//test

public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name = "state_code")	
	private String statecode;
	@Column(name = "state_name")
	private String statename;
	protected State(){}
	

}
