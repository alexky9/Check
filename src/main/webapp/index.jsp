<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="../Documents/NetBeansProjects/CheckList/src/main/webapp/path/to/multiselect.css" media="screen" rel="stylesheet" type="text/css">
<link href="../Documents/NetBeansProjects/CheckList/src/main/webapp/SpryAssets/SpryValidationCheckbox.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.s {
	font-family: "Lucida Console", Monaco, monospace;
	font-size: 12px;
}

</style>
</head>
  <body>
      <form name="new_check" action="" onsubmit="agregarequipo(); return false">
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" id="new_check"/>
<title>Checklist</title>
<style type="text/css">
<!--
body {
	font: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;
	background-color: #42413C;
	margin: 0;
	padding: 0;
	color: #000;
}

ul, ol, dl { 
	padding: 0;
	margin: 0;
}
h1, h2, h3, h4, h5, h6, p {
	margin-top: 0;	
	padding-right: 15px;
	padding-left: 15px; 
}
a img { 
	border: none;
}

a:link {
	color: #42413C;
	text-decoration: underline; 
}
a:visited {
	color: #6E6C64;
	text-decoration: underline;
}
a:hover, a:active, a:focus { 
	text-decoration: none;
}

.container {
	width: auto;
	background-color: #FFF;
	margin: 0 auto; 
	overflow: hidden; 
}
.sidebar1 {
	float: left;
	width: auto;
	background-color: #0099FF;
	padding-bottom: 10px;
	height: 1550px;
}
.content {

	padding: 10px 0;
	width: auto;
	float: left;
}
.content ul, .content ol { 
	padding: 0 15px 15px 40px;
}

ul.nav {
	list-style: none; 
	border-top: 1px solid #666;
	margin-bottom: 15px; 
}
ul.nav li {
	border-bottom: 1px solid #666; 
}
ul.nav a, ul.nav a:visited { 
	padding: 5px 5px 5px 15px;
	display: block; 
	width: 160px;  
	text-decoration: none;
	background-color: #00CCFF;
}
ul.nav a:hover, ul.nav a:active, ul.nav a:focus { 
	background-color: #0033FF;
	color: #FFF;
}

.fltrt {  
	float: right;
	margin-left: 8px;
}
.fltlft { 
	float: left;
	margin-right: 8px;
}
.clearfloat { 
	clear:both;
	height:0;
	font-size: 1px;
	line-height: 0px;
}
.container .content table tr td {
	font-size: 12px;
	text-align: left;
}
.container .content table tr th {
	text-align: left;
	font-size: 12px;
}
-->
</style></head>

<body>

<div class="container">
  <div class="sidebar1">
    <ul class="nav">
    <p>&nbsp;</p>
    <p>&nbsp;</p>
  
      <li><a href="#" onClick="location.href = 'busqueda.jsp' ">Buscar CheckList</a></li>
    </ul>
    <p>&nbsp;</p>
</div>
  <div class="content">
    <table width="875" border="0">
      <tr>
        <th width="2" scope="row">&nbsp;</th>
        <td colspan="3">&nbsp;</td>
        <td width="116">&nbsp;</td>
        <td width="197">CHECKLIST</td>
        <td width="106">&nbsp;</td>
        <td width="104">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td width="113">&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>Nombre del equipo:</td>
        <td colspan="3"><label for="Nombre"></label>
        <input type="text" name="Nombre" id="Nombre" /></td>
        <td>&nbsp;</td>
        <td>Maquina tipo:</td>
        <td width="104"><select name="Tipo" id="Tipo">
          <option value="Escritorio">Escritorio</option>
          <option value="Laptop">Laptop</option>
          <option value="Server">Server</option>
          <option value="Virtual">Virtual</option>
        </select></td>
        <td width="177">
        </form>
        <label for="Tipo"></label></td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>Reasignado a:</td>
        <td colspan="4"><input type="text" name="Asignado" id="Asignado" /></td>
        <td>Caracteristica:</td>
        <td><select name="Caracter" id="Caracter">
          <option value="Nueva">Nueva</option>
          <option value="Reparacion">Reparacion</option>
          <option value="Reasignada">Reasignada</option>
        </select></td>
        <td colspan="2"><label for="Caracter"></label></td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>Sucursal/Oficina:</td>
        <td colspan="5"><input name="sucof" type="text" id="sucof" size="40" /></td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td colspan="4">Factura: 
        <input type="text" name="Id_factura" id="Id_factura" /></td>
        <td colspan="2">Proveedor:
        <input type="text" name="Proveedor" id="Proveedor" /></td>
        <td colspan="2">Precio: 
        <input type="text" name="Precio" id="Precio" /></td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td colspan="9"><fieldset>
          <legend>Datos de Equipo: </legend>
          <p>Modelo:                    
            <input type="text" name="Modelo" id="Modelo" /> 
             Disco Duro:   
             <input type="text" name="HD" id="HD" />
    Memoria RAM:
    <input type="text" name="RAM" id="RAM" />
          </p>
          <p>Procesador:
