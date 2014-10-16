
package barmex;

import org.hibernate.Query;

public class DAOAgregado extends DAO{
    
     public void agregarAgregado(Agregado agregado) {
    begin();
    getSession().save(agregado);
    commit();
    close();
    
    }
 
 public void borrarAgregado(Agregado a){
            begin();
            getSession().delete(a);
            commit();
            close();
 }   

  public Agregado buscarPorAgregado(String nombre){
      begin();
     Query q = getSession().createQuery("from Agregado where nombre = :nombre");
        q.setString("nombre",nombre);
        Agregado a = (Agregado)q.uniqueResult();
        commit();
        close();
return a;  
   
  }  
    
}
