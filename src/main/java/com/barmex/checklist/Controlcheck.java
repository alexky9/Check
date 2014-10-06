
package com.barmex.checklist;

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
public class Controlcheck {
   
    @RequestMapping(value="/equipo/", method=RequestMethod.POST, 
    headers={"Accept=text/html"})
    
    public @ResponseBody
         
    String insertar(@PathVariable String nombre,
                   @PathVariable String asignacion,
                   @PathVariable String caracteristica,
                   @PathVariable String tipo,
                   @PathVariable String sucof,
                   @PathVariable String comentario,
                   @PathVariable String respaldos,
                   @PathVariable String contraseña,
                   @PathVariable String productkey,
                   @PathVariable String Id_datos_eq,
                   @PathVariable String Id_datos_en,
                   @PathVariable String Id_programa,
                   @PathVariable String Id_configuracion,
                   @PathVariable String Id_mantenimiento,
                   @PathVariable String Id_factur,
                   @PathVariable String Id_vnc,
                   @PathVariable String Id_agregado){
    
        DAOEquipos u=new DAOEquipos();
        u.agregarEquipo(new Equipo(1, nombre, asignacion, caracteristica, tipo, sucof, comentario, respaldos, contraseña, productkey, null, null, null, null, null, null, null, null));
                return "El equipo se agrego con exito";
  
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
