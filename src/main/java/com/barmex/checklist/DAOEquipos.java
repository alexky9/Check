
package com.barmex.checklist;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;


public class DAOEquipos extends DAO {
    
 public void agregarEquipo(Equipo equipo) {
    begin();
    getSession().save(equipo);
    commit();
    close();
    
    }
 
    public List<Equipo> buscarTodosEquipos() {
        begin();
      //  Query q = getSession().createQuery("from Usuario");
        Criteria c=getSession().createCriteria(Equipo.class);
        List<Equipo> equipo = (List<Equipo>)c.list();
        commit();
        close();
         
return equipo; 
        
      
    }
 
 public void borrarUsuario(Equipo u){
            begin();
            getSession().delete(u);
            commit();
            close();
 }   

  public Equipo buscarPorNombre(String nombre){
      begin();
     Query q = getSession().createQuery("from Equipo where nombre = :nombre");
        q.setString("nombre",nombre);
        Equipo u = (Equipo)q.uniqueResult();
        commit();
        close();
return u;  
   
  }  

}
