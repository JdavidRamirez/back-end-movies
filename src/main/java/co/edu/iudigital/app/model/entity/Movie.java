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
@Table(name="movie")

public class Movie implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MOVIE_ID")
	private int id;
	private String NAME;
	private String DESCRIPTION;
	private String IMAGE;
	@Column(name="CREATE_AT")
	private LocalDateTime createAt;
	@Column(name="RELEASE_DATE")
	private LocalDateTime releaseDate;
	private String ACTORS;
	@ManyToOne
	@JoinColumn(name="GENDER_ID")
	private Gender genderId;
	private String RATING;
	
	public Movie() {}
	public Movie(int id, String NAME, String DESCRIPTION, String IMAGE, LocalDateTime createAt,
			LocalDateTime releaseDate, String ACTORS, Gender genderId, String RATING) {
		super();
		this.id = id;
		this.NAME = NAME;
		this.DESCRIPTION = DESCRIPTION;
		this.IMAGE = IMAGE;
		this.createAt = createAt;
		this.releaseDate = releaseDate;
		this.ACTORS = ACTORS;
		this.genderId = genderId;
		this.RATING = RATING;
	}

	

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
	 * @param nAME the NAME to set
	 */
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	/**
	 * @return the dESCRIPTION
	 */
	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	/**
	 * @param dESCRIPTION the dESCRIPTION to set
	 */
	public void setDESCRIPTION(String DESCRIPTION) {
		this.DESCRIPTION = DESCRIPTION;
	}

	/**
	 * @return the IMAGE
	 */
	public String getIMAGE() {
		return IMAGE;
	}

	/**
	 * @param IMAGE the iMAGE to set
	 */
	public void setIMAGE(String IMAGE) {
		this.IMAGE = IMAGE;
	}

	/**
	 * @return the createAt
	 */
	public LocalDateTime getCreateAt() {
		return createAt;
	}

	/**
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	/**
	 * @return the releaseDate
	 */
	public LocalDateTime getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(LocalDateTime releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * @return the ACTORS
	 */
	public String getACTORS() {
		return ACTORS;
	}

	/**
	 * @param aCTORS the aCTORS to set
	 */
	public void setACTORS(String ACTORS) {
		this.ACTORS = ACTORS;
	}

	/**
	 * @return the genderId
	 */
	public Gender getGenderId() {
		return genderId;
	}

	/**
	 * @param genderId the genderId to set
	 */
	public void setGenderId(Gender genderId) {
		this.genderId = genderId;
	}

	/**
	 * @return the RATING
	 */
	public String getRATING() {
		return RATING;
	}

	/**
	 * @param rATING the RATING to set
	 */
	public void setRATING(String RATING) {
		this.RATING = RATING;
	}
	
	

}
