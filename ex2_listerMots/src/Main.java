import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage : java ListerMots1 fichier");
            System.exit(1);
        }
        Strategy strategyLongueur = new StrategyLongueur(5);
        Strategy strategyPalyndrome = new StrategyPalyndromes();
        Strategy strategyStartBy = new StrategyStartBy("S");
        new ListerMots(args[0], strategyStartBy).imprimer();
    }
}