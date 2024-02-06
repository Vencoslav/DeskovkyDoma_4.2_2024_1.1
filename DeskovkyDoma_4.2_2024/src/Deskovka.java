public class Deskovka {
    private String nazev;
    private Boolean vlastnictvi;
    private Integer hodnoceni;

    public Deskovka(String nazev, Boolean vlastnictvi,Integer hodnoceni){
        this.nazev = nazev;
        this.vlastnictvi = vlastnictvi;
        this.hodnoceni = hodnoceni;
    }


    public String getNazev(){
        return nazev;
    }

    public Boolean getVlastnictvi() {
        return vlastnictvi;
    }

    public Integer getHodnoceni() {
        return hodnoceni;
    }

    public void setNazev(String nazev){
        this.nazev = nazev;
    }

    public void setVlastnictvi(Boolean vlastnictvi) {
        this.vlastnictvi = vlastnictvi;
    }

    public void setHodnoceni(Integer hodnoceni) {
        this.hodnoceni = hodnoceni;
    }
}
