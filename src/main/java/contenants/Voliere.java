package contenants;

import interfaces.Conteneur;
import interfaces.Volatile;

import java.util.ArrayList;
import java.util.List;

public class Voliere extends Conteneur {


    public Voliere() {
    }

    public List<Volatile> getVolatileList() {
        return volatileList;
    }

    public void setVolatileList(Volatile item) {
        this.volatileList.add(item);
    }

    protected List<Volatile> volatileList = new ArrayList<Volatile>();
}
