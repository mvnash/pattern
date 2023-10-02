package ex1;

import java.util.HashMap;
import java.util.Map;

public class Magasin {
	private Map<String,Produit> etagere = new HashMap<String,Produit>();
	private AbstractFactory factory;

	public Magasin(AbstractFactory factory) {
		this.factory = factory;
	}

	public void ajouterProduit(String name, int anneeDeParution){
		Produit produit = this.factory.creerProduit(name,anneeDeParution);
		etagere.put(name,produit);
	}
	public Produit retourneLivre(String name){
		return etagere.get(name);
	}
}
