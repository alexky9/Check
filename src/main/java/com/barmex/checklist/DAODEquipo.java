
package com.barmex.checklist;

import org.hibernate.Query;

public class DAODEquipo extends DAO{
    
    public void agregarDEquip(DatosEquipo datosequipo) {
    begin();
    getSession().save(datosequipo);
    commit();
    close();
    
    }
 
 public void borrardatEquipos(DatosEquipo de){
            begin();
            getSession().delete(de);
            commit();
            close();
 }   

  public DatosEquipo buscarPorId(String Id_datos_eq){
      begin();
     Query q = getSession().createQuery("from datos_equipo where Id_datos_eq = :Id_datos_eq");
        q.setString("Id_datos_eq",Id_datos_eq);
        DatosEquipo de = (DatosEquipo)q.uniqueResult();
        commit();
        close();
return de;  
   
  }  

}
