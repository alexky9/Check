
package barmex;

import org.hibernate.Query;

public class DAODEnvio extends DAO{
    
    public void agregarDEnvio(DatosEnvio datosenvio) {
    begin();
    getSession().save(datosenvio);
    commit();
    close();
    
    }
 
 public void borrarDatosE(DatosEnvio e){
            begin();
            getSession().delete(e);
            commit();
            close();
 }   

  public DatosEnvio buscarPorNombre(String Id_datos_en){
      begin();
     Query q = getSession().createQuery("from datos_envio where Id_datos_en = :Id_datos_en");
        q.setString("Id_datos_en",Id_datos_en);
        DatosEnvio e = (DatosEnvio)q.uniqueResult();
        commit();
        close();
return e;  
   
  }  

}
