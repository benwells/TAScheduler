/*****************************\
  CSCE747 - FALL 2013
  Ben Wells
  Test 1 - Take Home
\*****************************/
public class Time {
  private int weekMin;
  private int dayOfWeek;
  private int hourOfWeek;
  private int minute;
  public static int hrMinsConstant   = 60;    
  public static int dayMinsConstant  = 1440;
  public static int weekMinsConstant = 10080;
  public static String[] days = {"sun", 
                               "mon", 
                               "tues", 
                               "wed", 
                               "thurs", 
                               "fri", 
                               "sat"};
      
  public Time() {
    this.weekMin = 0;
    this.dayOfWeek = 0;
    this.hourOfWeek = 0;
    this.minute  = 0;
  }
  
  public Time(int weekMin) {
    if (weekMin < 0) {
      System.out.println("Minutes Must be Greater Than Zero");
      return;
   }
    else if (weekMin >= weekMinsConstant) {
      System.out.println("Minutes of the week cannot be greater than total minutes in a week.");
      return;
    }
    else {
      this.weekMin = weekMin;
      minute = this.weekMin-dayOfWeek*dayMinsConstant-hourOfWeek*weekMinsConstant;
      dayOfWeek = this.weekMin/dayMinsConstant;
      hourOfWeek = (this.weekMin%dayMinsConstant)/hrMinsConstant;
    }         
  }

  /*****************************\
    CONSTRUCTORS
  \*****************************/
  public int getWkMin() {
    return weekMin;
  }
  
  public String getDay() {
    return days[dayOfWeek];
  }
  
  public int getMin() {
   return minute;
  }
              
  public String getDayTime() {
    return String.format("%02d:%02d", hourOfWeek, minute);
  }
                 
  public int getHr() {
    return hourOfWeek;    
  }
  
  public String fmt() {
    String strTime = String.format("%s, %02d:%02d", this.days[dayOfWeek], hourOfWeek, minute);
    return strTime;
  }

  public static void main(String[] args) {
    //TODO add stuff for main.
  }  
}
