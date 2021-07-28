<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Amministratore</title>
    </head>
    <body>
        <h1>Amministratore</h1>
        <br>
        <form action="homeAmministratore.jsp" method="post">
            <input type="submit" value="Aggiungi medico" name="aggiungi_medico">
            <br/><input type="submit" value="Rimuovi medico" name="rimuovi_medico">
        </form>
        <br/><br/><br/><br/><br/>
        <a href="logout.jsp">Logout</a>

        <%
            if(request.getParameter("Aggiungi medico") != null) {
                response.sendRedirect("aggiungiMedico.jsp");
            } else if(request.getParameter("Rimuovi medico") != null) {
                response.sendRedirect("rimuoviMedico.jsp");
            }
        %>
    </body>
</html>
