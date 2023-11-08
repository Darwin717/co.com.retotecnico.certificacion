package co.com.retotecnico.certificacion.utils.enums;

public enum Urls {
    URL_RETO("https://www.utest.com");

    private final String url;

    Urls(String url) {
        this.url = url;
    }

    @Override
    public String toString() { return url; }

}