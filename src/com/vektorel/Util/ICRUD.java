package com.vektorel.Util;

import java.util.List;

public interface ICRUD<T> {
	
	public void Kaydet(T t);
	    
	    public void Duzenle(T t);
	    
	    public void Sil(int id,T t);
	    
	    public List<T> Listele(T t);
	    
	    public T Bul(long id, T t);
	    
	    public List<T> Ara(String kolonadi, String aranandeger, T t);
	    
}
