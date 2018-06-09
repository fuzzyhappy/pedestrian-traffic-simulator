
public class EntryTile extends Tile {

  public Wall(int[] coords) { super(coords, 0, 0); }

  public EntryTile(int[] coords, int capacity, int currentStudents) { super(coords, capacity, currentStudents); }

  public String getType() { return "Wall"; }


}
