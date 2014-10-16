<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>Busqueda CheckList</title>
<style type="text/css">

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
.container table tr td {
	font-family: "Lucida Sans Unicode", "Lucida Grande", sans-serif;
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
      <li><a href="#" onClick="location.href = 'index.jsp' ">Agregar CheckList</a></li>
    </ul>
    <p>&nbsp;</p>
    </div>
  <table width="650" border="0">
    <tr>
      <th width="158" scope="col">&nbsp;</th>
      <th width="125" scope="col">&nbsp;</th>
      <th width="191" scope="col">&nbsp;</th>
      <th width="158" scope="col">&nbsp;</th>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>CHECKLIST</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>Nombre del equipo:</td>
      <td><input name="Nombre_equipo" type="text" id="Nombre_equipo" size="35" /></td>
      <td><input type="submit" name="Buscar" id="Buscar" value="Buscar" /></td>
    </tr>
  </table>
</div>
    <script>
        
      function recuperarNombre(nombre)
{
    try
    {
       
        var datos = "Id=1&nombre=" + nombre.id;
        $.ajax(
            {
              
                type: "get",
               
                url: "http://localhost:8095/CheckList/agregar/equipo",
                
                data: datos,
               
                context : { "nombre" : nombre },
               
                error: callback_error,
          
                success: recuperarAlumnos_callback
            });
    }
    catch(ex)
    {
        alert(ex.description);
    }
}
    </script>
</body>
</html>
