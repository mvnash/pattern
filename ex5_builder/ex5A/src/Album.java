public class Album {
    private final String titre;
    private final String artiste;

    private final String label;
    private final String producteur;
    private final String pays;
    private final String version;
    private final int anneeParution;
    private final int debitStandard;
    private final int debitAbo;

    public Album(AlbumBuilder albumBuilder) {
        this.titre = albumBuilder.titre;
        this.artiste = albumBuilder.artiste;
        this.label = albumBuilder.label;
        this.producteur = albumBuilder.producteur;
        this.pays = albumBuilder.pays;
        this.version = albumBuilder.version;
        this.anneeParution = albumBuilder.anneeParution;
        this.debitStandard = albumBuilder.debitStandard;
        this.debitAbo = albumBuilder.debitAbo;
    }

    public String getTitre() {
        return titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public String getLabel() {
        return label;
    }

    public String getProducteur() {
        return producteur;
    }

    public String getPays() {
        return pays;
    }

    public String getVersion() {
        return version;
    }

    public int getAnneeParution() {
        return anneeParution;
    }

    public int getDebitStandard() {
        return debitStandard;
    }

    public int getDebitAbo() {
        return debitAbo;
    }

    public static class AlbumBuilder {
        private final String titre;
        private final String artiste;

        private String label;
        private String producteur;
        private String pays;
        private String version;
        private int anneeParution;
        private int debitStandard;
        private int debitAbo;

        public AlbumBuilder(String titre, String artiste){
            this.titre = titre;
            this.artiste = artiste;
        }

        public AlbumBuilder label(String label){
            this.label = label;
            return this;
        }

        public AlbumBuilder producteur(String producteur){
            this.producteur = producteur;
            return this;
        }
        public AlbumBuilder pays(String pays){
            this.pays = pays;
            return this;
        }
        public AlbumBuilder version(String version){
            this.version = version;
            return this;
        }
        public AlbumBuilder anneeParution(int anneeParution){
            this.anneeParution = anneeParution;
            return this;
        }
        public AlbumBuilder debitStandard(int debitStandard){
            this.debitStandard = debitStandard;
            return this;
        }
        public AlbumBuilder debitAbo(int debitAbo){
            this.debitAbo = debitAbo;
            return this;
        }

        public Album build(){
            return new Album(this);
        }
    }
}
