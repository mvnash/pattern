public class ObsLine implements Observer {

    private int count = 0;
    @Override
    public void traterLigne(String line) {
        count ++;
    }

    public void printResult(){
        System.out.println("Nombre de ligne : " + count);
    }
}
