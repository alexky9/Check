
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
   
    @RequestMapping(value="/equipo/{nombre}/{caracteristica}/{tipo}", method=RequestMethod.POST, 
    headers={"Accept=text/html"})
    
    public @ResponseBody
         
    String insertar(@PathVariable String nombre,
                   @PathVariable String asignacion,
                   @PathVariable String caracteristica,
                   @PathVariable String tipo,
                   @PathVariable String sucof,
                   @PathVariable String comentario,
                   @PathVariable String respaldos,
                   @PathVariable String contraseña){
    
        DAOChecklist u=new DAOChecklist();
        u.agregarEquipo(new Equipos (1, nombre,asignacion,caracteristica,tipo,sucof,comentario,respaldos,contraseña,new DatosEquipos(1, tipo, tipo, tipo, respaldos, sucof, sucof, tipo, null),new DatosEnvios(1, null, null, null, nombre, null, null),new Programa(1, nombre, null),new Configuraciones(1, nombre, sucof, null),new Mantenimiento(1, tipo, respaldos, respaldos, tipo, null),new Facturas(1, sucof, respaldos, sucof, null)));
        return "El equipo se agrego con exito";
  
    }
    
    @RequestMapping(value="/equipo", method=RequestMethod.GET, 
            headers={"Accept=application/json"})
    public @ResponseBody String buscartod()throws Exception{
     
  DAOChecklist g=new DAOChecklist();
  Map<String,List<Equipos>> singletonMap =Collections.singletonMap("equipo", g.buscarTodosEquipos());
  ObjectMapper mapper=new ObjectMapper();
  
  return mapper.writeValueAsString(g.buscarTodosEquipos());
    }
}   
