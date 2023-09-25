public class Et implements Strategy{

    private Strategy[] strategies;

    public Et(Strategy[] strategies) {
        this.strategies = strategies;
    }

    @Override
    public boolean execute(String mot) {
        for (Strategy strategy : strategies){
            if (!strategy.execute(mot)) return false;
        }
        return true;
    }
}
