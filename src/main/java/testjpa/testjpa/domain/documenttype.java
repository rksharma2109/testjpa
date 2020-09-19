package testjpa.testjpa.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity(name = "documenttype")
@Table(name = "documenttype")
public class documenttype {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name = "document_code")
	private String documentcode;
	@Column(name = "document_type")
	private String documenttype;
	protected documenttype(){}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDocumentcode() {
		return documentcode;
	}
	public void setDocumentcode(String documentcode) {
		this.documentcode = documentcode;
	}
	public String getDocumenttype() {
		return documenttype;
	}
	public void setDocumenttype(String documenttype) {
		this.documenttype = documenttype;
	}
	

}
