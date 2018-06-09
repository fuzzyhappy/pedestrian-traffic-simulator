
public class SpaceTile implements Tile {

  int[] coords;
  int capacity;
  int currentStudents;

  public SpaceTile(int[] coords) {
    this.coords = coords;
    this.capacity = 1;
    this.currentStudents = 0;
  }

  public SpaceTile(int[] coords, boolean hasStudent) {
    this.coords = coords;
    if (hasStudent) { this.currentStudents = 1; }
    this.capacity = 1;
  }

  public int[] getCoords() { return this.coords; }
  public int getCapacity() { return this.capacity; }
  public int getCurrentStudents() { return this.currentStudents; }

  public boolean addPerson() {
    if (this.currentStudents != 1) {
      this.currentStudents = 1;
      return true;
    }
    else return false;
  }

  public boolean removePerson() {
    if (this.currentStudents != 0) {
      this.currentStudents = 0;
      return true;
    }
    else return false;
  }

  public String getType() { return "Space"; }

}
