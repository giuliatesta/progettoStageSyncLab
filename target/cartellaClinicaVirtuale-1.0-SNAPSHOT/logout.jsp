<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Logout page</title>
  </head>
  <body>
    <%
      session.removeAttribute("username");
      session.removeAttribute("password");
      session.invalidate();
    %>
    <h1>Logout effettuato con successo. Arrivederci!</h1>
  </body>
</html>
