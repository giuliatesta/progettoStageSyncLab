<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Aggiungi Paziente</title>
</head>
<body>
<h3>Form per aggiungere un nuovo paziente</h3>

<h2>Informazioni personali</h2>
<form>
    <div class="container">
        <div class="row pt-4">
            <div class="col-md-6">
                <label>Nome:</label>
                <label>
                    <input type="text" class="form-control"
                           placeholder="Inserisci il nome"
                           required name="nome_paziente"
                           autocapitalize="words" autofocus>
                </label>
            </div>
            <div class="col-md">
                <label>Cognome:</label>
                <label>
                <input type="text" class="form-control"
                       placeholder="Inserisci il cognome" required
                       name="cognome_paziente" autocapitalize="words">
                </label>
            </div>
        </div>
        <div class="row pt-2">
            <div class="col-md-6">
                <label>Codice Fiscale:</label>
                <label>
                    <input type="text" class="form-control"
                           placeholder="Inserisci il codice fiscale" required
                           name="codice_fiscale_paziente" minlength="16" maxlength="16">
                </label>
            </div>
            <div class="col-md-6">
                <label>Telefono:</label>
                <label>
                    <input type="tel" class="form-control"
                           placeholder="Inserisci il numero di telefono" required
                           name="numero_telefono_paziente">
                </label>
            </div>
            <div class="col-md-6">
                <label>E-mail:</label>
                <label>
                    <input type="email" class="form-control"
                           placeholder="Inserisci l'e-mail" required
                           name="mail_paziente">
                </label>
            </div>
        </div>
        <div class="row pt-2">
            <div class="col-md-6">
                <label>Età:</label>
                <label>
                    <input type="number" class="form-control"
                           name="eta_paziente" maxlength="3"
                           placeholder="Inserisci la tua età" required>
                </label>
            </div>
            <div class="col-md-6">
                <label>Sesso:</label><br>
                <label>
                    <input type="radio" name="sesso_paziente" required>
                </label> Maschio
                <label>
                    <input type="radio" name="sesso_paziente" required>
                </label> Femmina
                <label>
                    <input type="radio" name="sesso_paziente" required>
                </label> Preferisco non dirlo
            </div>
        </div>
        <h2>Informazioni mediche</h2>
        <div class="row pt-2">
            <div class="col-12">
                <label>Peso:</label>
                <label>
                    <input type="number" class="form-control"
                           placeholder="Inserisci il tuo peso in kg"
                           name="dimensione_vita_paziente">
                </label>
            </div>
        </div>
        <div class="row pt-2">
            <div class="col-12">
                <label>Frequenza cardiaca minima:</label>
                <label>
                    <input type="number" class="form-control" placeholder=""
                           name="frequenza_cardiaca_minima_paziente" maxlength="3">
                </label>
                <label>Frequenza cardiaca massima:</label>
                <label>
                    <input type="number" class="form-control" placeholder=""
                           name="frequenza_cardiaca_massima_paziente" maxlength="3">
                </label>
            </div>
        </div>
        <div class="row pt-2">
            <div class="col-12">
                <label>Colesterolo minimo:</label>
                <label>
                    <input type="number" class="form-control" placeholder=""
                           name="colesterolo_minimo_paziente" maxlength="3">
                </label>
                <label>Colesterolo massimo:</label>
                <label>
                    <input type="number" class="form-control" placeholder=""
                           name="colesterolo_massimo_paziente" maxlength="3">
                </label>
            </div>
        </div>
        <div class="row pt-2">
            <div class="col-12">
                <label>Diabete:</label>
                <label>
                    <input type="checkbox" class="form-control"
                           name="diabete_paziente">
                </label>
                <label>Fumo:</label>
                <label>
                    <input type="checkbox" class="form-control"
                           name="fumo_paziente">
                </label>
            </div>
        </div>
        <div class="row pt-2">
            <div class="col-12">
                <label>Anamnesi:</label>
                <label>
                    <input type="number" class="form-control"
                           name="anamnesi_paziente">
                </label>
                <label>Note:</label>
                <label>
                    <input type="number" class="form-control"
                           name="note_paziente">
                </label>
            </div>
        </div>
        <div class="row pt-4 float-right">
            <button type="submit" class="btn btn-primary">Conferma</button>
        </div>
    </div>

</form>
</body>
</html>