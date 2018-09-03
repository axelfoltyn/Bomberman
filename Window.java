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

class Window {
  Window() {
    Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    height_ = (int)dimension.getHeight();
    width_  = (int)dimension.getWidth();
    System.out.println(height_ + ", " + width_);
    newJFrame_ = new JFrame();
    newJFrame_.setVisible(true);
    newJFrame_.setSize(width_ / 2, height_ / 2); //TODO : changer / 2 avec une macro
    newJFrame_.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    Window w = new Window();
  }

  private JFrame newJFrame_;
  private int height_;
  private int width_;
}
