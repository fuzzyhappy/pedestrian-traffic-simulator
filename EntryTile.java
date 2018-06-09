
public class EntryTile extends Tile {

  public EntryTile(int[] coords, int capacity) { super(coords, capacity, 0); }

  public EntryTile(int[] coords, int capacity, int currentStudents) { super(coords, capacity, currentStudents); }

  public String getType() { return "Entry"; }


}
