public class ObsPalindrome implements Observer{

    private int count = 0;
    @Override
    public void traterLigne(String ligne) {

        for (String word : ligne.trim().split(" ")) {
        	StringBuffer temp = new StringBuffer(word);
        	if (word.equals(temp.reverse().toString())) {
        		count++;
        	}
        }
    }

    @Override
    public void printResult() {
        System.out.println("Nombre de palindromes : " + count);
    }
}
