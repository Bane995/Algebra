class Osoba {

    private String ime;
    private String prezime;

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
}

class Clan extends Osoba {
    private int clanskiBroj;
    private List<String> posudjeneKnjige;

    public Clan(String ime, String prezime, int clanskiBroj) {
        super(ime, prezime);
        this.clanskiBroj = clanskiBroj;
        this.posudjeneKnjige = new ArrayList<>();
    }

    public int getClanskiBroj() {
        return clanskiBroj;
    }

    public List<String> getPosudjeneKnjige() {
        return posudjeneKnjige;
    }

    public void dodajKnjigu(String naslov) {
        posudjeneKnjige.add(naslov);
    }

    public void ukloniKnjigu(String naslov) {
        posudjeneKnjige.remove(naslov);
    }

    @Override
    public String toString() {
        return super.toString() + " (Članski broj: " + clanskiBroj + ")";
    }

}
