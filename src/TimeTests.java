/*****************************\
  CSCE747 - FALL 2013
  Ben Wells
  Test 1 - Take Home
\*****************************/
import static org.junit.Assert.*;
import org.junit.Test;
public class TimeTests {

  @Test
  public void dayTest() {
    Time sun = new Time(0);
    assertEquals("sun", sun.getDay());
    
    Time mon = new Time(1440);
    assertEquals("mon", mon.getDay());
    
    Time tues = new Time(2880);
    assertEquals("tues", tues.getDay());
    
    Time wed = new Time(4320);
    assertEquals("wed", wed.getDay());
    
    Time thurs = new Time(5760);
    assertEquals("thurs", thurs.getDay());
    
    Time fri = new Time(7200);
    assertEquals("fri", fri.getDay());
    
    Time sat = new Time(8640);
    assertEquals("sat", sat.getDay());
  }

  @Test
    public void timeTest() {
      Time defaultTime = new Time();
      assertEquals(0, defaultTime.getWkMin());
      assertEquals(0, defaultTime.getHr());
      assertEquals(0, defaultTime.getMin());
      assertEquals("sun", defaultTime.getDay());
      assertEquals("sun, 00:00", defaultTime.fmt());
    }
}
