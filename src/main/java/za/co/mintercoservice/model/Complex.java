package za.co.mintercoservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "complex")
public class Complex {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name; 
	
	@Column(name = "security_company")
	private String security_company; 
	
	@Column(name = "no_of_gates")
	private int no_of_gates;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecurity_company() {
		return security_company;
	}
	public void setSecurity_company(String security_company) {
		this.security_company = security_company;
	}
	public int getNo_of_gates() {
		return no_of_gates;
	}
	public void setNo_of_gates(int no_of_gates) {
		this.no_of_gates = no_of_gates;
	} 
	
	

}
