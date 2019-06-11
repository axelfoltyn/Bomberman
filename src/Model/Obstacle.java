package Model;

public class Obstacle {
  private Obstacle(){}

  protected double x, y;
  protected boolean destructible;

  public boolean is_destroy() {return destructible;}

  public double get_x() {return x;}

  public double get_y() {return y;}

}
