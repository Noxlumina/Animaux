package animaux;

import interfaces.Aquatique;

import java.util.Date;

public class Dauphin extends Mamifere implements Aquatique {
    public Dauphin(String nom, Date datedeNaissance, Double poids) {
        super(nom, datedeNaissance, poids);
    }

    @Override
    public void parler() {
        System.out.println("je cliquette");
    }

    @Override
    public void manger() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void nager() {
        System.out.println("je nage");
    }
}
