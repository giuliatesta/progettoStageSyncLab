<%@ page import="services.AmministratoreService" %>
<%@ page import="static services.AmministratoreService.isCodiceFiscalePresentInDB" %><%--
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
    if(!isCodiceFiscalePresentInDB(codiceFiscale)) {
        boolean result = AmministratoreService.removeUtente(codiceFiscale);
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
