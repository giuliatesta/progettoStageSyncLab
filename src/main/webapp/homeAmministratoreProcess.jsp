<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <title>Home Amministratore Process</title>
    </head>
    <body>
    <%
        if(!request.getParameter("aggiungi_medico").isEmpty()) {
            response.sendRedirect("aggiungiMedico.jsp");
        } else if(!request.getParameter("rimuovi_medico").isEmpty()) {
            response.sendRedirect("rimuoviMedico.jsp");
        }
    %>
</body>
</html>
