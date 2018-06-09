
public interface Tile {

  int[] getCoords();
  int getCapacity();
  int getCurrentStudents();

  boolean addPerson(); // if fails, returns false
  boolean removePerson();

  String getType();


}
