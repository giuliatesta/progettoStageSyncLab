<%@ page import="entity.Anagrafica" %>
<%@ page import="services.AmministratoreService" %>
<%@ page import="static services.AmministratoreService.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cartella Clinica Paziente</title>
</head>
<body>
    <form method="post">

    </form>
    <%
        String codiceFiscale = request.getParameter("cf");
        Anagrafica paziente = findMedicoByCodiceFiscale(codiceFiscale);
    %>
    <a href="logout.jsp">Rimuovi Paziente</a>
</body>
</html>
