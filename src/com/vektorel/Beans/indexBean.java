package com.vektorel.Beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.Dal.tblOgrencidao;
import com.vektorel.Models.tblOgrenci;

@SuppressWarnings("deprecation")
@ManagedBean(name="indexBean")
@SessionScoped
public class indexBean {

	
	private String maintitle= "AnaSayfa";
	private String subtitle="Yönetim Paneli";
	private String url="mainpage.xhtml";
	private String ad;
	private String soyad;
	tblOgrencidao db = new tblOgrencidao();
	private List<tblOgrenci> liste = new ArrayList<>();
	
	public void sayfasec(int id) {
		switch (id) {
		case 1:	url="mainpage.xhtml";	break;
		case 2: url="kitapislemleri/kitapekle.xhtml";
				maintitle="Kitap Ýþlemleri";
				subtitle="Kitap Ekle";
				break;
		case 3: url="kitapislemleri/kitaplistele.xhtml";
				maintitle="Kitap Ýþlemleri";
				subtitle="Kitap Listele";
				System.out.println("Kitap listele");
		break;
		
		case 4: url="kitapislemleri/yazarekle.xhtml";
		maintitle="Yazar Ýþlemleri";
		subtitle="Yazar Kayýt";
		
		break;
		case 5: url="kitapislemleri/yayineviekle.xhtml";
		maintitle="Yayýnevi Ýþlemleri";
		subtitle="Yayýnevi Kayýt";
		
		break;
		
				default:url="mainpage.xhtml";	break;
		}
	}
	
	public void kaydet() {
		
		tblOgrenci ogr = new tblOgrenci();
		ogr.setAd(ad);
		ogr.setSoyad(soyad);
		//liste.add(ogr);	
		db.Kaydet(ogr);
	}
	
	public void sil(int id) {
		
		tblOgrenci ogr = new tblOgrenci();
		ogr.setId(id);
		
		db.Sil(id,ogr);
		
	}
	
	
	public List<tblOgrenci> getListe() {
		return db.Listele(new tblOgrenci());
	}
	public void setListe(List<tblOgrenci> liste) {
		this.liste = liste;
	}



	public String getMaintitle() {
		return maintitle;
	}

	public void setMaintitle(String maintitle) {
		this.maintitle = maintitle;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

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
		
	
	
	
}
