import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AnalyseurDeTexte {


	public static void main(String[] args) throws IOException {
		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		LecteurTexte lecteurTexte = new LecteurTexte();

		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(args[0]));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
			lecteurTexte.notifyObservers(ligne);
		}
		lecteurAvecBuffer.close();

		lecteurTexte.printResult();
	}
}
