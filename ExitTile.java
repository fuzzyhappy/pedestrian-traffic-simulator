
public class ExitTile extends Tile {

  public ExitTile(int[] coords, int capacity) { super(coords, capacity, 0); }

  public ExitTile(int[] coords, int capacity, int currentStudents) { super(coords, capacity, currentStudents); }

  public String getType() { return "Exit"; }

}
