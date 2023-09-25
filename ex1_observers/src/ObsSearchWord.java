public class ObsSearchWord implements Observer{

    private String word;
    private int countMot = 0;

    public ObsSearchWord(String word){
        this.word = word;
    }

    @Override
    public void traterLigne(String ligne) {
        if (ligne.contains(word)) {
        	countMot++;
        }
    }

    @Override
    public void printResult() {
        System.out.println("Nombre de " + word + " : " + countMot);
    }
}
