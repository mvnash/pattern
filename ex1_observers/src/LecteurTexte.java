import java.util.ArrayList;

public class LecteurTexte {

    private  ArrayList<Observer> observers = new ArrayList<>();

    public LecteurTexte(){
        ObsSearchWord obssw = new ObsSearchWord("Belgique");
        ObsLine obsl = new ObsLine();
        ObsCountWord obscw = new ObsCountWord();
        ObsPalindrome obsp = new ObsPalindrome();

        observers.add(obsl);
        observers.add(obssw);
        observers.add(obscw);
        observers.add(obsp);
    }

    public  void notifyObservers(String ligne){
        for(Observer o : observers){
            o.traterLigne(ligne);
        }
    }

    public void printResult(){
        for(Observer o : observers){
            o.printResult();
        }
    }

}
