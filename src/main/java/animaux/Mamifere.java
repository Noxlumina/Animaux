package animaux;

import java.util.Date;

public abstract class Mamifere extends Animal {
    public Mamifere(String nom, Date datedeNaissance, Double poids) {
        super(nom, datedeNaissance, poids);
    }

    public void respirerHorsEau(){
        System.out.println("je respire hors de l'eau");
    }
}
