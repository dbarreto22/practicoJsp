x<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Noticias</title>
</head>
<body>
<head>
<title>Noticias</title>
</head>

<form id="reg" action="crearNServlet" method="POST">
	<table>
		<tr>
			<td style="text-align: right;"><label for="id">Id:</label></td>
			<td><input type="text" id="id" name="id" value="${noticia.id}" /></td>
		</tr>

		<tr>
			<td style="text-align: right;"><label for="titulo">Titulo:</label>
			</td>
			<td><input type="text" id="titulo" name="titulo"
				value="${noticia.titulo}" /></td>
		</tr>
		<tr>
			<td style="text-align: right;"><label for="descripcion">Descripcion:</label>
			</td>
			<td><input type="text" id="descripcion" name="descripcion"
				value="${noticia.descripcion}" /></td>
		</tr>

	</table>

	<p>
		<input id="crearNoticia" type="submit" value="Crear Noticia" />
	</p>


</form>
</body>
	</html>
