package tiles;

public class WallTile extends Tile {

  public WallTile(int[] coords) { super(coords, 0, 0); }

  public WallTile(int[] coords, int capacity, int currentStudents) { super(coords, capacity, currentStudents); }

  public String getType() { return "Wall"; }


}
