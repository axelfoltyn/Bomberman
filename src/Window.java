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
/*
mettre en fr les variable
*/
class Window extends JFrame {
  /*
    Le constructeur Window recupère les dimention de l'écran pour ouvrir une
    fenêtre qui fera toujours 1/4 de l'écran utilisable (grace au divisé par 2).

    il ouvrira le menu de depart.
   */
  Window(String title) {
    //les paramettres:
    Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    height_ = (int)dimension.getHeight();
    width_  = (int)dimension.getWidth();
    rebord_ = 20;

    //linitialisation de la fenêtre:
    this.setTitle(title);
    this.setResizable(false);
    this.setSize(width_ / resize_, height_ / resize_);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //creation du menu de depart:
    int nb_ligne = 7;
    this.setContentPane(new Menu("apuyez sur une touche", rebord_,
                                 new GridLayout(nb_ligne, 1, 20 * 5, 20), nb_ligne));

    //permet de mettre cette fenêtre visible.
    this.setVisible(true);
  }

  private int height_;
  private int width_;
  private int rebord_;
  //la fenetre sera de la 1/n de la hauteur et de la largeur
  private static final int resize_ = 2;
}
