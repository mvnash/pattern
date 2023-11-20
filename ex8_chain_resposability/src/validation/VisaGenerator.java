package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;
import domaine.Visa;

import java.util.Calendar;

public class VisaGenerator extends Generateur{

    public VisaGenerator(Generateur successeur) {
        super(successeur);
    }

    @Override
    public boolean valider(String numero) {
        return numero.startsWith("4") && numero.length() == 16;
    }

    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom){
        if(this.valider(numero)){
            return new Visa(numero,dateExpiration,nom);
        }
        else return super.creerCarte(numero,dateExpiration,nom);
    }
}
