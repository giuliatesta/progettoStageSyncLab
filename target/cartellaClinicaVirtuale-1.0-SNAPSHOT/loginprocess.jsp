<%@ page import="services.LoginService" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Login Form Process</title> 
    </head> 
    <body> 
    <%
        String codiceFiscale = request.getParameter("codiceFiscale");
        String password = request.getParameter("password");
        if(LoginService.checkUsernameAndPassword(codiceFiscale, password)) {
            switch (LoginService.findRuolo(codiceFiscale, password)) {
                case AMMINISTRATORE:
                    response.sendRedirect("homeAmministratore.jsp");
                    break;
                case MEDICO:
                    response.sendRedirect("homeMedico.jsp");
                    break;
                case PAZIENTE:
                    response.sendRedirect("homePazient.jsp");
                    break;
            }
        } else {
            response.sendRedirect("error.jsp");
        }
    %>
    </body> 
</html>
