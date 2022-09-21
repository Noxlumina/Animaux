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
}
