
public class SpaceTile extends Tile {

  public SpaceTile(int[] coords) { super(coords, 1, 0); }

  public SpaceTile(int[] coords, int hasStudent) { super(coords, 1, hasStudent); }

  public String getType() { return "Space"; }

}
