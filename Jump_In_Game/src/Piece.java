/**
 * An interface for all pieces on the board
 * @author zheji
 *
 */
public abstract class Piece {
	public static enum pieceName {R1, R2, R3, F1, F2, M1, M2, FINISH};
	private Tuple location;
	private pieceName name;
	
	public Tuple getLocation() {
		return this.location;
	}
	
	public pieceName getName () {
		return this.name;
	}
	
	public abstract void setLocation (Tuple location);
	
	
}