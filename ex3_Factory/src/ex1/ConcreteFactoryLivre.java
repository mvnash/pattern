package ex1;

public class ConcreteFactoryLivre implements AbstractFactory{
    @Override
    public Produit creerProduit(String name, int anneeDeParution) {
        return new Livre(name, anneeDeParution);
    }
}
