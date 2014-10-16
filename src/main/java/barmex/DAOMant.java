
package barmex;

import org.hibernate.Query;

public class DAOMant extends DAO{
    
    public void agregarManto(Mantenimiento m) {
    begin();
    getSession().save(m);
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
