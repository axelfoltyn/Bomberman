import java.awt.*;
import java.lang.Integer;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;

/*
la classe Menu donnera des bouton d'action
et si il le souhaite mettre un message ou l'on souhaite
rappel l'origin est en haut a droite et axe des y est inversé
*/

/*
TODO : rendre plus clean le code
*/
class Menu extends JPanel implements KeyListener {

  Menu() {
    this("apuyez sur une touche", 0);
  }

  Menu(String message, int rebord) {
    /*int ligne = 6;
      int gap = 20;*/
    this(message, rebord, (new GridLayout(6, 1, 20 * 5, 20)));
  }


  Menu(String message, int rebord, LayoutManager layout) {
    this(message, rebord, layout, 6);
  }

  Menu(String message, int rebord, LayoutManager layout, int nb_bouton) {
    message_ = message;
    rebord_ = rebord;
    premier_ = true;
    nb_bouton_ = nb_bouton;
    liste_des_mod_ = new JButton[nb_bouton_];


    for(int i = 0; i < nb_bouton_; i++) {
      liste_des_mod_[i] =new JButton(Integer.toString(i));
      this.add(liste_des_mod_[i]);
      liste_des_mod_[i].setVisible(false);
    }
    LayoutManager layout_ = layout;
    this.addKeyListener(this);
    this.setFocusable(true);
    this.setLayout(layout_);
  }

  public void keyPressed(KeyEvent key) {}

  public void keyReleased(KeyEvent key) {
    if(premier_){
      premier_ = false;
      lancer_menu();
    }
  }

  public void keyTyped(KeyEvent e) {}


  public void paintComponent(Graphics g){
    int pixel = 7; // la largeur en pixel d'une lettre
    if(premier_) {
      g.drawString(message_, (this.getWidth() - message_.length() * pixel) / 2, this.getHeight() - rebord_);
    }
    Dimension dimension = this.getSize();
    int longeur = (int)dimension.getWidth();
    //EmptyBorder(int top, int left, int bottom, int right)
    this.setBorder(new EmptyBorder(rebord_, longeur / 3, rebord_, longeur / 3));
  }

  public void lancer_menu() {
    for(int i = 0; i < 6; i++) {
      liste_des_mod_[i].setVisible(true);
    }
  }

  private int nb_bouton_;
  private JButton[] liste_des_mod_;
  private LayoutManager layout_;
  private boolean premier_;
  private String message_;
  private int rebord_;
}
