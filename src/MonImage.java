class MonImage {
  ImageIcon image;

  /*recupère limage dont le chemain est file
    ,prend de (x_debut, y_debut) a (x_fin, y_fin)
    et garde la position (de depart ?) de l'image
   */
  MonImage(int x, int y, int x_debut, int fin_x, int y_debut, int fin_y, String file) {
    BufferedImage i = ImageIO.read(new File(file));
    image = new ImageIcon(i.getSubimage(x_debut, y_fin, x_fin, y_fin));
    //Image scaledImage = originalImage.getScaledInstance(jPanel.getWidth(),jPanel.getHeight(),Image.SCALE_SMOOTH);
  }

}
