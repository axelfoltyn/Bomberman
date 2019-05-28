public class Personnage {
  private int x, y;
  private String nom;
  public Personnage(int x, int y, String nom){
    this.x = x;
    this.y = y;
    this.nom = nom;
  }
  public void move(int x_futur, int y_futur){
    if(x+x_futur<=Dimension && x+x_futur>=0){
      x=x+x_futur;
    }
    if(y+y_futur<=Dimension && y+y_futur>=0){
      y=y+y_futur;
    }
  }
  public void poserbombe(){

  }

}
