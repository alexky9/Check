
package barmex;

import org.hibernate.Query;

public class DAOConfiguraciones extends DAO{
    
     public void agregarConfiguracion(Configuraciones configuraciones) {
    begin();
    getSession().save(configuraciones);
    commit();
    close();
    
    }
 
 public void borrarConfiguracion(Configuraciones c){
            begin();
            getSession().delete(c);
            commit();
            close();
 }   

  public Configuraciones buscarPorConfiguracion(String nombre){
      begin();
     Query q = getSession().createQuery("from Configuraciones where nombre = :nombre");
        q.setString("nombre",nombre);
        Configuraciones c = (Configuraciones)q.uniqueResult();
        commit();
        close();
return c;  
   
  }  
    
}
