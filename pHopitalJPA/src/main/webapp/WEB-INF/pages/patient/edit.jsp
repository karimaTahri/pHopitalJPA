<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>edition de patient</h1>
		<div>
			<form:form action="save" method="post" modelAttribute="patient">
				<form:hidden path="version" />
				
				<div class="form-group">
					<form:label path="numero">Numero:</form:label>
					<form:input path="numero" readonly="true" />
					<form:errors path="numero"></form:errors>
				</div>
				
				<div class="form-group">
					<form:label path="nom">Nom:</form:label>
					<form:input path="nom" />
					<form:errors path="nom"></form:errors>
				</div>

				<div class="form-group">
					<form:label path="prenom">Prenom:</form:label>
					<form:input path="prenom" />
					<form:errors path="prenom"></form:errors>
				</div>
						
						
								
				<div class="form-group">
					<form:label path="adresse.numero">Numero:</form:label>
					<form:input path="adresse.numero" />
					<form:errors path="adresse.numero"></form:errors>
				</div>
				
				<div class="form-group">
					<form:label path="adresse.rue">Rue:</form:label>
					<form:input path="adresse.rue" />
					<form:errors path="adresse.rue"></form:errors>
				</div>
				
				<div class="form-group">
					<form:label path="adresse.codePostal">Code postal:</form:label>
					<form:input path="adresse.codePostal" />
					<form:errors path="adresse.codePostal"></form:errors>
				</div>
				
				<div class="form-group">
					<form:label path="adresse.ville">Ville:</form:label>
					<form:input path="adresse.ville" />
					<form:errors path="adresse.ville"></form:errors>
				</div>
				
				
				<div class="form-group">
					<form:label path="tel">Tel:</form:label>
					<form:input path="tel" />
					<form:errors path="tel"></form:errors>
				</div>
				
				<div class="form-group">
					<input type="submit" value="enregistrer" class="btn btn-primary">
					<a href="./list" class="btn btn-secondary">annuler</a>
				</div>
			</form:form>
		</div>
	</div>

</body>
</html>