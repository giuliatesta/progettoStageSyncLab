<%@ page import="entity.Anagrafica" %>
<%@ page import="services.AmministratoreService" %>
<%@ page import="static services.AmministratoreService.findAnagraficaUtenteByCodiceFiscale" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Medico Process</title>
</head>
<body>
        <%
            if(request.getParameter("carica_cartella_clinica") != null) {
                String codiceFiscalePaziente = request.getParameter("codice_fiscale_paziente");
                Anagrafica paziente = findAnagraficaUtenteByCodiceFiscale(codiceFiscalePaziente);
                if (paziente != null) {
                    response.sendRedirect(
                            String.format("cartellaClinicaPaziente.jsp?cf=%s&new=false", codiceFiscalePaziente));
                } else {
                    response.sendRedirect("error.jsp");
                }
            }


            if(request.getParameter("aggiungi_paziente") != null) {
                response.sendRedirect("aggiungiPaziente.jsp");
            }
        %>
</body>
</html>
