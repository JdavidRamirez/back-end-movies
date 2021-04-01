package co.edu.iudigital.app.model.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "profile")
public class Profile implements Serializable {
	
	@Id
	@Column(name = "PROFILE_ID")
	private int id;
	
	private String NAME;
	
	/**
	 * @return the id
	 */
	
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the NAME
	 */
	public String getNAME() {
		return NAME;
	}
	
	/**
	 * @param id the NAME to set
	 */
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	
	


}
