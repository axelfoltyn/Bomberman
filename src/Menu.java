import java.awt.*;
import java.lang.Integer;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
la classe Menu donnera des bouton d'action
et si il le souhaite mettre un message ou l'on souhaite
rappel l'origin est en haut a droite et axe des y est inversé
*/

/*
TODO : rendre plus clean le code
*/
class Menu extends JPanel {

  Menu() {
    message_ = "";
    rebord_ = 0;
    int ligne = 6;
    int gap = 20;
    this.setLayout(new GridLayout(ligne, 1, gap * 5, gap));
  }

  Menu(String message, int rebord) {
    /*ligne = 6;
      gap = 20;*/
    this(message, rebord, new GridLayout(6, 1, 20 * 5, 20));
  }

  Menu(String message, int rebord, LayoutManager layout) {
    message_ = message;
    rebord_ = rebord;
    this.setLayout(layout);
    lancer_menu();
  }


  public void paintComponent(Graphics g){
    int pixel = 7; // la largeur en pixel d'une lettre
    g.drawString(message_, (this.getWidth() - message_.length() * pixel) / 2, this.getHeight() - rebord_);
  }

  public void lancer_menu() {
    for(int i = 0; i < 6; i++) {
      this.add(new JButton(Integer.toString(i)));
    }
  }

  private String message_;
  private int rebord_;
}
