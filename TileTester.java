import tiles.*;

public class TileTester {

  public static void main(String [] args) {

    Tile[][] tileMap = new Tile[10][10];

    Map map = new Map(5, tileMap);

    /*
    map[5][4] = new SpaceTile(new int[] {5, 4});
    map[5][5] = new EntryTile(new int[] {5, 5}, 5, 3);
    map[2][4] = new WallTile(new int[] {2, 4});
    */

    for (int i = 0; i < map.getTileMap().length; i++) {
      for (int j = 0; j < map.getTileMap()[i].length; j++) {
        Tile mapTile = map.getTileMap()[i][j];
        if (mapTile == null) { System.out.print(". "); }

        else {
          switch (mapTile.getType()) {

            case "Space" :
              String toPrint;
              if (mapTile.getCurrentStudents() == 0) { toPrint = "%"; }
              else { toPrint = "X"; }
              System.out.print(toPrint + " ");
              break;

            case "Wall" :
              System.out.print("! ");
              break;

            case "Entry" :
              System.out.print(mapTile.getCurrentStudents() + " ");
              break;

            case "Exit" :
              System.out.print(mapTile.getCurrentStudents() + " ");
              break;

            default :
             System.out.print("? ");
          }
        }

      }
      System.out.println();
    }
  }
}
