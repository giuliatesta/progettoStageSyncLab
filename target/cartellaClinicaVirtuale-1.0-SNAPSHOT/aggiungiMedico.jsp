<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Aggiungi Medico</title>
</head>
<body>
    <h2>Cartella Clinica Virtuale</h2>
    <h3>Form per aggiungere un medico</h3>
    <form method="post" action="aggiungiMedicoProcess.jsp">
        Nome*:<label> <br/>
        <input type="text" name="nome_medico" autocapitalize="words" autofocus required>
    </label><br/><br/>
        Cognome*:<label> <br/>
        <input type="text" name="cognome_medico" autocapitalize="words" required>
    </label><br/><br/>
        Codice Fiscale*:<label> <br/>
        <input type="text" name="codice_fiscale_medico" minlength="16" maxlength="16" required>
    </label><br/><br/>
        E-mail:<label> <br/>
        <input type="email" name="mail_medico">
    </label><br/><br/>
        Telefono:<label> <br/>
        <input type="tel" name="numero_telefono_medico" minlength="9">
    </label><br/><br/>
        Ospedale di appartenenza:<label> <br/>
        <input type="text" name="ospedale_medico">
    </label><br/><br/>
        Specializzazione:<label> <br/>
        <input type="text" name="specializzazione_medico">
    </label><br/><br/>
        <input type="submit" value="Conferma" name = "conferma_aggiungi_medico"/>
    </form>

    <a href="homeAmministratore.jsp">Home amministratore</a>
    <a href="logout.jsp">Logout</a>
</body>
</html>
