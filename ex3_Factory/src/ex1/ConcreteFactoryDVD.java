package ex1;

public class ConcreteFactoryDVD implements AbstractFactory {
    @Override
    public Produit creerProduit(String name, int anneeDeParution) {
        return new DVD(name,anneeDeParution);
    }
}
