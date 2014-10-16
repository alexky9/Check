
package barmex;

import org.hibernate.Query;

public class DAOPrograma extends DAO{
    
    public void agregarProg(Programa programa) {
    begin();
    getSession().save(programa);
    commit();
    close();
    }
 
 public void borrarProg(Programa p){
            begin();
            getSession().delete(p);
            commit();
            close();
 }   

  public Programa buscarPorNombre(String nombre){
      begin();
     Query q = getSession().createQuery("from programa where nombre = :nombre");
        q.setString("nombre",nombre);
        Programa p = (Programa)q.uniqueResult();
        commit();
        close();
return p;  
   
  }  
    
}
