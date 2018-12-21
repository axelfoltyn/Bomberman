
public enum Direction {
	
	HAUT(0,-1),	BAS(0,1), DROITE(1,0), GAUCHE(-1,0);
	
	public final int x, y;
	
	private Direction(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
