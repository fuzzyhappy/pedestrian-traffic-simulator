import java.lang.RuntimeException;

public class Student{
  Tile destination;
  Tile location;
  int steps;
  int starttime;
  int endtime;
  boolean inClass;
  public Student(Tile loc, Tile dest, int start){
      destination = dest;
      steps = 0;
      starttime = start;
      inClass = false;
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
    if(!inclass) throw new RuntimeException("Checked for eff when student has not reached class.");
    return steps*1.0/(endtime-starttime);
  }

}
