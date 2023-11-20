package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;
import domaine.MasterCard;

import java.util.Calendar;

public class MasterCardGenerator extends Generateur{

    public MasterCardGenerator(Generateur successeur) {
        super(successeur);
    }

    @Override
    public boolean valider(String numero) {
        return (numero.startsWith("51") ||
                numero.startsWith("52") ||
                numero.startsWith("53") ||
                numero.startsWith("54") ||
                numero.startsWith("55")
        ) && numero.length() == 16;
    }

    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom){
        if(this.valider(numero)){
            return new MasterCard(numero,dateExpiration,nom);
        }
        else return super.creerCarte(numero,dateExpiration,nom);
    }
}
