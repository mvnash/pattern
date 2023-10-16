public class PasAssezState extends State{

    public static void entrerMonnaie(Piece piece, MachineACafe mq){
        mq.setMontantEnCours(mq.getMontantEnCours() + piece.getValeur());
        mq.afficherMontant();
        if (mq.getBoisson().getPrix() > mq.getMontantEnCours()){
            mq.afficherPasAssez(mq.getBoisson());
        } else {
            mq.setMontantEnCours(mq.getMontantEnCours()- mq.getBoisson().getPrix());
            mq.afficherBoisson(mq.getBoisson());
            mq.setBoisson(null);
            mq.afficherMontant();
            if (mq.getMontantEnCours() == 0)
                mq.setEtatCourant(new IdleState());
            else
            mq.setEtatCourant(new CollecteState());
        }
    }

    public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
            throw new IllegalStateException();
    }
}
