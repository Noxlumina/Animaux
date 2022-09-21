package animaux;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Animal {
    public Animal(String nom, Date datedeNaissance, Double poids) {
        this.nom=nom;
        this.datedeNaissance=datedeNaissance;
        this.poids=poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDatedeNaissance() {
        return datedeNaissance;
    }

    public void setDatedeNaissance(Date datedeNaissance) {
        this.datedeNaissance = datedeNaissance;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    protected String nom;
    protected Date datedeNaissance;
    protected Double poids;

    public abstract void  parler();

    public abstract void manger();

    public abstract void dormir();
}


