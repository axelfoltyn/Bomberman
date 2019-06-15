package Model;

import Model.Personnage;

public abstract class Bonus {
    private double x, y, compteur;
    private boolean exist;
    private String bonus;
    //private static Arraylist<Bonus> listebonus = new Arraylist<Bonus>;

    public Bonus(int deg, int x, int y){
        this.x = x;
        this.y = y;
        compteur = 10.0;
        this.exist = true; //idee laisser l'objet meme si il n'existe plus ou suppr des qu'il n'existe plus
        this.bonus = bonus // Appliquer le bonus dans le personnage la on ne definit que le type de bonus
    }

    public void update(double dt){
        this.compteur -= dt;
        if(this.compteur <= 0){
            gone();
        }
    }

    public void gone(){
        this.exist = false;
    }


    public abstract void get_bonus(double x, double y, Personnage p);

}
