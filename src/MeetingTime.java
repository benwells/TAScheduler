/*****************************\
  CSCE747 - FALL 2013
  Ben Wells
  Test 1 - Take Home
\*****************************/
public class MeetingTime {

  private Time start = new Time();
  private Time end = new Time(Time.hrMinsConstant);
    
  public MeetingTime(Time start, Time end) {
    
    if (start.getWkMin() >= end.getWkMin()) {
      System.out.println("Meeting Cannot Start After It Ends");
      return;
    }
    this.start = new Time(start.getWkMin());
    this.end = new Time(end.getWkMin());
  }
  
  public boolean overlap(MeetingTime x) {
    if (this.start.getWkMin() == x.start.getWkMin()) {
      return true;
    }
    else if (this.start.getWkMin() < x.start.getWkMin() && this.end.getWkMin() > x.start.getWkMin()) {
      return true;
    }
    else if (this.start.getWkMin() > x.start.getWkMin() && this.start.getWkMin() < x.end.getWkMin()) {
      return true;
    }        
    return false;
  }
  
  public String format() {
    String meeting = start.toString() + "-" + end.toString();
    return meeting;
  }

  public static void main(String[] args) {
    //TODO add stuff for main.
  }
}
