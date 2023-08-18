# Animaux
Exercice assez complet portant sur la manipulation:
- des interface et classes abstraites
- de l'encapsulation et polymorphisme

Dans un Zoo nous avons plusieurs animaux aux aspects differents, aux modes de vie différent et qui agissent de manières différents.
Tous héritent de la classe Animal et en fonction de l'animal implémente soit l'interface Terrestre, Aquatique ou Volatile.

En fonction de l'interface implémentée, leur foyer n'est pas le même. Part foyer, je parle du contenant (cage,aquarium, volière).

Dans mon exemple, j'ai une interface conteneur vide, celle ci pourrait contenir les méthode getList() et setList().
Ce qui permettrait d'avoir d'en chaque conteneur des noms de methodes communs mais qui serait redéfinit pour chaque conteneurs.

ex: dans aquarium

public List<Aquatique> getList() {
        return aquatiqueList;
    } 

public void setList(Aquatique aqua) {
        this.aquatiqueList.add(aqua);
    }

remplacerait

public List<Aquatique> getAquatiqueList() {
        return aquatiqueList;
    }

public void setAquatiqueList(Aquatique aqua) {
        this.aquatiqueList.add(aqua);
    }
