import java.util.*;
public class Person{
  String name;
  ArrayList<String> languages;
  ArrayList<ScheduleTime> schedule = new ArrayList<>(); //arraylist?
  public ArrayList<ScheduleTime> schedule(){return schedule;}
  public Person(String name, ArrayList<String> languages){
    this.name=name;
    this.languages=languages;
    schedule.add(new ScheduleTime(this,"Tuesday",new Juncture(15,45),new Juncture(19,15),true));
    
  }
  public String toString(){return name;}
}