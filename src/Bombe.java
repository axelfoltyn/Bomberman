public class Bombe extends Case {
  private int deg, x, y, compteur, int portee;
  private boolean explo;
  //private static Arraylist<Bombe> listebombe = new Arraylist<Bombe>;

  public Bombe(int deg, int x, int y){
    this.deg=deg;
    this.x=x;
    this.y=y;
    compteur = 3;
    explo = false;
    portee = 1;
    listebombe.add(this);
  }

  public void update(){
    compteur--;
    if(compteur <= 0){
      boom();
    }


    public void  boom(){
      explo = true;
      this.type = 5; // devient case FLAME
      this.f = new Flame(/*liste d'image, */deg, x, y);
      int i;
      // for(i=0;i<listebombe.size();i++){
      //   if(listebombe.get(i).x<x+portee && listebombe.get(i).x>x-portee &&
      //      listebombe.get(i).y<y+portee && listebombe.get(i).y<y+portee){
      //     listebombe.get(i).boom();
      //   }
      // }

      //droite
      for(i = 1; i < portee; i++) {
        switch (Game.map_[x][y + i].type) {
        case(0) : //vide
          Game.map_[x][y + i].type = 5;
          Game.map_[x][y + i].f = new Flame(/*liste d'image, */deg, x, y);
          break;
        case(1) : //caisse
          //...x
      }
    }

}
