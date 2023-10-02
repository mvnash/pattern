package ex1;

public abstract class Produit {
    private String name;
    private int anneeDeParution;
    private double prix;

    public Produit(String name, int anneeDeParution, double prix) {
        this.name = name;
        this.anneeDeParution = anneeDeParution;
        this.prix = prix;
    }

    public String getName() {
        return name;
    }
    public int getAnneeDeParution() {
        return anneeDeParution;
    }

    public double getPrix() {
        return prix;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnneeDeParution(int anneeDeParution) {
        this.anneeDeParution = anneeDeParution;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
