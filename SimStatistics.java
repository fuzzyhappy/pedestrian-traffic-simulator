import java.util.ArrayList;
import java.util.Iterator;
public class SimStatistics{
  private Map map;
  private ArrayList<Student> students;
  public SimStatistics(Map finishedMap){
    map = finishedMap;
    students = finishedMap.getRemovedStudents();
  }
  private double pctLate(){
    Iterator itr = students.iterator();
    int numLate = 0;
    while(itr.hasNext()){
      if (itr.next().isTardy()) numLate++;
    }
    return numLate*1.0/students.size();
  }
  private double avgEff(){
    Iterator itr = students.iterator();
    double totaleff = 0;
    while(itr.hasNext()){
      totaleff  += itr.next().eff();
    }
  }
  public String printStats(){
    String s = "";
    s+="Percentage of students late: "+ pctLate()*100+"%\n";
    s+="Average efficiency: "+avgEff()*100;
  }
}
