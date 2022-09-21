import animaux.Animaux;
import animaux.Chat;
import animaux.Dauphin;
import contenants.Aquarium;
import contenants.Cage;
import contenants.Voliere;
import contenants.Zoo;
import interfaces.Conteneur;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Animaux animaux = new Animaux();
        Chat chat = new Chat("Felix",new Date(2011, Calendar.DECEMBER, 10),5.0);
        Dauphin dauphin=new Dauphin("Flipper",new Date(2011, Calendar.MARCH, 10),15.0);
        animaux.setAnimalList(chat);
        animaux.setAnimalList(dauphin);
        animaux.faireParler();
        dauphin.nager();dauphin.respirerHorsEau();
        chat.marcher();chat.respirerHorsEau();
        Zoo zoo = new Zoo();
        Aquarium aquarium = new Aquarium();
        Cage cage = new Cage();
        Voliere voliere = new Voliere();
        zoo.setConteneurList(aquarium);
        zoo.setConteneurList(cage);
        zoo.setConteneurList(voliere);
        aquarium.setAquatiqueList(dauphin);
        cage.setTerrestresList(chat);




    }

    }

