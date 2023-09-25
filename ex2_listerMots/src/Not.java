public class Not implements Strategy{

    private Strategy strategy;

    public Not(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean execute(String mot) {
        return !strategy.execute(mot);
    }
}
