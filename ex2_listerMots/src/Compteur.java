public class Compteur implements Strategy {
    private Strategy strategy;
    private int compteur;

    public Compteur(Strategy strategy) {
        this.strategy = strategy;
        this.compteur = 0;
    }

    @Override
    public boolean execute(String mot) {
        if (strategy.execute(mot)) {
            compteur++;
            return true;
        }
        return false;
    }

    public int getCompteur() {
        return compteur;
    }
}

