package Model;


public class Bombe {
  private int deg, portee;
  private double x, y, compteur;
  private boolean explo;
  private int tmp_explo;
  //private static Arraylist<Bombe> listebombe = new Arraylist<Bombe>;

  public Bombe(int deg, int x, int y, int portee){
    this.deg=deg;
    this.x=x;
    this.y=y;
    compteur = 3.0;
    explo = false;
    this.portee = portee;
    tmp_explo = 1;
  }

  public void update(double dt){
    compteur -= dt;
    if(compteur <= 0){
      boom();
    }
  }

  public void  boom(){
    explo = true;
  }

  public boolean is_touch(double x, double y, Obstacle obs[]) {
    if (compteur < -1 * tmp_explo) {return false;}
    double err = 0.5;
    if ((this.x + err < x || this.x - err > x) && (this.y + err < y || this.y - err > y)) {return false;}
    if (this.x + err >= x || this.x - err <= x){
      if (Math.abs(this.y - y) < portee) {return false;}
      for (Obstacle o: obs){
        if ((o.y <= this.y && y <= o.y)
            || (o.y >= this.y && y >= o.y)) {
              return false;
        }
      }
    }
    else {
      if (Math.abs(this.x - x) < portee) {return false;}
      for (Obstacle o: obs){
        if ((o.x <= this.x && x <= o.x)
            || (o.x >= this.x && x >= o.x)) {
              return false;
        }
      }
    }
    return true;
  }

  public boolean a_detruire() {
    return compteur < -1 * tmp_explo;
  }

}
