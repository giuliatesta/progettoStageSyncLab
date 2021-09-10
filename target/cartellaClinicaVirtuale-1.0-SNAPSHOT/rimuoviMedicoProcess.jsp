<%@ page import="services.AmministratoreService" %>
<%@ page import="static services.AmministratoreService.isCodiceFiscaleValid" %><%--
  Created by IntelliJ IDEA.
  User: giuli
  Date: 02/09/2021
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rimuovi Medico Process</title>
</head>
<body>
<%
    String codiceFiscale = request.getParameter("codice_fiscale_medico");
    if(!isCodiceFiscaleValid(codiceFiscale)) {
        boolean result = AmministratoreService.removeMedico(codiceFiscale);
        System.out.println(result);
        if(result) {
            response.sendRedirect("success.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }
%>
</body>
</html>
