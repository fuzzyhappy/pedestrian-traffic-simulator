package tiles;

public class EntryTile extends Tile {

  public EntryTile(int[] coords, int capacity) { super(coords, capacity, capacity); }

  public EntryTile(int[] coords, int capacity, int currentStudents) { super(coords, capacity, currentStudents); }

  public String getType() { return "Entry"; }


}
