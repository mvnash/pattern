public abstract class State {
    public static void rendreMonnaie(MachineACafe mq) {
        mq.afficherRetour();
        mq.setMontantEnCours(0);
        mq.setBoisson(null);
        mq.setEtatCourant(new IdleState());
    }

    public static void entrerMonnaie(Piece piece, MachineACafe mq) {
        mq.setMontantEnCours(mq.getMontantEnCours() + piece.getValeur());
        mq.afficherMontant();
        mq.setEtatCourant(new CollecteState());
    }

    public static void selectionnerBoisson(ToucheBoisson toucheBoisson, MachineACafe mq) {
        if (toucheBoisson.getPrix() > mq.getMontantEnCours()) {
            mq.setBoisson(toucheBoisson);
            mq.afficherPasAssez(mq.getBoisson());
            mq.setBoisson(toucheBoisson);
            mq.setEtatCourant(new PasAssezState());
            return;
        }
        mq.setMontantEnCours(mq.getMontantEnCours() - toucheBoisson.getPrix());
        mq.afficherBoisson(toucheBoisson);
        mq.afficherMontant();
        if (mq.getMontantEnCours() == 0)
            mq.setEtatCourant(new IdleState());
        else
            mq.setEtatCourant(new CollecteState());
    }
}
