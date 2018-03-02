<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<title>Liste des Visites</title>
</head>
<body>
<div class="container">
<h1>Liste des Visites</h1>
<table class="table">
<tr>
	<td>N°</td>  
	<td>Patient</td> 
	<td>Date de la visite</td>  
<!-- 	<td>Medecin</td>  --> 
	<td>Salle</td>
	<td>Tarif</td>
</tr>
<c:forEach items="${ list }" var="visite" >
<tr>
	<td><c:out value="${ visite.numero }" /></td>  
	<td><c:out value="${ visite.patient.prenom }" /> <c:out value="${ visite.patient.nom }" /></td>  
	<td><fmt:formatDate value="${ adherent.dateVisite }" pattern="dd/MM/yyyy"/></td>  
	<%-- <td><c:out value="${ visite.medecin.prenom }" /> <c:out value="${ visite.medecin.nom }" /></td>  --%>
	<td><c:out value="${ visite.salle}" /></td>
	<td><c:out value="${ visite.tarif }" /></td>
	<td><a href="edit?id=${ visite.numero }" class="btn btn-success">edition</a></td>
	<td><a href="delete?id=${ visite.numero }" class="btn btn-danger">suppresion</a></td>
</tr>
   
</c:forEach>
</table>
<a href="add" class="btn btn-info">ajout visite</a>
</div>
</body>
</html>