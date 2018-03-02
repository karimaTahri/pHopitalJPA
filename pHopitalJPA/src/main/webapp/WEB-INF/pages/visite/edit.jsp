<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Visite</h1>
		<form:form action="save" method="post" modelAttribute="visite">
			<form:hidden path="numero" />
			<form:hidden path="version" />
			<div class="form-group">
				<form:label path="patient">Patient</form:label>
				<form:select path="patient.numero">
					<option disabled selected>Pas de patient</option>
					<form:options itemValue="numero" itemLabel="nom"
						items="${patients}" />
				</form:select>
				<form:errors path="patient"></form:errors>
			</div>
			<div class="form-group">
				<form:label path="dateVisite">Date de la visite</form:label>
				<form:input path="dateVisite" type="date"/>
				<form:errors path="dateVisite"></form:errors>
			</div>
			<div class="form-group">
				<form:label path="salle">Salle</form:label>
				<form:input path="salle" />
				<form:errors path="salle"></form:errors>
			</div>
			
			<div class="form-group">
				<form:label path="tarif">Tarif</form:label>
				<form:input path="tarif" />
				<form:errors path="tarif"></form:errors>
			</div>
			<div class="form-group">
				<input type="submit" value="enregistrer" class="btn btn-primary">
				<a href="./list" class="btn btn-secondary">annuler</a>
			</div>
		</form:form>
	</div>
</body>
</html>