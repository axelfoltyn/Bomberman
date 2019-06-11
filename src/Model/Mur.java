package Model;

import Model.Obstacle;

public class Mur extends Obstacle {
  public Mur(int x, int y) {
    this.x=x;
    this.y=y;
    destructible=false;
  }
}
