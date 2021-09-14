<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Aggiungi Paziente</title>
</head>
<body>
    <h3>Form per aggiungere un nuovo paziente</h3>

    <h2>Informazioni generiche</h2>
    <form method="post" action="aggiungiPazienteProcess.jsp">
        Nome:<label> <br/>
        <input type="text" name="nome_paziente" autocapitalize="words" autofocus required>
    </label><br/><br/>
        Cognome:<label> <br/>
        <input type="text" name="cognome_paziente" autocapitalize="words" required>
    </label><br/><br/>
        Codice Fiscale:<label> <br/>
        <input type="text" name="codice_fiscale_paziente" minlength="16" maxlength="16" required>
    </label><br/><br/>
        Telefono:<label> <br/>
        <input type="tel" name="numero_telefono_paziente" minlength="9">
    </label><br/><br/>
        E-mail:<label> <br/>
        <input type="email" name="mail_paziente">
    </label><br/><br/>
        <h2>Informazioni mediche</h2>
        Età:<label> <br/>
        <input type="number" name="eta_paziente" maxlength="3" required>
    </label><br/><br/>
        Sesso:<label> <br/>
        <input type="text" name="sesso_paziente" required maxlength="1">
    </label><br/><br/>
        Peso:<label> <br/>
        <input type="number" name="peso_paziente">
    </label><br/><br/>
        Dimensione Vita:<label> <br/>
        <input type="number" name="dimensione_vita_paziente">
    </label><br/><br/>
        Frequenza Cardiaca:<label>
            minima: <input type="number" name="frequenza_cardiaca_minima_paziente" maxlength="3">
            massima: <input type="number" name="frequenza_cardiaca_massima_paziente" maxlength="3">
    </label><br/><br/>
        Costerolo:<label>
            minimo: <input type="number" name="colesterolo_minimo_paziente" maxlength="3">
            massimo: <input type="number" name="colesterolo_massimo_paziente" maxlength="3">
       </label><br/><br/>
        Diabete:<label>
        <input type="checkbox" name="diabete_paziente" checked>
    </label><br/><br/>
        Fumo:<label>
        <input type="checkbox" name="fumo_paziente" checked>
    </label><br/><br/>
        Anamnesi:<label> <br/>
        <input type="text" name="anamnesi_paziente">
    </label><br/><br/>
        Note:<label> <br/>
        <input type="" name="note_paziente">
    </label><br/><br/>
        <input type="submit" value="Conferma" name = "conferma_aggiungi_paziente"/>
</form>

</body>
</html>
