import javax.swing.JButton;
import javax.swing.JPanel;

abstract class MonJBouton extends JButton {


  MonJBouton(String nom) {
    super(nom);
  }


  public abstract void action();
  public abstract void action(JPanel jpanel);
}
