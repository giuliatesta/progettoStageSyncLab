<%@ page import="entity.Anagrafica" %>
<%@ page import="static services.AmministratoreService.*" %>
<%@ page import="entity.CartellaClinica" %>
<%@ page import="services.AmministratoreService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cartella Clinica Paziente</title>
</head>
<body>
    <%
        String codiceFiscale = request.getParameter("cf");
        Anagrafica paziente = findAnagraficaUtenteByCodiceFiscale(codiceFiscale);
        CartellaClinica cartellaClinica = findCartellaClinicaUtenteByCodiceFiscale(codiceFiscale);

        if("true".equals(request.getParameter("new"))) {

        }
    %>
    <h1>Cartella Clinica</h1>
    <br>
    <h3>Dati anagrafici</h3>
    <h3>Dati medici</h3>
    <br><br>

    <a href="logout.jsp">Rimuovi Paziente</a>
</body>
</html>
