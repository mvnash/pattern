public class Ou implements Strategy{

    private Strategy[] strategies;

    public Ou(Strategy[] strategies) {
        this.strategies = strategies;
    }

    @Override
    public boolean execute(String mot) {
        for (Strategy strategy : strategies){
            if (strategy.execute(mot)) return true;
        }
        return false;
    }
}