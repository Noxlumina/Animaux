package animaux;

import interfaces.Terrestre;

import java.util.Date;

public class Chat extends Mamifere implements Terrestre {
    public Chat(String nom, Date datedeNaissance, Double poids) {
        super(nom, datedeNaissance, poids);
    }

    @Override
    public void parler() {
        System.out.println("je miaule");
    }

    @Override
    public void manger() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void marcher() {
        System.out.println("je marche");
    }

    public void alertlitiere(){
        System.out.println("la litière est pleine");
    }
}
