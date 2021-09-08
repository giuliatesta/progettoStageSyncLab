<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Medico</title>
</head>
<body>
    <h1>Area riservata Medico</h1>
    <form action="homeMedicoProcess.jsp" method="post">
        Inserisci il codice fiscale del paziente:<label> <br/>
        <input type="text" name="codice_fiscale_paziente" minlength="16" maxlength="16" required>
    </label><br/><br/>
    </form>

    <a href="logout.jsp">Logout</a>
</body>
</html>
