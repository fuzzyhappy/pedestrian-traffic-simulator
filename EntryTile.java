
public class EntryTile implements Tile {

  int[] coords;
  int capacity;
  int currentStudents;

  public EntryTile(int[] coords, int capacity) {
    this.coords = coords;
    this.capacity = capacity;
    this.currentStudents = 0;
  }

  public EntryTile(int[] coords, int capacity, int currentStudents) {
    this.coords = coords;
    this.capacity = capacity;
    this.currentStudents = currentStudents;
  }

  public int[] getCoords() { return this.coords; }
  public int getCapacity() { return this.capacity; }
  public int getCurrentStudents() { return this.currentStudents; }

  public boolean addPerson() {
    if (this.currentStudents < this.capacity) {
      this.currentStudents++;
      return true;
    }
    else return false;
  }

  public boolean removePerson() {
    if (this.currentStudents > 0) {
      this.currentStudents--;
      return true;
    }
    else return false;
  }

  public String getType() { return "Entry"; }


}
