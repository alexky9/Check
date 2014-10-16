<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link href="../Documents/NetBeansProjects/CheckList/src/main/webapp/path/to/multiselect.css" media="screen" rel="stylesheet" type="text/css">
<style type="text/css">
.s {
	font-family: "Lucida Console", Monaco, monospace;
	font-size: 12px;
}
.container .content table tr td fieldset table tr th {
	font-family: Georgia, "Times New Roman", Times, serif;
	font-size: 12px;
}

.container .content table tr td fieldset table tr td {
	font-size: 12px;
	font-family: Georgia, "Times New Roman", Times, serif;
	font-weight: bold;
}

</style>
</head>
  <body>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
        <input type="text" name="nombre" id="nombre" /></td>
        <td>&nbsp;</td>
        <td>Maquina tipo:</td>
        <td width="104"><select name="tipo" id="tipo">
          <option value="Escritorio">Escritorio</option>
          <option value="Laptop">Laptop</option>
          <option value="Server">Server</option>
          <option value="Virtual">Virtual</option>
        </select></td>
        <td width="177">
        </form>
        <label for="tipo"></label></td>
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
        <td colspan="4"><input type="text" name="asignado" id="asignado" /></td>
        <td>Caracteristica:</td>
        <td><select name="caracter" id="caracter">
          <option value="Nueva">Nueva</option>
          <option value="Reparacion">Reparacion</option>
          <option value="Reasignada">Reasignada</option>
        </select></td>
        <td colspan="2"><label for="caracter"></label></td>
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
        <td colspan="4"><input name="sucof" type="text" id="sucof" size="40" /></td>
        <td colspan="3">Product Key
        <input name="Product key" type="text" id="productkey" size="35" /></td>
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
        <input type="text" name="Id_factura" id="id_factura" /></td>
        <td colspan="2">Proveedor:
        <input type="text" name="Proveedor" id="proveedor" /></td>
        <td colspan="2">Precio: 
        <input type="text" name="Precio" id="precio" /></td>
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
            <input type="text" name="Modelo" id="modelo" /> 
             Disco Duro:   
             <input type="text" name="HD" id="hd" />
    Memoria RAM:
    <input type="text" name="RAM" id="ram" />
          </p>
          <p>Procesador:
<input type="text" name="Procesador" id="procesador" />
          Sistema Operativo: 
            <input type="text" name="SO" id="so" />
          No. Serie
           <input type="text" name="Serie" id="serie" />
          </p>
          <p>Otro: 
            <input type="text" name="Otro_dat" id="otro_dat" />
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
            <input type="text" name="Fecha_ll1" id="fecha_ll1" />
            Fecha de envio:
            <input type="text" name="Fecha_en" id="fecha_en" />
          </p>
          <p>Fecha de recepcion:
            <input type="text" name="Fecha_ll2" id="fecha_ll2" /> 
            Se envio correo:
            <select name="Correo" id="correo">
              <option value="Si">Si</option>
              <option value="No">No</option>
            </select>
          </p>
          <p>Registrado en inventario:
            <input type="text" name="Reginv" id="reginv" />
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
              <td>
                <input type="checkbox" name="Chrome" id="Chrome" />
                <label for="Chrome">Chrome</label>
              </form></td>
              <td>&nbsp;</td>
              <td><input type="checkbox" name="Paper port" id="Paper port" />
                Paper port</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
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
              <td rowspan="2"><select name="Compresor2">
                <option value="0">selecciona VNC</option>
                <option value="VNC">VNC</option>
                <option value="Tight VNC">Tight VNC</option>
                </optgroup>
              </select></td>
              <td colspan="4"><input type="checkbox" name="Cliente" id="cliente" />
                Cliente</td>
              <td>&nbsp;</td>
              <td colspan="4">&nbsp;</td>
            </tr>
            <tr>
              <td colspan="2"><input type="checkbox" name="Server" id="server" />
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
          <table width="815" height="183" border="0">
            <tr>
              <th width="167" scope="row">
                <input type="checkbox" name="Diccionario de Lotus" id="Diccionario de Lotus" />
                Diccionario de Lotus</span></th>
              <td width="17">&nbsp;</td>
              <td width="150">
                <input type="checkbox" name="Archivado de Lotus" id="Archivado de Lotus" />
                Archivado de Lotus</td>
              <td width="10">&nbsp;</td>
              <td colspan="2">
                <input type="checkbox" name="Impresoras" id="Impresoras" />
                Impresoras</td>
              <td width="3">&nbsp;</td>
              <td width="217">
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
              <td rowspan="2"><input type="checkbox" name="Base cotizaciones" id="Base cotizaciones" />
                <label for="Base cotizaciones">Base cotizaciones</label></td>
              <td>&nbsp;</td>
              <td colspan="2" rowspan="2"><input type="checkbox" name="Configuracion puertos lotus" id="Configuracion puertos lotus" />
                <label for="Configuracion puertos lotus">Configuracion puertos lotus</label></td>
              <td rowspan="2">&nbsp;</td>
              <td rowspan="2"><input type="checkbox" name="Actualizacion y parches" id="Actualizacion y parches" />
