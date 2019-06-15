public abstract class Personnage {
  private int x, y, pv, protection, degats, resistance, porte, cooldown;
  private String nom;
  private double vitesse;

  public Personnage(int x, int y, String nom){
    this.x = x;
    this.y = y;
    this.nom = nom;
    //revoir les stats de base
    this.pv = 20;
    this.bouclier = 0;
    this.degats = 5;
    this.resistance = 0;
    this.porte = 1;
    this.cooldown = 4;
  }

  public void move(int x_futur, int y_futur){
    if(x+x_futur<=Dimension && x+x_futur>=0){
      x=x+x_futur;
    }
    if(y+y_futur<=Dimension && y+y_futur>=0){
      y=y+y_futur;
    }
  }

  public void poser_bombe(){

  }

  //Faire attention a mettre en négatif si perte de point
  void gain_pv(int gain){
    this.pv += gain;
  }

  void gain_bouclier(int gain){
    this.bouclier += gain;
  }

  void gain_degats(int gain){
    this.degats = gain;
  }

  void gain_resistance(int gain){
    this.resistance = gain;
  }

  void gain_cooldown(int gain){
    this.cooldown = gain;
  }

  void gain_porte(int gain){
    this.porte += gain;
  }

  //modifier les stats en fonction du personnage
  void choix_personnage(String nom){
    //TODO a coder
  }

}
