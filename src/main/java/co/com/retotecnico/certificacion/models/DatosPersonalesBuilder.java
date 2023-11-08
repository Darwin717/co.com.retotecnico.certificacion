package co.com.retotecnico.certificacion.models;

import java.util.List;
import java.util.Map;

public class DatosPersonalesBuilder {

    private String firstName;
    private String lastName;
    private String email;
    private String mes;
    private String dia;
    private String anio;
    private String city;
    private String codPostal;
    private String pais;
    private String pass;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {return email; }
    public String getMes() {return mes; }
    public String getDia() {return dia; }
    public String getAnio() {return anio; }
    public String getCity() {
        return city;
    }
    public String getCodPostal() {
        return codPostal;
    }
    public String getPais() {
        return pais;
    }
    public String getPass() {return pass; }

    public static DatosPersonalesBuilder con() {
        return new DatosPersonalesBuilder();
    }

    public DatosPersonalesBuilder firstName (List<Map<String, String>> datos) {
        this.firstName = datos.get(0).get("firstName");
        return this; }

    public DatosPersonalesBuilder lastName (List<Map<String, String>> datos) {
        this.lastName = datos.get(0).get("lastName");
        return this;}

    public DatosPersonalesBuilder email (List<Map<String, String>> datos) {
        this.email = datos.get(0).get("email");
        return this; }

    public DatosPersonalesBuilder mes (List<Map<String, String>> datos) {
        this.mes = datos.get(0).get("mes");
        return this; }

    public DatosPersonalesBuilder dia (List<Map<String, String>> datos) {
        this.dia = datos.get(0).get("dia");
        return this; }

    public DatosPersonalesBuilder anio (List<Map<String, String>> datos) {
        this.anio = datos.get(0).get("anio");
        return this; }

    public DatosPersonalesBuilder city (List<Map<String, String>> datos) {
        this.city = datos.get(0).get("city");
        return this; }

    public DatosPersonalesBuilder codPostal (List<Map<String, String>> datos) {
        this.codPostal = datos.get(0).get("codPostal");
        return this;}

    public DatosPersonalesBuilder pais (List<Map<String, String>> datos) {
        this.pais = datos.get(0).get("pais");
        return this;}

    public DatosPersonalesBuilder pass (List<Map<String, String>> datos) {
        this.pass = datos.get(0).get("pass");
        return this; }

    public CrearDatosPersonales build() {
        return new CrearDatosPersonales(this);
    }



}
