import java.util.*;
public class Main {
  public static void main(String[] args) {
    ArrayList<String> edielanguage = new ArrayList<>();
    edielanguage.add("python");
    Person p = new Person("edie", edielanguage);
    p.schedule().get(0).cleaveSchedule(new ScheduleTime(p, "Tuesday", new Juncture(15,45), new Juncture(18,0),false));
    System.out.println(p.schedule());
  }

  // public static Person getCoach(Person student){
  //   //parse the student schedule
  //   //compare that to parts of the database
  //   return student
  // }
}