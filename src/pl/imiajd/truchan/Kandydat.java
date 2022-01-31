package pl.imiajd.truchan;

public class Kandydat implements Cloneable, Comparable<Kandydat> {
    private String nazwa;
    private Integer wiek;
    private String wyksztalcony;
    private Integer latadoswiadczenia;

    public Kandydat(String nazwa, Integer wiek, String wyksztalcony, Integer latadoswiadczenia) {
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wyksztalcony = wyksztalcony;
        this.latadoswiadczenia = latadoswiadczenia;
    }

    public String getNazwa() {
        return this.nazwa;
    }

    public Integer getWiek() {
        return this.wiek;
    }

    public String getWyksztalcony() {
        return this.wyksztalcony;
    }

    public Integer getLataDoswiadczenia() {
        return this.latadoswiadczenia;
    }

    public String toString() {
        return this.wyksztalcony + ' ' + this.wiek + ' ' + this.latadoswiadczenia;
    }

    @Override
    public int compareTo(Kandydat o) {
        int result = this.wyksztalcony.compareTo(o.wyksztalcony);
        if(result != 0) {
            return result;
        }

        result = this.wiek.compareTo(o.wiek);
        if(result != 0) {
            return result;
        }

        result = this.wiek.compareTo(o.latadoswiadczenia);
        return result;
    }
}
