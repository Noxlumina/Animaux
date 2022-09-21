package animaux;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Animaux {

    public Animaux() {
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(Animal animal) {
        this.animalList.add(animal);
    }

    protected List<Animal> animalList = new ArrayList<Animal>();



    public void faireParler(){
        for (Animal item: animalList
        ) { item.parler();
        }
    }
}