Actualizacion y parches</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              </tr>
            <tr>
              <th colspan="2" scope="row"><input type="checkbox" name="Configuracion Sametime" id="Configuracion Sametime" />
                <label for="Configuracion Sametime">Configuracion Sametime</label></th>
              <th scope="row">&nbsp;</th>
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
              <th height="35" colspan="3" scope="row">&nbsp;</th>
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
                <select name="limpiar2" id="limpiar2">
                  <option value="Si">Si</option>
                  <option value="No">No</option>
                </select></th>
              <td width="158">Empacar
                <select name="empacar" id="empacar">
                  <option value="Si">Si</option>
                  <option value="No">No</option>
                </select></td>
              <td width="191">Checar cargador
                <select name="checar cargador" id="checar cargador">
                  <option value="Si">Si</option>
                  <option value="No">No</option>
                </select></td>
              <td width="206">Etiquetar garantias
                <select name="etiquetar garantias" id="etiquetar garantias">
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
            <input name="Respaldos" type="text" id="respaldos" size="100" />
          </p>
          <p>Contraseñas:
            <input name="Contraseña" type="text" id="contraseña" size="100" />
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
        <input name="Comentario" type="text" id="comentario" size="99" /></td>
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
     $(document).ready(function(){
         
        $("#Guardar").click(function(){

 $.ajax({
      
                url:"http://localhost:8095/CheckList/",
                method:'POST',
            data:{
                        nombre:$("#nombre").val(),
                        asignacion:$("#asignacion").val(),
                        caracteristica:$("#caracteristica").val(),
                        tipo:$("#tipo").val(),
                        sucof:$("#sucof").val(),
                        comentario:$("#comentario").val(),
                        respaldos:$("#respaldos").val(),
                        contraseña:$("#contraseña").val(),
                        productkey:$("#productkey").val(),
                        limpiar:$("#limpiar2").val(),
                        empacar:$("#empacar").val(),
                        cargador:$("#checar cargador").val(),
                        etiqueta:$("#etiquetar garantias").val(),
                        modelo:$("#modelo").val(),
                        ram:$("#ram").val(),
                        hd:$("#hd").val(),
                        procesador:$("#procesador").val(),
                        so:$("SO").val(),
                        serie:$("#serie").val(),
                        llegada:$("#fecha_ll1").val(),
                        envio:$("#fecha_en").val(),
                        recibo:$("#fecha_ll2").val(),
                        correo_en:$("#correo").val(),
                        inventario:$("#reginv").val(),
                        programa:$("#programa").val(),
                        configuracion:$("#configuracion").val(),
                        factura:$("#nombre_fac").val(),
                        Proveedor:$("#proveedor").val(),
                        Precio:$("#precio").val()
                    },
                    
               
                    success:function(){
                         alert("Se guardaron los datos con exito");  
               },
               error: function (){
                   alert("No sirve")
               }
              });
             });
            });
        </script>
</body>
</html>