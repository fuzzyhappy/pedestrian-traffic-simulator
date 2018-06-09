package tiles;

public abstract class Tile {

  private int[] coords;
  private int capacity;
  private int currentStudents;

  public Tile(int[] coords, int capacity, int currentStudents) {
    this.coords = coords;
    this.capacity = capacity;
    this.currentStudents = currentStudents;
  }

  public int[] getCoords() { return this.coords; }
  public int getCapacity() { return this.capacity; }
  public int getCurrentStudents() { return this.currentStudents; }
  public int getSpace(){return this.capacity-this.currentStudents;}

  // if adding or subtracting fails, returns false
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

  public boolean isAccessible() {
    if (this.currentStudents < capacity) return true;
    else return false;
  }

  public abstract String getType();


}
