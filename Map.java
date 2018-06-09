// Tyler Chen 6/8/2018 HackHunterdon
// Map Class

import java.util.ArrayList;
import java.util.Random;

public class Map {
    
    private final int lateTime; // The time step at which visitors are considered late
    private int time; // Current time step
    private Tile[][] tileMap;
    private ArrayList<Student> students;
    private ArrayList<Student> removedStudents;
    private ArrayList<Integer[][]> entryTiles;
    private ArrayList<Integer[][]> exitTiles;
    
    private void spawnStudent(int[] coords) {
	Random rand = new Random();
	int[] location = coords[];
	int[] destination = exitTiles.get(rand.nextInt(exitTiles.size())).getCoords();
	Student evan = new Student(location, destination, time);
	students.add(evan);
    }
    
    private void moveStudent(Student evan, int[] coords) {
	if(!students.contains(evan))
	    return;
	int[] currentLocation = evan.getLocation();
	int studentIndex = students.indexOf(evan);
	tileMap[currentLocation[0]][currentLocation[1]].removePerson();
	students.get(studentIndex).updateLocation(int[] coords);
	tileMap[coords[0]][coords[1]].addPerson();
    }

    private void removeStudent(Student evan) {
	
    }

    public Tile[][] getTileMap() {
	return tileMap;
    }

    public void processTimeStep() {
	time++;
    }
    
    public Map(int lateTime, Tile[][] tileMap) {
	this.lateTime = lateTime;
	this.tileMap = tileMap;
    }
}
