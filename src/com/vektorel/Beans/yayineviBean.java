package com.vektorel.Beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.Dal.tblyayinevidao;
import com.vektorel.Models.tblyayinevi;



@ManagedBean(name="yayineviBean")
@SessionScoped
public class yayineviBean {

	private String ad;
	private List<tblyayinevi> liste = new ArrayList<>();
	tblyayinevidao db = new tblyayinevidao();
	private long silinecekid;
	public void kaydet() {
		tblyayinevi yz = new tblyayinevi();
		yz.setAd(ad);
		yz.setSil_id(1);
		db.Kaydet(yz);
	}
	
	public void sil() {
		tblyayinevi yz = new tblyayinevi();
		yz.setId(silinecekid);
		db.Sil(0, yz);		
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public List<tblyayinevi> getListe() {
		return db.Listele(new tblyayinevi());
	}

	public void setListe(List<tblyayinevi> liste) {
		this.liste = liste;
	}

	public long getSilinecekid() {
		return silinecekid;
	}

	public void setSilinecekid(long silinecekid) {
		this.silinecekid = silinecekid;
	}
	
	
	
}
