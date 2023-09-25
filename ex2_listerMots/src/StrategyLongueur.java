public class StrategyLongueur implements Strategy{

    private int longueur;

    public StrategyLongueur(int longueur) {
        this.longueur = longueur;
    }

    @Override
    public boolean execute(String mot) {
        return mot.length() == longueur;
    }
}
