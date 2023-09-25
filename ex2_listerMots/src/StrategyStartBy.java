public class StrategyStartBy implements Strategy{

    String prefix;

    public StrategyStartBy(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean execute(String mot) {
        return mot.startsWith(prefix);
    }
}
