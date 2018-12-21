
public class Point {
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	// Gestion des points
	
	public void add(Point p) {
		x += p.x;
		y += p.y;
	}
	
	public void add(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public void sub(int x, int y) {
		add(-x, -y);
	}
	
	public void add(Direction d) {
		add(d.x, d.y);
	}	
	
	public void sub(Point p) {
		sub(p.x, p.y);
	}
	
	// Accesseurs ( on pourrait mettre en public a ce point)
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
