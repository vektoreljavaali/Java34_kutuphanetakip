package com.vektorel.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblyer {

	@Id
	@SequenceGenerator(name = "tblyer_sq_id",
    allocationSize = 1, initialValue = 1,
    sequenceName = "tblyer_sq_id")
	@GeneratedValue(generator = "tblyer_sq_id")
	private Long id;
	private String rafadi;
	private String siraadi;
	private int sil_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRafadi() {
		return rafadi;
	}
	public void setRafadi(String rafadi) {
		this.rafadi = rafadi;
	}
	public String getSiraadi() {
		return siraadi;
	}
	public void setSiraadi(String siraadi) {
		this.siraadi = siraadi;
	}
	public int getSil_id() {
		return sil_id;
	}
	public void setSil_id(int sil_id) {
		this.sil_id = sil_id;
	}
	
	
}
