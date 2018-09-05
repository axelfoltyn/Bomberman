import javax.swing.*;
import java.awt.*;


/**
Window permettra de demarrer notre
fenêtre graphique avec les dimensions de lécran.

paramètre :
height_ (int) la hauteur utile de l'écran
width_ (int) la largeur utile de l'écran
newPanel_(JFrame)
*/

/*
TODO refaire cette class avec extend Jfram et mettre le main dans une class Main
*/
class Window extends JFrame {
  Window() {
    Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    height_ = (int)dimension.getHeight();
    width_  = (int)dimension.getWidth();
    this.setTitle("Bomberman");
    this.setResizable(false);
    this.setVisible(true);
    this.setSize(width_ / 2, height_ / 2); //TODO : changer / 2 avec une macro
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  private JFrame newJFrame_;
  private int height_;
  private int width_;
}