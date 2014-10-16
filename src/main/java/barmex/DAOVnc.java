
package barmex;

import org.hibernate.Query;

public class DAOVnc extends DAO{
    
    public void agregarVnc(Vnc vnc) {
    begin();
    getSession().save(vnc);
    commit();
    close();
    }
 
 public void borrarVnc(Vnc v){
            begin();
            getSession().delete(v);
            commit();
            close();
 }   

  public Vnc buscarPorNombre(String nombre){
      begin();
     Query q = getSession().createQuery("from vnc where nombre = :nombre");
        q.setString("nombre",nombre);
        Vnc v = (Vnc)q.uniqueResult();
        commit();
        close();
return v;  
   
  }  
    
}
