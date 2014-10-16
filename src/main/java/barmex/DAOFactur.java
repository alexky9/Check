
package barmex;

import org.hibernate.Query;

public class DAOFactur extends DAO{
    
    public void agregarFactur(Factur factur) {
    begin();
    getSession().save(factur);
    commit();
    close();
    
    }
 
 public void borrardaFactur(Factur f){
            begin();
            getSession().delete(f);
            commit();
            close();
 }   

  public Factur buscarPor(String factura){
      begin();
     Query q = getSession().createQuery("from factur where factura = :factura");
        q.setString("factura",factura);
        Factur f = (Factur)q.uniqueResult();
        commit();
        close();
return f;  
   
  }  
}
