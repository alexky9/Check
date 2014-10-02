
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
                   @PathVariable String productkey,
                   @PathVariable String modelo,
                   @PathVariable String ram,
                   @PathVariable String hd,
                   @PathVariable String procesador,
                   @PathVariable String so,
                   @PathVariable String serie,
                   @PathVariable String otro,
                   @PathVariable String contraseña,
                   @PathVariable String fechaLlegada,
                   @PathVariable String fechaEnvio,
                   @PathVariable String fechaRecepcion,
                   @PathVariable String correo,
                   @PathVariable String registro,
                   @PathVariable String limpiar,
                   @PathVariable String empacar,
                   @PathVariable String cargador,
                   @PathVariable String etiqueta,
                   @PathVariable String factura,
                   @PathVariable String proveedor,
                   @PathVariable String precio){
    
        DAOEquipos u=new DAOEquipos();
        u.agregarEquipo(new Equipo(1, nombre, asignacion, caracteristica, tipo, 
                        sucof,comentario, respaldos, contraseña, productkey,
                        new DatosEquipo(1, modelo, ram, hd, procesador, so, serie, otro, null),
                        new DatosEnvio(1, null, null, null, correo, null, null),
                        new  Programa(1, nombre, null), new Configuraciones(1, nombre, null),
                        new Mantenimiento(1, limpiar, empacar, cargador, etiqueta, null),
                        new Factur(1, factura, proveedor, precio, null), new Vnc(1, nombre, tipo, null),
                        new Agregado(1, nombre, null)));
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
