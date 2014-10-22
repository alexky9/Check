package barmex;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class Controlcheck{ 
   
    @RequestMapping(value="/equipo", method=RequestMethod.POST, 
    headers={"Accept=text/html"})
    
    public @ResponseBody
         
    String insertA(@PathVariable String nombre,
                   @PathVariable String asignacion,
                   @PathVariable String caracteristica,
                   @PathVariable String tipo,
                   @PathVariable String sucof,
                   @PathVariable String comentario,
                   @PathVariable String respaldos,
                   @PathVariable String contraseña,
                   @PathVariable String productkey,
                   @PathVariable Integer Id_datos_eq,
                   @PathVariable Integer Id_datos_en,
                   @PathVariable Integer Id_programa,
                   @PathVariable Integer Id_configuracion,
                   @PathVariable Integer Id_mantenimiento,
                   @PathVariable Integer Id_factur,
                   @PathVariable Integer Id_vnc,
                   @PathVariable Integer Id_agregado){
    
        DAOEquipos u=new DAOEquipos();
        u.agregarEquipo(new Equipo(1, nombre, asignacion, caracteristica, tipo, sucof, comentario, respaldos, contraseña, productkey, null, null, null, null, null, null, null, null));
                return "El equipo se agrego con exito";
  
    }
    
    String InsertB(@PathVariable Integer Id_datos_eq,
                   @PathVariable String nombre,
                   @PathVariable String modelo,
                   @PathVariable String ram,
                   @PathVariable String hd,
                   @PathVariable String procesador,
                   @PathVariable String so,
                   @PathVariable String serie,
                   @PathVariable String otro){
        
        DAODEquipo de=new DAODEquipo();
        de.agregarDEquip(new DatosEquipo(1, modelo, ram, hd, procesador, so, serie, otro, null));
                return "El equipo se agrego con exito";
    }
    
        String insertC(@PathVariable Integer Id_datos_en,
                       @PathVariable String fecha_llegada,
                       @PathVariable String fecha_envio,
                       @PathVariable String Recepcion,
                       @PathVariable String correo,
                       @PathVariable String registro){
            
        DAODEnvio e=new DAODEnvio();
          e.agregarDEnvio(new DatosEnvio(1, null, null, null, correo, null, null));
                return "El equipo se agrego con exito";
    }    
        
        String insertD(@PathVariable Integer Id_programa,
                       @PathVariable String nombre){
            
            DAOPrograma p= new DAOPrograma();
            p.agregarProg(new Programa(1, nombre, null));
            return "El equipo se agrego con exito";
        }
        
        String insertE(@PathVariable Integer Id_programa,
                       @PathVariable String nombre){
            
            DAOConfiguraciones c=new DAOConfiguraciones();
            c.agregarConfiguracion(new Configuraciones(1, nombre, null));
                return"El equipo se agrego con exito";
        
        }
        
        String insertF(@PathVariable Integer id_mantenimiento,
                       @PathVariable String limpiar,
                       @PathVariable String empacar,
                       @PathVariable String cargador,
                       @PathVariable String etiqueta){
            
            DAOMant m=new DAOMant();
            m.agregarManto(new Mantenimiento(1, limpiar, empacar, cargador, etiqueta, null));
            return "El equipo se agrego con exito";
            
        }
        
        String insertG(@PathVariable Integer Id_factur,
                       @PathVariable String factura,
                       @PathVariable String Proveedor,
                       @PathVariable float Precio){
            
            DAOFactur f= new DAOFactur();
            f.agregarFactur(new Factur(1, factura, Proveedor, Proveedor, null));
            return "El equipo se agrego con exito";
        }
        
        String insertH(@PathVariable Integer Id_vnc,
                       @PathVariable String nombre,
                       @PathVariable String tipo){
            
            DAOVnc v= new DAOVnc();
            v.agregarVnc(new Vnc(1, nombre, tipo, null));
            return "El equipo se agrego con exito";
        }
        
        String insertI(@PathVariable Integer Id_agregado,
                       @PathVariable String nombre){
            
            DAOAgregado a= new DAOAgregado();
            a.agregarAgregado(new Agregado(1, nombre, null));
                return"El equipo se agrego con exito";
        }
        
    @RequestMapping(value="/e", method=RequestMethod.GET, 
            headers={"Accept=application/json"})
    public @ResponseBody String buscartod()throws Exception{
     
  DAOEquipos g=new DAOEquipos();
  Map<String,List<Equipo>> singletonMap =Collections.singletonMap("equipo", g.buscarTodosEquipos());
  ObjectMapper mapper=new ObjectMapper();
  
  return mapper.writeValueAsString(g.buscarTodosEquipos());
    }
}   
