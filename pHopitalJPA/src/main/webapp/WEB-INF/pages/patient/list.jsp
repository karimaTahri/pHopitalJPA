<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>listes des patients</h1>
		<div>
			<table class="table">
				<tr>
					<th>id</th>
					<th>nom</th>
					<th>prenom</th>
					<th>nom</th>
					<th>numero</th>
					<th>rue</th>
					<th>code postal</th>
					<th>ville</th>
					<th>tel</th>
				</tr>
				<c:forEach var="patient" items="${list}">
					<tr>
						<td>${patient.numero}</td>
						<td>${patient.nom}</td>
						<td>${patient.prenom}</td>
						<td>${patient.adresse.numero}</td>
						<td>${patient.adresse.rue}</td>
						<td>${patient.adresse.codePostal}</td>
						<td>${patient.adresse.ville}</td>
						<td>${patient.tel}</td>

						<td><a href="./edit?id=${patient.numero}"
							class="btn btn-success">edition</a></td>
							
						<td><a href="./delete?id=${patient.numero}"
							class="btn btn-danger">suppression</a></td>
					</tr>
				</c:forEach>
			</table>
			<a href="./add" class="btn btn-info">ajout de patient</a>
		</div>

	</div>
</body>
</html>