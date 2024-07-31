class Juncture{
  private int hour;
  private int minute;
  public Juncture(int hour, int minute){
    this.hour=hour;
    this.minute=minute;
  }
  public String toString(){return ""+hour+":"+(minute<10?"0"+minute:minute);}
  public int asInt(){return hour*60+minute;}
}