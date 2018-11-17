import javax.swing.JPanel;

/*
0 : rien
1 : caisse
2 : mur
3 : Perso
4 : Bombe
5 : Flame
*/

class Game extends JPanel {



  //private Image[] bdd_image;
  private Case[][] map_;
  private int x_;
  private int y_;

  Game() {
    x_ = 15;
    y_ = 15;
    map_ = new Case[x_][y_];
    init_map();
  }


  private void init_map() {
    //fait le contour avec des murs + mur interrieur
    double proba_caisse = 0.99;
    int cpt = 1;
    Mur m = new Mur();
    for (int i = 0; i < x_; i++) {
      for (int j = 0; j < y_; j++) {
        if (i == 0 || i + 1 == y_ ||
            j == 0 || j + 1 == x_ ||
            (i % 2 == 0 && j % 2 == 0)) {
          map_[i][j] = new Case(m);
        }
        else if (i%(x_-3) == 1 && j%(y_-3) == 1){
          map_[i][j] = new Case(new Personnage(i, j, "Joueur" + cpt++));
        }
        else if(i%(x_-4)<=2 && j%(y_-4)<=2 && i%(x_-4)>0 && j%(y_-4)>0) {
          map_[i][j] = new Case();
        }
        else if(rand() < proba_caisse) {
          map_[i][j] = new Case(new Caisse()); //TODO peutetre changer constructeur
        }
      }
    }
  }

  public update() {
    for (int i = 0; i < x_; i++) {
      for (int j = 0; j < y_; j++) {
        map_[i][j].update();
      }
    }
  }
}