<input type="text" name="Procesador" id="Procesador" />
          Sistema Operativo: 
            <input type="text" name="SO" id="SO" />
          No. Serie
           <input type="text" name="Serie" id="Serie" />
          </p>
          <p>Otro: 
            <input type="text" name="Otro_dat" id="Otro_dat" />
          </p>
        </fieldset></td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td colspan="9"><fieldset>
          <legend>Datos de Envio:</legend>
          <p>Fecha de llegada:
            <input type="text" name="Fecha_ll1" id="Fecha_ll1" />
            Fecha de envio:
            <input type="text" name="Fecha_en" id="Fecha_en" />
          </p>
          <p>Fecha de recepcion:
            <input type="text" name="Fecha_ll2" id="Fecha_ll2" /> 
            Se envio correo:
            <select name="Correo" id="Correo">
              <option value="Si">Si</option>
              <option value="No">No</option>
            </select>
          </p>
          <p>Registrado en inventario:
            <input type="text" name="Reginv" id="Reginv" />
          </p>
        </fieldset></td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td colspan="9"><fieldset>
          <legend>Programas:</legend>
          <table width="730" height="231" border="0">
            <tr>
              <th width="125" scope="row"><input type="checkbox" name="Adobe Reader" id="Adobe Reader" />
                Adobe Reader</th>
              <td width="1">&nbsp;</td>
              <td width="120">
                <input type="checkbox" name="Adobe Flash" id="Adobe Flash" />
                Adobe Flash</td>
              <td width="1">&nbsp;</td>
              <td width="152">
                <input type="checkbox" name="Pdf Creator" id="Pdf Creator" />
                Pdf Creator</td>
              <td width="1">&nbsp;</td>
              <td width="142">
                <input type="checkbox" name="Java" id="Java" />
                Java</td>
              <td width="5">&nbsp;</td>
              <td colspan="2">
                <input type="checkbox" name="Lotus" id="Lotus" />
                Lotus</td>
            </tr>
            <tr>
              <th scope="row">
                <input type="checkbox" name="Open Office" id="Open Office" />
                Open Office</span></th>
              <td>&nbsp;</td>
              <td>
                <input type="checkbox" name="GoGlobal" id="GoGlobal" />
                GoGlobal</td>
              <td>&nbsp;</td>
              <td>
                <input type="checkbox" name="Barracuda Flex" id="Barracuda Flex" />
                Barracuda Flex</td>
              <td>&nbsp;</td>
              <td>
                <input type="checkbox" name="Skype" id="Skype" />
                Skype</td>
              <td>&nbsp;</td>
              <td colspan="2">
                <input type="checkbox" name="ShowMyPc" id="ShowMyPc" />
                ShowMyPc</td>
            </tr>
            <tr>
              <th scope="row">
                <input type="checkbox" name="Mikogo" id="Mikogo" />
                Mikogo</span></th>
              <td>&nbsp;</td>
              <td>
                <input type="checkbox" name="ODBC" id="ODBC" />
                ODBC</td>
              <td>&nbsp;</td>
              <td>
                <input type="checkbox" name="MySQL" id="MySQL" />
                MySQL</td>
              <td>&nbsp;</td>
              <td>
                <input type="checkbox" name="BARPRO" id="BARPRO" />
                BARPRO</td>
              <td>&nbsp;</td>
              <td colspan="2">
                <input type="checkbox" name="ERP" id="ERP" />
                ERP</td>
            </tr>
            <tr>
              <th scope="row">
                <input type="checkbox" name="Compaq" id="Compaq" />
                Compaq</th>
              <td>&nbsp;</td>
              <td><input type="checkbox" name="Winrar" id="Winrar" />
                Winrar</td>
              <td>&nbsp;</td>
              <td colspan="6">&nbsp;</td>
            </tr>
            <tr>
              <th height="21" colspan="3" scope="row">Otro:
                <input name="otro" type="text" id="otro" size="10" /></th>
              <td>&nbsp;</td>
              <td colspan="6">&nbsp;</td>
            </tr>
            <tr>
              <th height="21" colspan="10" scope="row">Teamviewer id:
                <input type="text" name="id_team" id="id_team" /></th>
              </tr>
            <tr>
              <td rowspan="2"><select name="Compresor2" id="nom_vnc">
                <option value="0">selecciona VNC</option>
                <option value="VNC">VNC</option>
                <option value="Tight VNC">Tight VNC</option>
                </optgroup>
              </select></td>
              <td colspan="4"><input type="checkbox" name="Cliente" id="Cliente" />
                Cliente</td>
              <td>&nbsp;</td>
              <td colspan="4">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="2"><input type="checkbox" name="Server" id="Server" />
                Server</td>
              <td>&nbsp;</td>
              <td><select name="Antivirus">
                <option selected="selected" value="0">Seleccione Antivirus</option>
                <option value="1">Kaspersky</option>
                <option value="2">Symantec</option>
                </optgroup>
              </select></td>
              <td>&nbsp;</td>
              <td colspan="2"><select name="Framework">
                <option value="0">Framework version</option>
                <option value="3">3</option>
                <option value="4">4</option>
                </optgroup>
              </select></td>
              <td width="1">&nbsp;</td>
              <td width="132"><select name="Office">
                <option selected="selected" value="0">Version Office</option>
                <option value="1">Office 2003</option>
                <option value="2">Office 2007</option>
                <option value="3">Office 2010</option>
                </optgroup>
              </select></td>
            </tr>
            <tr>
              <th height="24" scope="row">&nbsp;</th>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td colspan="4">&nbsp;</td>
              </tr>
          </table>
        </fieldset></td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td colspan="9"><fieldset>
          <legend>Configuracion:</legend>
          <table width="695" height="183" border="0">
            <tr>
              <th width="158" scope="row">
                <input type="checkbox" name="Diccionario de Lotus" id="Diccionario de Lotus" />
                Diccionario de Lotus</span></th>
              <td width="10">&nbsp;</td>
              <td width="152">
                <input type="checkbox" name="Archivado de Lotus" id="Archivado de Lotus" />
                Archivado de Lotus</td>
              <td width="9">&nbsp;</td>
              <td colspan="2">
                <input type="checkbox" name="Impresoras" id="Impresoras" />
                Impresoras</td>
              <td width="13">&nbsp;</td>
              <td width="212">
                <input type="checkbox" name="Punto de restauracion" id="Punto de restauracion" />
                Punto de restauracion</td>
            </tr>
            <tr>
              <th scope="row">
                <input type="checkbox" name="Unidades Y y Z" id="Unidades Y y Z" />
                Unidades Y y Z</th>
              <td>&nbsp;</td>
              <td><span id="sprycheckbox21">
                <input type="checkbox" name="DLL Barpro" id="DLL Barpro" />
                DLL Barpro</td>
              <td>&nbsp;</td>
              <td colspan="2">
                <input type="checkbox" name="Cuentas" id="Cuentas" />
                Cuentas</td>
              <td>&nbsp;</td>
              <td>
                <input type="checkbox" name="Quitar IP y Maquina de AD" id="Quitar IP y Maquina de AD" />
                Quitar IP y Maquina de AD</td>
            </tr>
            <tr>
              <th scope="row">
                <input type="checkbox" name="Permisos" id="Permisos" />
                Permisos</th>
              <td>&nbsp;</td>
              <td><span id="sprycheckbox25">   <input type="checkbox" name="Bases de Lotus" id="Bases de Lotus" />
                Bases de Lotus</td>
              <td>&nbsp;</td>
              <td colspan="2">
                <input type="checkbox" name="Sacar discos" id="Sacar discos" />
                Sacar discos</td>
              <td>&nbsp;</td>
              <td>
                <input type="checkbox" name="Configuracion ODBC" id="Configuracion ODBC" />
               Configuracion ODBC</td>
            </tr>
            <tr>
              <th rowspan="2" scope="row"><input type="checkbox" name="Drivers" id="Drivers" />
                Drivers</th>
              <td rowspan="2">&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td colspan="2">&nbsp;</td>
              <td rowspan="2">&nbsp;</td>
              <td rowspan="2"><input type="checkbox" name="Actualizacion y parches" id="Actualizacion y parches" />
