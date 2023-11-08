package co.com.retotecnico.certificacion.models;

public class CrearDatosPersonales {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String mes;
    private final String dia;
    private final String anio;
    private final String city;
    private final String codPostal;
    private final String pais;
    private final String pass;

    public CrearDatosPersonales(DatosPersonalesBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.email = builder.getEmail();
        this.mes = builder.getMes();
        this.dia = builder.getDia();
        this.anio = builder.getAnio();
        this.city = builder.getCity();
        this.codPostal = builder.getCodPostal();
        this.pais = builder.getPais();
        this.pass = builder.getPass();
    }


    public String getFirstName() { return firstName;}
    public String getLastName() { return lastName;}
    public String getEmail() {  return email;}
    public String getMes() {  return mes;}
    public String getDia() {  return dia;}
    public String getAnio() {  return anio;}
    public String getCity() { return city;}
    public String getCodPostal() { return codPostal;}
    public String getPais() { return pais;}
    public String getPass() {  return pass;}

}
