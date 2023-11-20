package validation;

import domaine.AmEx;
import domaine.CarteDeCredit;
import domaine.DinersClub;

import java.util.Calendar;

public class DinersClubGenerator extends Generateur{

    public DinersClubGenerator(Generateur successeur) {
        super(successeur);
    }

    public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom){
        if(this.valider(numero)){
            return new DinersClub(numero,dateExpiration,nom);
        }
        else return super.creerCarte(numero,dateExpiration,nom);
    }

    @Override
    public boolean valider(String numero) {
        return numero.startsWith("36")&&numero.length()==14;
    }
}
