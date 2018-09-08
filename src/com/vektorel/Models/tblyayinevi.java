package com.vektorel.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblyayinevi {

	@Id
	@SequenceGenerator(name = "tblyayinevi_sq_id",
    allocationSize = 1, initialValue = 1,
    sequenceName = "tblyayinevi_sq_id")
	@GeneratedValue(generator = "tblyayinevi_sq_id")

	private Long id;
	private String ad;
	private int sil_id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getSil_id() {
		return sil_id;
	}
	public void setSil_id(int sil_id) {
		this.sil_id = sil_id;
	}
	
	
}
