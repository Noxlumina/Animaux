package contenants;

import animaux.Chat;
import interfaces.Aquatique;
import interfaces.Conteneur;
import interfaces.Terrestre;
import interfaces.Volatile;

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

    public void afficherListTerrestre(){
        for (Terrestre item:terrestresList
        ) {
            if (item instanceof Chat) {System.out.println(item);
                Chat chat = (Chat) item;
            chat.parler();}  else System.out.println("conteneur non valide");
        }
    }

}
