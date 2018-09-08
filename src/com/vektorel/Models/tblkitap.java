package com.vektorel.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table
@Entity
public class tblkitap {
	@Id
	@SequenceGenerator(name = "tblkitap_sq_id",
    allocationSize = 1, initialValue = 1,
    sequenceName = "tblkitap_sq_id")
	@GeneratedValue(generator = "tblkitap_sq_id")
	private long id;
	private String ad;
	private long yer_id;
	private long yazar1_id;
	private long yazar2_id;
	private long yazar3_id;
	private long kategori_id;
	private long yayinevi_id;
	private String aciklama;
	private int basimyili;
	private int sayfasayisi;
	private int sil_id;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public long getYer_id() {
		return yer_id;
	}
	public void setYer_id(long yer_id) {
		this.yer_id = yer_id;
	}
	public long getYazar1_id() {
		return yazar1_id;
	}
	public void setYazar1_id(long yazar1_id) {
		this.yazar1_id = yazar1_id;
	}
	public long getYazar2_id() {
		return yazar2_id;
	}
	public void setYazar2_id(long yazar2_id) {
		this.yazar2_id = yazar2_id;
	}
	public long getYazar3_id() {
		return yazar3_id;
	}
	public void setYazar3_id(long yazar3_id) {
		this.yazar3_id = yazar3_id;
	}
	public long getKategori_id() {
		return kategori_id;
	}
	public void setKategori_id(long kategori_id) {
		this.kategori_id = kategori_id;
	}
	public long getYayinevi_id() {
		return yayinevi_id;
	}
	public void setYayinevi_id(long yayinevi_id) {
		this.yayinevi_id = yayinevi_id;
	}
	public String getAciklama() {
		return aciklama;
	}
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public int getBasimyili() {
		return basimyili;
	}
	public void setBasimyili(int basimyili) {
		this.basimyili = basimyili;
	}
	public int getSayfasayisi() {
		return sayfasayisi;
	}
	public void setSayfasayisi(int sayfasayisi) {
		this.sayfasayisi = sayfasayisi;
	}
	public int getSil_id() {
		return sil_id;
	}
	public void setSil_id(int sil_id) {
		this.sil_id = sil_id;
	}
	
	
	
	
	
}
