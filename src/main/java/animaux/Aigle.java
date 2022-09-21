package animaux;

import interfaces.Volatile;

import java.util.Date;

public class Aigle extends Animal implements Volatile {
    public Aigle(String nom, Date datedeNaissance, Double poids) {
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
    public void voler() {

    }
}
