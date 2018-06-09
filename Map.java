// Tyler Chen 6/8/2018 HackHunterdon
// Map Class

import java.util.ArrayList;
import java.util.Random;
import tiles.*;

public class Map {

    private final int lateTime; // The time step at which visitors are considered late
    private int time; // Current time step
    private Tile[][] tileMap;
    private ArrayList<Student> students;
    private ArrayList<Student> removedStudents;
    private ArrayList<Integer[]> entryTiles;
    private ArrayList<Integer[]> exitTiles;

    private void spawnStudent(int[] coords) {
	Random rand = new Random();
	int[] location = coords;
	int[] destination = exitTiles.get(rand.nextInt(exitTiles.size())).intValue();
	Student evan = new Student(location, destination, time);
	students.add(evan);
    }

    private void moveStudent(Student evan, int[] coords) {
	if(!students.contains(evan))
	    return;
	int[] currentLocation = evan.getLocation();
	int studentIndex = students.indexOf(evan);
	tileMap[currentLocation[0]][currentLocation[1]].removePerson();
	students.get(studentIndex).updateLocation(coords);
	tileMap[coords[0]][coords[1]].addPerson();
    }

    private void removeStudent(Student evan) {
	if(!students.contains(evan))
	    return;
  students.remove(evan);
	removedStudents.add(evan);
    }

    public void processTimeStep() {
	for(Integer[] coords: entryTiles) {
	    Tile currentTile = tileMap[coords[0]][coords[1]];
	    double proportion = (currentTile.getCurrentStudents()*1.0)/(currentTile.getCapacity());
	    double probability = Math.pow(proportion, 5) + 1;
	    if(Math.random() < probability)
		spawnStudent((int[]) coords);
	}

	for(Student evan: students) {

	}

	time++;
    }

    public ArrayList<Student> getActiveStudents() {
	return students;
    }

    public Tile[][] getTileMap() {
	return tileMap;
    }

    public ArrayList<Student> getRemovedStudents() {
	return removedStudents;
    }

    public Map(int lateTime, Tile[][] tileMap) {
	this.lateTime = lateTime;
	this.tileMap = tileMap;
    }
}
