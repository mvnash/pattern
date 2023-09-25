public class ObsCountWord implements Observer{
    private int countWord = 0;
    @Override
    public void traterLigne(String ligne) {
        for (String word : ligne.trim().split(" ")) {
        	countWord ++;
        }
    }

    @Override
    public void printResult() {
        System.out.println("Nombre de mot : " + countWord);
    }
}
