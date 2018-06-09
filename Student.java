import java.lang.RuntimeException;

public class Student{
  int[] destination;
  int[] location;
  int steps;
  int starttime;
  int endtime;
  boolean tardy;
  boolean inClass;
  public Student(int[] loc, int[] dest, int start){
      destination = dest;
      steps = 0;
      starttime = start;
      tardy = false;
      inClass = false;
  }
  public void updateLocation(int[] loc){
    location = loc;
  }
  public void destReach(int end){
    endtime = end;
    inClass = true;
  }
  public void setTardy(){
    tardy = true;
  }
  public boolean isTardy(){
    return tardy;
  }
  public double eff(){
    if(!inClass) throw new RuntimeException("Checked for eff when student has not reached class.");
    return steps*1.0/(endtime-starttime);
  }

  public int[] getLocation(){
    return location;
  }

}
