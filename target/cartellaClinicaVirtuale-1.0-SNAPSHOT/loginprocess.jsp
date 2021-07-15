<%@ page import="services.LoginService" %>
<%@ page import="java.io.PrintWriter" %>
<jsp:useBean id="loginService" class="services.LoginService" scope="session"/>
<jsp:setProperty name="loginService" property="*"/>
<html>
    <%
        LoginService ls = new LoginService(loginService.getCodiceFiscale(), loginService.getPassword());
        if(ls.checkUsernameAndPassword()){

        } else {

        }
    %>
</html>
