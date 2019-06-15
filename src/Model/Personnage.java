
public abstract class Personnage {
  private int x, y, pv, bouclier, degats, resistance, porte, cooldown;
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
    this.vitesse = 1.0;
  }

  public void move(int x_futur, int y_futur){
    if(x+x_futur<=Dimension && x+x_futur>=0){
      x=x+x_futur;
    }
    if(y+y_futur<=Dimension && y+y_futur>=0){
      y=y+y_futur;
    }
  }

  public boolean check_is_here(double x, double y){
    double err = 0.5; //prendre aussi la moitié des casses a coté si pas assez punitif
    return (this.x - err <= x || this.x + err >= x) && (this.y - err <= y || this.y + err >= x)
  }


  public void poser_bombe(){

  }


  //Faire attention a mettre en négatif si perte de point et voir si on cap en négatif certain
  void gain_pv(int gain){
    if((this.pv + gain) > 50){
      this.pv = 50;
    }
    this.pv += gain;
  }

  void gain_bouclier(int gain){
    if((this.bouclier + gain) > 25){
      this.bouclier = 25;
    }
    this.bouclier += gain;
  }

  void gain_degats(int gain){
    if((this.degats + gain) > 15){
      this.degats = 15;
    }
    this.degats = gain;
  }

  void gain_resistance(int gain){
    if((this.resistance + gain) > 10){
      this.resistance = 10;
    }
    this.resistance = gain;
  }

  void gain_cooldown(int gain){
    if((this.cooldown + gain) > 4){
      this.cooldown = 4;
    }
    this.cooldown = gain;
  }

  void gain_vitesse(int gain){
    this.vitesse += gain;
  }

  void gain_porte(double gain){
    this.porte += gain;
  }

  //modifier les stats en fonction du personnage
  void choix_personnage(String nom){
    //TODO a coder
  }

}
