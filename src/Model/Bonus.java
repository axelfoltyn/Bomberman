package Model;


public class Bonus {
    private int boost, portee;
    private double x, y, compteur;
    private boolean disp;
    private int tmp_disp;
    private String bonus;
    //private static Arraylist<Bonus> listebonus = new Arraylist<Bonus>;

    public Bonus(int deg, int x, int y, int portee, String bonus){
        this.boost = boost;
        this.x = x;
        this.y = y;
        compteur = 10.0;
        exist = true; //idee laisser l'objet meme si il n'existe plus ou suppr des qu'il n'existe plus
        this.portee = portee;
        tmp_disp = 1;
        this.bonus = bonus // Appliquer le bonus dans le personnage la on ne definit que le type de bonus
    }

    public void update(double dt){
        compteur -= dt;
        if(compteur <= 0){
            gone();
        }
    }

    public void gone(){
        exist = false;
    }


    public boolean get_bonus(double x, double y){
        if (this.x == x && this.y == y){
            return this.bonus;
        }
        return false; // Si false on applique rien au joueur sinon on lui applique le bonus
    }

}