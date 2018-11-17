public class Bombe extends Case {
  private int deg, x, y, compteur, int portee;
  private boolean explo;
  private static Arraylist<Bombe> listebombe = new Arraylist<Bombe>;

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
      this.type = 0 // devient case vide
      int i;
      for(i=0;i<listebombe.size();i++){
        if(listebombe.get(i).x<x+portee && listebombe.get(i).x>x-portee &&
           listebombe.get(i).y<y+portee && listebombe.get(i).y<y+portee){
          listebombe.get(i).boom();
        }
      }
    }

}
