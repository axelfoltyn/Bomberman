import java.awt.*;
import java.util.ArrayList;

import javax.accessibility.*;
import javax.swing.*;

public class BarreMenu extends JPanel {
  private JMenuBar barre;
  private int taille = -1;
  private int style = -1;
  private String nomPolice;

  /* Commentaires :
   * J'ai creer un panel pour faire la barre de menu pour ne pas avoir a en creer un pour ajouter la barre.
   * Donc on peut se dire : "Je veux une barre de menu, je cree un objet BarreMenu et j'ai une barre de menu"
   * Le premier qui me dit qu'il ne veut pas que la barre soit en haut je le bute direct */


  public BarreMenu () {
    setLayout(new BorderLayout());
    barre = new JMenuBar();
    add(barre, BorderLayout.NORTH);
  }
  /* Gestion de la police d'ecriture */

  public void setTaille(int taille) {
    /* Definit la taille d'ecriture a taille pour les prochains menus */
    this.taille = taille;
  }

  public void setPolice(String nomPolice) {
    /* Change la police d'ecriture
     * liste de toutes les polices d'ecriture possibles GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();
     * (le mieux est de chercher celle qu'on veut sur internet) */
    this.nomPolice = nomPolice;
  }

  public void setStyle(int style) {
    /* Font.BOLD = gras
     * Font.ITALIC = italique
     * Font.PLAIN = normal
     * Il faut faire Font.BOLD | Font.ITALIC pour mettre en gras ET en italique
     * */
    this.style = style;
  }


  /* Couleur de la barre de menu */
  public void setColor(Color couleur) {
    barre.setBackground(couleur);
  }

  public void setColor(int r, int v, int b) {
    barre.setBackground(new Color(r,v,b));
  }

  public void setColorText(Color couleur) {
    barre.setForeground(couleur);
  }

  public String toString() {
    /* Il faudrait rajouter les sous-menus et menu dans les menus */
    String s = "[";
    for (int i = 0; i < barre.getMenuCount(); i++) {
      s += barre.getMenu(i).getText();
      if (i != barre.getMenuCount()) {
        s += ",";
      }
    }
    return s + "]";
  }


  /* Gestion des menus */
  public JMenu addMenu(String titre) {
    /* Note : On peut ajouter des menus dans des menus */
    JMenu menu = new JMenu(titre);
    if (taille != -1) {
      menu.getFont().deriveFont((float) taille);
    }
    if (style != -1) {
      menu.getFont().deriveFont(style);
    }
    if (nomPolice != null) {
      menu.setFont(new Font(nomPolice, menu.getFont().getStyle(), menu.getFont().getSize()));
    }
    barre.add(menu);
    return menu;
  }


  public void removeMenu(JMenu menu) {
    barre.remove(menu);
  }

  public JMenuItem searchMenu(String nom) {
    for (int i = 0; i < barre.getMenuCount(); i++) {
      if (barre.getMenu(i).getText().equals(nom)) {
        return barre.getMenu(i);
      }
    }
    return null;
  }

  public JMenuItem searchMenu(int i) {
    if (i < barre.getMenuCount()) {
      return barre.getMenu(i);
    }
    return null;
  }

  public void addMenuItem(JMenu menu, String titre) {
    JMenuItem menuItem = new JMenuItem(titre);
    menu.add(menuItem);
  }

  /* Test */
  public static void main(String[] args) {

    JFrame frame = new JFrame();
    frame.setTitle("Test");
    frame.setSize(600, 400);
    BarreMenu bm = new BarreMenu();
    JMenu fichier = bm.addMenu("Fichier");
    bm.addMenuItem(fichier, "Nouveau");
    bm.addMenu("Edition");
    bm.addMenu("Aide");


    frame.add(bm);
    frame.setVisible(true);


  }
}
