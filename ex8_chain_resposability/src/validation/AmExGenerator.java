package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;

import java.util.Calendar;

public class AmExGenerator extends Generateur {

    public AmExGenerator(Generateur successeur) {
        super(successeur);
    }

    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom){
        if(this.valider(numero)){
            return new AmEx(numero,dateExpiration,nom);
        }
        else return super.creerCarte(numero,dateExpiration,nom);
    }

    @Override
    public boolean valider(String numero) {
        return (numero.startsWith("34") || numero.startsWith("37")) && numero.length() == 15;
    }
}
