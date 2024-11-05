public class Polaznik {

    private String ime;
    private String prezime;
    private Integer dob;
    private String spol;

    Polaznik(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }

    Polaznik(String ime, String prezime, Integer dob, String spol){
        this.ime = ime;
        this.prezime = prezime;
        this.dob = dob;
        this.spol = spol;
    }

    Polaznik(){

    }

    public String dohvatiIme() {
        return this.ime;
    }

    public String dohvatiPrezime() {
        return this.prezime;
    }

    public void promjeniDob(Integer novaVrijednostDob) {
        this.dob = novaVrijednostDob;
    }

    public void promjeniIme(String novoIme) {
        this.ime = novoIme;
    }

    public void promjeniPrezime(String novoPrezime) {
        this.prezime = novoPrezime;
    }

}
