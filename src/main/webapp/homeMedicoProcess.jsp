<%@ page import="entity.Anagrafica" %>
<%@ page import="services.AmministratoreService" %>
<%@ page import="static services.AmministratoreService.findMedicoByCodiceFiscale" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Medico Process</title>
</head>
<body>
        <%
            String codiceFiscalePaziente = request.getParameter("codice_fiscale_paziente");
            Anagrafica paziente = findMedicoByCodiceFiscale(codiceFiscalePaziente);
            if (paziente != null) {
                response.sendRedirect("cartellaClinicaPazente.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }
        %>
</body>
</html>
