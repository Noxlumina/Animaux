package contenants;

import interfaces.Conteneur;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public List<Conteneur> getConteneurList() {
        return conteneurList;
    }

    public void setConteneurList(Conteneur conteneur) {
        this.conteneurList.add(conteneur);
    }

    protected List<Conteneur> conteneurList = new ArrayList<Conteneur>();

    public void afficherListZoo() {
        for (Conteneur item : conteneurList
        ) {
            if (item instanceof Aquarium) {
                System.out.println(item);
                Aquarium aquarium = (Aquarium) item;
                aquarium.afficherListAquarium();
            } else if (item instanceof Cage) {
                System.out.println(item);
                Cage cage = (Cage) item;
                cage.afficherListTerrestre();
            } else if (item instanceof Voliere) {
                System.out.println(item);
                Voliere voliere = (Voliere) item;
                voliere.afficherListVolierre();
            } else System.out.println("conteneur non valide");
        }
    }
}
