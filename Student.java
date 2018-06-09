import java.lang.RuntimeException;

public class Student{
  int[] destination;
  int[] location;
  int steps;
  int starttime;
  int endtime;
  boolean inClass;
  public Student(int[] loc, int[] dest, int start){
      destination = dest;
      steps = 0;
      starttime = start;
      inClass = false;
  }
  public void updateLocation(int[] loc){
    location = loc;
  }
  public void destReach(int end){
    endtime = end;
    inClass = true;
  }
  public boolean onTime(){
    if(!inClass) throw new RuntimeException("Checked for student on time when not in class.");
    if(endtime <=500) return true;
    else return false;
  }
  public double eff(){
    if(!inClass) throw new RuntimeException("Checked for eff when student has not reached class.");
    return steps*1.0/(endtime-starttime);
  }

  public int[] getLocation(){
    return location;
  }

}
