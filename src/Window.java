import javax.swing.*;
import java.awt.*;


/**
Window permettra de demarrer notre
fenêtre graphique avec les dimensions de lécran.

paramètre :
height_ (int) la hauteur utile de l'écran
width_ (int) la largeur utile de l'écran
rebord_ (int) l'écart minimal entre le rebord de la fenêtre et les composants
*/

class Window extends JFrame {
  Window() {
    Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    height_ = (int)dimension.getHeight();
    width_  = (int)dimension.getWidth();
    rebord_ = 20;
    this.setTitle("Bomberman");
    this.setResizable(false);
    this.setSize(width_ / 2, height_ / 2); //TODO : changer / 2 avec une macro
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    int nb_ligne = 6;
    this.setContentPane(new Menu("apuyez sur une touche",
                                 rebord_, new GridLayout(nb_ligne, 1)));
    this.setVisible(true);
  }

  private int height_;
  private int width_;
  private int rebord_;
}
