<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
          xmlns:c="http://java.sun.com/jsp/jstl/core">
	<jsp:directive.page contentType="text/html; charset=UTF-8" 
		pageEncoding="UTF-8" session="false"/>
	<jsp:output doctype-root-element="html"
		doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
		doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
		omit-xml-declaration="true" />
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Mostrar Noticias</title>
</head>
<body>

<table class="simpletablestyle">
<thead>
<tr>
<th>Id</th>
<th>Titulo</th>
<th>Descripcion</th>
</tr>
</thead>
<tbody>

<c:forEach items="${noticias}" var="noticia">
	<tr>
		<td><c:out value="${noticia.id}"/></td>
		<td><c:out value="${noticia.titulo}"/></td>
		<td><c:out value="${noticia.descripcion}"/></td>
	</tr>
</c:forEach>
</tbody>
</table>	

</body>
</html>
</jsp:root>