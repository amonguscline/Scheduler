import java.util.*;
record ScheduleTime(Person person, String day, Juncture startingTime, Juncture endingTime, boolean availible){
  public void cleaveSchedule(ScheduleTime subschedule){
    if(availible&&person==subschedule.person()){
      if(day==subschedule.day()){
        if(startingTime.asInt()<=subschedule.startingTime().asInt() && endingTime.asInt()>=subschedule.endingTime().asInt()){
          int index = person.schedule().indexOf(this);
          if(!(startingTime.asInt()==subschedule.startingTime().asInt())){
            person.schedule().add(index++,new ScheduleTime(person, day, startingTime, subschedule.startingTime(), true));
          }
          person.schedule().add(index++,subschedule);
          if(!(endingTime.asInt()==subschedule.endingTime().asInt())){
            person.schedule().add(index++,new ScheduleTime(person, day, subschedule.endingTime(), endingTime, true));
          }
          person.schedule().remove(person.schedule().indexOf(this));
        }
      }
    }
  }
  public String toString(){return "On " +day+", "+person+" has an "+(availible?"open":"not open")+" block from "+startingTime+" to "+endingTime;}
}