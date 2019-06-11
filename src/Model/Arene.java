package Model;
import java.util.ArrayList;

public class Arene{
  private int x, y;
  private ArrayList<Joueur> joueurs;
  private ArrayList<Bombe> bombes;
  private ArrayList<Obstacle> obstacles;

  public Arene(int longueur, ArrayList joueurs){
    this.x = x;
    this.y = y;
    this.joueurs = joueurs;
    obstacles = new ArrayList();
    bombes = new ArrayList();
  }

  public void ajoutObstacle(Obstacle o){
    obstacles.add(o);
  }

  public void ajoutBombe(Bombe b){
    bombes.add(b);
  }
}
