package com.vektorel.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class tblOgrenci {

	@Id
	@SequenceGenerator(name = "ogr_sq_id",
    allocationSize = 1, initialValue = 1,
    sequenceName = "ogr_sq_id")
	@GeneratedValue(generator = "ogr_sq_id")
	private int id;
	private String ad;
	private String soyad;
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
