
package com.barmex.checklist;

import org.hibernate.Query;

public class DAOMant extends DAO{
    
    public void agregarManto(Mantenimiento mantenimiento) {
    begin();
    getSession().save(mantenimiento);
    commit();
    close();
    }
 
 public void borrarManto(Mantenimiento m){
            begin();
            getSession().delete(m);
            commit();
            close();
 }   

  public Mantenimiento buscarPorId(String Id_mantenimiento){
      begin();
     Query q = getSession().createQuery("from mantenimiento where Id_mantenimiento = :Id_mantenimiento");
        q.setString("Id_mantenimiento",Id_mantenimiento);
        Mantenimiento m = (Mantenimiento)q.uniqueResult();
        commit();
        close();
return m;  
   
  }  
    
}
