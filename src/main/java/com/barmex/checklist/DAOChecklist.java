
package com.barmex.checklist;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;


public class DAOChecklist extends DAO {
    
 public void agregarEquipo(Equipos equipo) {
    begin();
    getSession().save(equipo);
    commit();
    close();
    
    }
 
    public List<Equipos> buscarTodosEquipos() {
        begin();
      //  Query q = getSession().createQuery("from Usuario");
        Criteria c=getSession().createCriteria(Equipos.class);
        List<Equipos> equipo = (List<Equipos>)c.list();
        commit();
        close();
         
return equipo; 
        
      
    }
 
 public void borrarUsuario(Equipos u){
            begin();
            getSession().delete(u);
            commit();
            close();
 }   

  public Equipos buscarPorNombre(String nombre){
      begin();
     Query q = getSession().createQuery("from Equipo where nombre = :nombre");
        q.setString("nombre",nombre);
        Equipos u = (Equipos)q.uniqueResult();
        commit();
        close();
return u;  
   
  }  }
