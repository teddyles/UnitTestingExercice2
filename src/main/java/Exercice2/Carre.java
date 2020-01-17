package Exercice2;

public class Carre {

    public Double Longueur;

    public Carre( double L){
        this.Longueur = L;
    }
    public double surface () {

        return this.Longueur *Longueur;
    }
    public void afficher () {
        System.out.println("La surface du carre est : " + this.surface());
    }
}
}
