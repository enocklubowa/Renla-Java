package com.renlaApp.backend.Renla.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "land")
public class Land extends AuditModel{

	  @Id
	    @GeneratedValue(generator = "question_generator")
	    @SequenceGenerator(
	            name = "question_generator",
	            sequenceName = "question_sequence",
	            initialValue = 1000
	    )
	private long id; 
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "climate")
	private String climate;
	
	@Column(name = "area")
	private Long area;
	
	@Column(name = "crops")
	private String crops;
	
	@Column(name = "images")
	private String images;

	
	protected Land() {
		super();
	}


	public Land(long id, String location, String climate, Long area, String crops, String images) {
		super();
		this.id = id;
		this.location = location;
		this.climate = climate;
		this.area = area;
		this.crops = crops;
		this.images = images;
	}




	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getClimate() {
		return climate;
	}


	public void setClimate(String climate) {
		this.climate = climate;
	}


	public Long getArea() {
		return area;
	}


	public void setArea(Long area) {
		this.area = area;
	}


	public String getCrops() {
		return crops;
	}


	public void setCrops(String crops) {
		this.crops = crops;
	}


	public String getImages() {
		return images;
	}


	public void setImages(String images) {
		this.images = images;
	}


	@Override
	public String toString() {
		return "Land [id=" + id + ", location=" + location + ", climate=" + climate + ", area=" + area + ", crops="
				+ crops + ", images=" + images + "]";
	}


}
