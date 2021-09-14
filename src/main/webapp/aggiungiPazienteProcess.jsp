<%@ page import="services.AmministratoreService" %>
<%@ page import="static services.AmministratoreService.isCodiceFiscalePresentInDB" %>
<%@ page import="entity.Anagrafica" %>
<%@ page import="entity.Login" %>
<%@ page import="static entity.Login.createPassword" %>
<%@ page import="static entity.Login.Ruolo.PAZIENTE" %>
<%@ page import="entity.CartellaClinica" %>
<%@ page import="static entity.CartellaClinica.createIdCartella" %>
<%@ page import="static java.lang.Integer.parseInt" %>
<%@ page import="static services.AmministratoreService.createAndSaveNewLogin" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Aggiungi Paziente Process</title>
</head>
<body>
    <%
        String nome = request.getParameter("nome_paziente");
        String cognome = request.getParameter("cognome_paziente");
        String codiceFiscale = request.getParameter("codice_fiscale_paziente");
        String email = request.getParameter("mail_paziente");
        String telefono = request.getParameter("numero_telefono_paziente");

        String eta = request.getParameter("eta_paziente");
        String sesso = request.getParameter("sesso_paziente");
        String peso = request.getParameter("peso_paziente");
        String dimensioneVita = request.getParameter("dimensione_vita_paziente");
        String frequenzaCardiacaMinima = request.getParameter("frequenza_cardiaca_minima_paziente");
        String frequenzaCardiacaMassima = request.getParameter("frequenza_cardiaca_massima_paziente");
        String colesteroloMinima = request.getParameter("colesterolo_minima_paziente");
        String colesteroloMassimo = request.getParameter("colesterolo_massima_paziente");
        boolean diabete = Boolean.parseBoolean(request.getParameter("diabete_paziente"));
        boolean fumo = Boolean.parseBoolean(request.getParameter("fumo_paziente"));
        String anamnesi = request.getParameter("anamnesi_paziente");
        String note = request.getParameter("note_paziente");

        if(!isCodiceFiscalePresentInDB(codiceFiscale)) {
            // Se non esiste gia un codice fiscale uguale a quello inserito
            Anagrafica paziente = new Anagrafica(codiceFiscale, nome, cognome, email, telefono);
            if(note != null) {
                paziente.setNote(note);
            }
            createAndSaveNewLogin(codiceFiscale, PAZIENTE);

            CartellaClinica cartellaClinica = new CartellaClinica(createIdCartella(), codiceFiscale);
            cartellaClinica.setEta(Integer.parseInt(eta));
            cartellaClinica.setSesso(sesso);
            cartellaClinica.setPeso(Double.parseDouble(peso));
            cartellaClinica.setDimensioneVita(Double.parseDouble(dimensioneVita));
            cartellaClinica.setFrequenzaCardiacaMinima(Integer.parseInt(frequenzaCardiacaMinima));
            cartellaClinica.setFrequenzaCardiacaMassima(Integer.parseInt(frequenzaCardiacaMassima));
            cartellaClinica.setColesteroloMinimo(Integer.parseInt(colesteroloMinima));
            cartellaClinica.setFrequenzaCardiacaMassima(Integer.parseInt(colesteroloMassimo));
            cartellaClinica.setDiabete(diabete);
            cartellaClinica.setFumo(fumo);
            cartellaClinica.setAnamnesi(anamnesi);
            AmministratoreService.saveNewCartellaClinica(cartellaClinica);
            response.sendRedirect(String.format("cartellaClinicaPaziente.jsp?cf=%s&new=true", codiceFiscale));
        } else {
            response.sendRedirect("error.jsp");
        }

    %>

</body>
</html>