Actualizacion y parches</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td colspan="2">&nbsp;</td>
            </tr>
            <tr>
              <th scope="row">&nbsp;</th>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td colspan="4" rowspan="2"><fieldset>
                <legend>Pertenece a: </legend>
                <table width="30" border="0">
                  <tr>
                    <th scope="row"><table width="158" border="0">
                      <tr>
                        <td colspan="3"><input type="checkbox" name="Dominio" id="Dominio" />
                          Dominio</td>
                        <th width="18" scope="row">&nbsp;</th>
                      </tr>
                      <tr>
                        <td colspan="3"><input type="checkbox" name="Grupo" id="Grupo" />
                          Grupo</td>
                        <th scope="row">&nbsp;</th>
                      </tr>
                    </table></th>
                  </tr>
                </table>
              </fieldset></td>
              </tr>
            <tr>
              <th height="35" colspan="3" scope="row">Product Key
                <input name="Product key" type="text" id="Product key" size="35" /></th>
              <td>&nbsp;</td>
              </tr>
          </table>
        </fieldset></td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td colspan="9"><fieldset>
          <legend>Mantenimiento Preventivo:</legend>
          <table width="731" border="0">
            <tr>
              <th width="158" scope="row">Limpiar
                <select name="Limpiar2" id="Limpiar2">
                  <option value="Si">Si</option>
                  <option value="No">No</option>
                </select></th>
              <td width="158">Empacar
                <select name="Empacar" id="Empacar">
                  <option value="Si">Si</option>
                  <option value="No">No</option>
                </select></td>
              <td width="191">Checar cargador
                <select name="Checar cargador" id="Checar cargador">
                  <option value="Si">Si</option>
                  <option value="No">No</option>
                </select></td>
              <td width="206">Etiquetar garantias
                <select name="Etiquetar garantias" id="Etiquetar garantias">
                  <option value="Si">Si</option>
                  <option value="No">No</option>
                </select></td>
            </tr>
          </table>
        </fieldset></td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td colspan="9"><fieldset>
          <legend>Archivos:</legend>
          <p>Respaldos: 
            <input name="Respaldos" type="text" id="Respaldos" size="100" />
          </p>
          <p>Contraseñas:
            <input name="Contraseña" type="text" id="Contraseña" size="100" />
          </p>
        </fieldset></td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td colspan="9">Comentario:
        <input name="Comentario" type="text" id="Comentario" size="99" /></td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td colspan="5">&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
      <tr>
        <th scope="row">&nbsp;</th>
        <td>&nbsp;</td>
        <td width="11">&nbsp;</td>
        <td width="11">&nbsp;</td>
        <td>&nbsp;</td>
        <td><input type="submit" name="Guardar" id="Guardar" value="Guardar" /></td>
        <td><input type="reset" name="Limpiar" id="Limpiar" value="Limpiar" /></td>
        <td>&nbsp;</td>
        <td colspan="2">&nbsp;</td>
      </tr>
    </table>
    <h1>&nbsp;</h1>
