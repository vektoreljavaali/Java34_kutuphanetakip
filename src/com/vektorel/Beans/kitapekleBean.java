package com.vektorel.Beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.Dal.tblyazardao;
import com.vektorel.Models.tblyazar;

@ManagedBean(name="kitapekleBean")
@SessionScoped
public class kitapekleBean {

	tblyazardao dbyazar = new tblyazardao();
	
	private List<tblyazar> yazarlistesi = new ArrayList<>();

	public List<tblyazar> getYazarlistesi() {
		System.out.println("yazar çek");
		return dbyazar.Listele(new tblyazar());
	}

	public void setYazarlistesi(List<tblyazar> yazarlistesi) {
		this.yazarlistesi = yazarlistesi;
	}
	
	
	
	
}








