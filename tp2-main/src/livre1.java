
public class livre1 {
    private String nomaut;
    private String prenomaut;
    private double prix;
    private int id;

    public livre1(int id, String nomaut, String prenomaut, double prix) {
        this.id = id;
        this.nomaut = nomaut;
        this.prenomaut = prenomaut;
        this.prix = prix;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomaut() {
        return this.nomaut;
    }

    public void setNomaut(String nomaut) {
        this.nomaut = nomaut;
    }

    public String getPrenomaut() {
        return this.prenomaut;
    }

    public void setPrenomaut(String prenomaut) {
        this.prenomaut = prenomaut;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}

