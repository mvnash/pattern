public class StrategyPalyndromes implements Strategy{

    @Override
    public boolean execute(String mot) {
        return estPalindrome(mot);
    }

    public boolean estPalindrome(String mot) {
        if (mot == null)
            return false;
        StringBuffer stringbuffer = new StringBuffer(mot);
        return mot.equals(stringbuffer.reverse().toString());
    }
}
