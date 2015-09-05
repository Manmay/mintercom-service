package za.co.mintercoservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tenant")
public class Tenant {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	@Column(name = "complex_id")
    private int complex_id; 
	
	@Column(name = "firstname")
    private String firstname; 
	
	@Column(name = "lastname")
    private String lastname;
	
	@Column(name = "uuid")
    private String uuid;
	
	@Column(name = "unit_no")
    private int unit_no;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getComplex_id() {
		return complex_id;
	}

	public void setComplex_id(int complex_id) {
		this.complex_id = complex_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getUnit_no() {
		return unit_no;
	}

	public void setUnit_no(int unit_no) {
		this.unit_no = unit_no;
	}  
    
}
