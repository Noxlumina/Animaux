package contenants;

import interfaces.Aquatique;
import interfaces.Conteneur;
import interfaces.Volatile;

import java.util.ArrayList;
import java.util.List;

public class Aquarium extends Conteneur {
    public Aquarium() {
    }

    public List<Aquatique> getAquatiqueList() {
        return aquatiqueList;
    }

    public void setAquatiqueList(Aquatique aqua) {
        this.aquatiqueList.add(aqua);
    }

    protected List<Aquatique> aquatiqueList = new ArrayList<Aquatique>();

    public void afficherListAquarium(){
        for (Aquatique item:aquatiqueList
        ) {
            System.out.println(item);

        }
    }

}
