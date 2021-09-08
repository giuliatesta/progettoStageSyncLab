<%@ page import="services.AmministratoreService" %>
<%@ page import="static services.AmministratoreService.isCodiceFiscaleValid" %>
<%@ page import="entity.Login" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Aggiungi Medico Process</title>
</head>
<body>
        <%
            String nome = request.getParameter("nome_medico");
            String cognome = request.getParameter("cognome_medico");
            String codiceFiscale = request.getParameter("codice_fiscale_medico");
            String email = request.getParameter("mail_medico");
            String telefono = request.getParameter("numero_telefono_medico");
            String ospedale = request.getParameter("ospedale_medico");
            String specializzazione = request.getParameter("specializzazione_medico");

            if(!isCodiceFiscaleValid(codiceFiscale)) {
                boolean result = AmministratoreService.addMedico(nome, cognome, codiceFiscale, email, telefono, ospedale, specializzazione);
                if(result) {
                    Login loginNuovoMedico = AmministratoreService.createAndSaveNewLogin(codiceFiscale);
                    response.sendRedirect("success.jsp");
                } else {
                    response.sendRedirect("error.jsp");
                }
            }
        %>

</body>
</html>
