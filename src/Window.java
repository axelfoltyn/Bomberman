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

  /*
    Le constructeur Window recupère les dimention de l'écran pour ouvrir une
    fenêtre qui fera toujours 1/4 de l'écran utilisable (grace au divisé par 2).

    il ouvrira le menu de depart.
   */
  Window() {
    //les paramettres:
    String title = "Bomberman";
    Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    height_ = (int)dimension.getHeight();
    width_  = (int)dimension.getWidth();
    rebord_ = 20;

    //linitialisation de la fenêtre:
    this.setTitle(title);
    this.setResizable(false);
    this.setSize(width_ / 2, height_ / 2); //TODO : changer / 2 avec une macro ou ce qui s'en rapproche
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //creation du menu de depart:
    int nb_ligne = 6;
    this.setContentPane(new Menu("apuyez sur une touche",
                                 rebord_, new GridLayout(nb_ligne, 1)));

    //permet de mettre cette fenêtre visible.
    this.setVisible(true);
  }

  private int height_;
  private int width_;
  private int rebord_;
}
