package com.vektorel.Util;

import java.lang.reflect.Field;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class VeritabaniIsletimcisi<T> implements ICRUD<T>{

    private Session ss;
    private Transaction tt;
    
    private void baglantiyiAc(){
        ss = NewHibernateUtil.getSessionFactory().openSession();
        tt = ss.beginTransaction();
    }    
    
    private void baglantiyiSonlandir(){
        tt.commit();
        ss.close();
    }
    
    @Override
    public void Kaydet(T t) {
        try{
            baglantiyiAc();
            ss.save(t);
            baglantiyiSonlandir();            
        }catch(Exception ex){
        
        }
        
    }// Kaydet Sonu

    @Override
    public void Duzenle(T t) {
        try{
        baglantiyiAc();
        ss.update(t);
        baglantiyiSonlandir();        
        }catch(Exception ex){
        
        }
    }// Düzenle Sonu.

    @Override
    public void Sil(int id, T t) {
        try{
        baglantiyiAc();
        ss.delete(t);
        baglantiyiSonlandir();
        }catch(Exception ex){
        	
        }
    }

    @Override
    public List<T> Listele(T t) {
        List<T> returnlist=null;
        try{
            baglantiyiAc();
            Criteria cr = ss.createCriteria(t.getClass());
            returnlist = cr.list();
            baglantiyiSonlandir();
        }catch(Exception ex){
        }
        //try-> return ss.createCriteria(t.getClass()).list();
        //catch-> return null;
        return returnlist;
    }

    @Override
    public T Bul(long id,T t) {
       try{
           baglantiyiAc();
        Criteria cr = ss.createCriteria(t.getClass());
        cr.add(Restrictions.eq("id", id));
        if(cr.list().size()>0)
            return (T)cr.list().get(0);
        else
            return null;
       }catch(Exception ex){
           baglantiyiSonlandir();
           return null;
       }
    }

    @Override
    public List<T> Ara(String kolonadi, String aranadeger, T t) {
       List<T> liste;
        try{
           baglantiyiAc();
           Criteria cr = ss.createCriteria(t.getClass());
           cr.add(Restrictions.like(kolonadi, "%"+aranadeger+"%"));
           liste = cr.list();
           baglantiyiSonlandir();
       }
       catch(Exception ex){
           liste= null;
           baglantiyiSonlandir();
         }
        return liste;        
    }
    
    public List<T> SerbestArama(T t){
    
        List<T> liste;
        Class tm = t.getClass();
        Field[] sl = tm.getDeclaredFields();
        try{
           baglantiyiAc();
           Criteria cr = ss.createCriteria(t.getClass());
           for(int i=0;i<sl.length;i++){
            sl[i].setAccessible(true);
            if(sl[i]!=null && sl[i].getGenericType()==String.class)                
            cr.add(Restrictions.like(sl[i].getName(), "%"+sl[i].get(t)+"%"));
           }
             
           liste = cr.list();
           baglantiyiSonlandir();
       }
       catch(Exception ex){
           liste= null;
           baglantiyiSonlandir();
         }
        return liste;   
        
    }
    
}
