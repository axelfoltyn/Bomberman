import java.awt.Graphics;
import javax.swing.JPanel;

/*
la classe Menu donnera des bouton d'action
et si il le souhaite mettre un message ou l'on souhaite
rappel l'origin est en haut a droite et axe des y est inversé
*/

class Menu extends JPanel {
  Menu(String message, int rebord) {
    message_ = message;
    rebord_ = rebord;
  }
  public void paintComponent(Graphics g){
    int pixel = 7; // la largeur en pixel d'une lettre
    g.drawString(message_, (this.getWidth() - message_.length() * pixel) / 2, this.getHeight() - rebord_);
    System.out.println(this.getWidth() + ", " + this.getHeight() + ", " + (this.getWidth() - message_.length()) / 2);
  }

  private String message_;
  private int rebord_;
}
