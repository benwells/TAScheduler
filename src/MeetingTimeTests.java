/*****************************\
  CSCE747 - FALL 2013
  Ben Wells
  Test 1 - Take Home
\*****************************/
import static org.junit.Assert.*;
import org.junit.Test;

public class MeetingTimeTests {

  @Test
  public void overlapTest() {
    MeetingTime m3 = new MeetingTime(new Time(1100), new Time(1200));
    MeetingTime m4 = new MeetingTime(new Time(1159), new Time(1259));
    assertTrue(m3.overlap(m4));
    MeetingTime m1 = new MeetingTime(new Time(1300), new Time(1330));
    MeetingTime m2 = new MeetingTime(new Time(1331), new Time(1431));
    assertFalse(m1.overlap(m2));
  }
  
  @Test
  public void mtgTest() {
    MeetingTime mtg1 = new MeetingTime(new Time(100), new Time(50));
    assertEquals("sun, 00:00-sun, 01:00", mtg1.format());
    MeetingTime mtg2 = new MeetingTime(new Time(4700), new Time(4830));
    assertEquals("wed, 07:00-wed, 08:30", mtg2.format());
  }
}
