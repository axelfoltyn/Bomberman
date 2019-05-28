public class Case{
  private int type;
  private Caisse c;
  private Mur m;
  private Personnage p;
  private Bombe b;
  private Flame f;

  public Case(){
    type = 0;
  }
  public Case(Caisse c){
    type =1;
    this.c = c;
  }
  public Case(Mur m){
    type = 2;
    this.m = m;
  }
  public Case(Personnage p){
    type = 3;
    this.p = p;
  }
  public Case(Bombe b){
    type =4;
    this.b = b;
  }
  public Case(Flame f){
    type = 5;
    this.f = f;
  }

  public void update(){
    if(type == 1) {
      c.update();
    }
    if(type == 3) {
      p.update();
    }
    if(type == 4) {
      b.update();
    }
    if(type == 5) {
      f.update();
    }
  }
}
