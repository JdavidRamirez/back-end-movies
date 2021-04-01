package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name = "users")

public class Users implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private int user_Id;
	
	private String NAME;
	private String EMAIL;
	private String PASSWORD;
	
	@Column(name = "CREATE_AT")
	private LocalDateTime creatAt;
	
	@ManyToOne
	@JoinColumn(name = "PROFILE_ID")	
	private Profile profileId;

	/**
	 * @return the user_Id
	 */
	public int getUser_Id() {
		return user_Id;
	}

	/**
	 * @param user_Id the user_Id to set
	 */
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	/**
	 * @return the nAME
	 */
	public String getNAME() {
		return NAME;
	}

	/**
	 * @param nAME the nAME to set
	 */
	public void setNAME(String nAME) {
		NAME = nAME;
	}

	/**
	 * @return the eMAIL
	 */
	public String getEMAIL() {
		return EMAIL;
	}

	/**
	 * @param eMAIL the eMAIL to set
	 */
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	/**
	 * @return the pASSWORD
	 */
	public String getPASSWORD() {
		return PASSWORD;
	}

	/**
	 * @param pASSWORD the pASSWORD to set
	 */
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	/**
	 * @return the creatAt
	 */
	public LocalDateTime getCreatAt() {
		return creatAt;
	}

	/**
	 * @param creatAt the creatAt to set
	 */
	public void setCreatAt(LocalDateTime creatAt) {
		this.creatAt = creatAt;
	}

	/**
	 * @return the profileId
	 */
	public Profile getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(Profile profileId) {
		this.profileId = profileId;
	}
	
	
	

}
