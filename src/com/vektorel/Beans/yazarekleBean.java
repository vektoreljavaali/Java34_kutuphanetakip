package com.vektorel.Beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.Dal.tblyazardao;
import com.vektorel.Models.tblyazar;

@ManagedBean(name="yazarekleBean")
@SessionScoped
public class yazarekleBean {

	private String ad;
	private List<tblyazar> liste = new ArrayList<>();
	tblyazardao db = new tblyazardao();
	private long silinecekid;
	public void kaydet() {
		tblyazar yz = new tblyazar();
		yz.setAd(ad);
		yz.setSil_id(1);
		db.Kaydet(yz);
	}
	
	public void sil() {
		tblyazar yz = new tblyazar();
		yz.setId(silinecekid);
		db.Sil(0, yz);		
	}
	
	
	public long getSilinecekid() {
		return silinecekid;
	}

	public void setSilinecekid(long silinecekid) {
		this.silinecekid = silinecekid;
	}

	public void silidsec(long id) {
		silinecekid = id;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public List<tblyazar> getListe() {
		return db.Listele(new tblyazar());
	}
	public void setListe(List<tblyazar> liste) {
		this.liste = liste;
	}
	
	
	
	
}









