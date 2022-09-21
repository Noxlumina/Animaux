package contenants;

import interfaces.Aquatique;
import interfaces.Conteneur;
import interfaces.Terrestre;

import java.util.ArrayList;
import java.util.List;

public class Cage extends Conteneur {
    public Cage() {
    }

    public List<Terrestre> getTerrestresList() {
        return terrestresList;
    }

    public void setTerrestresList(Terrestre terrestre) {
        this.terrestresList.add(terrestre);
    }

    protected List<Terrestre> terrestresList = new ArrayList<Terrestre>();

}