</div>
</div>
    <script>
$("#Guardar").click(function(){

    //var nombre=$("#nombre").val();
    //var asignacion=$("#asignacion").val();
    //var caracteristica=$("#caracter").val();
    //var tipo=$("#tipo").val();
    //var sucof=$("#sucof").val();
    //var comentario=$("#comentario").val();
    //var respaldos=$("#Respaldos").val();
    //var contraseña=$("#Contraseña").val();
    //var limpiar=$("#Limpiar2").val();
    //ar empacar=$("#empacar").val();
    //var cargador=$("#Checar cargador").val();
    //var etiqueta=$("#Etiquetar garantias").val();
    //var modelo=$("#Modelo").val();
    //var ram=$("#RAM").val();
    //var hd=$("#HD").val();
    //var procesador=$("#procesador").val();
    //var so=$("SO").val();
    //var serie=$("#Serie").val();
    //var llegada=$("#Fecha_ll1").val();
    //var envio=$("#Fecha_en").val();
    //var recibo=$("#Fecha_ll2").val();
    //var correo_en=$("#Correo").val();
    //var inventario=$("#Reg inv").val();
    //var programa=$("#programa").val();
    //var configuracion=$("#configuracion").val();
    //var factura=$("#nombre_fac").val();
    //var Proveedor=$("#proveedor").val();
    //var Precio=$("#precio").val();
    
    $.ajax({
        
        method:'POST',
        url:"http://localhost:8095/CheckList/agregar/equipo",
        
        success:function(valor){
           
            alert(e);
            
        },
        failure:function(e){
            alert(e);
        }
    });
});

     $("#Limpiar").click(function(){
         
          switch(this.type) {
            case 'nombre':
            case 'asignado':
                $(this).val('');
                break;
            case 'checkbox':
                this.checked = false;
            }
         
     };       
             
  </script>
    
</body>
</html>