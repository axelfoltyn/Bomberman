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
    ligne_ = 6;
    gap_ = 20;
    this.setLayout(new GridLayout(ligne_, 1, gap_ * 5, gap_));
  }

  Menu(String message, int rebord) {
    message_ = message;
    rebord_ = rebord;
    ligne_ = 6;
    gap_ = 20;
    this.setLayout(new GridLayout(ligne_, 1, gap_ * 5, gap_));
    lancer_menu();
  }

  Menu(String message, int rebord, LayoutManager layout) {
    message_ = message;
    rebord_ = rebord;
    ligne_ = 6;
    gap_ = 20;
    this.setLayout(layout);
    lancer_menu();
  }


  public void paintComponent(Graphics g){
    int pixel = 7; // la largeur en pixel d'une lettre
    g.drawString(message_, (this.getWidth() - message_.length() * pixel) / 2, this.getHeight() - rebord_);
  }

  public void lancer_menu() {
    for(int i = 0; i < ligne_; i++) {
      this.add(new JButton(Integer.toString(i)));
    }
  }

  private int gap_;
  private String message_;
  private int rebord_;
  private int ligne_;
}
