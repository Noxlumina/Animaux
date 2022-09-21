package animaux;

import interfaces.Aquatique;
import interfaces.Volatile;

import java.util.Date;

public class MartinPecheur extends Animal implements Aquatique, Volatile {
    public MartinPecheur(String nom, Date datedeNaissance, Double poids) {
        super(nom, datedeNaissance, poids);
    }

    @Override
    public void parler() {

    }

    @Override
    public void manger() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void nager() {

    }

    @Override
    public void voler() {

    }
}
