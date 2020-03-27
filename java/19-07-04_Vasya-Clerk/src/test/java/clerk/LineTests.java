package clerk;

import org.junit.Test;
import static org.junit.Assert.*;

public class LineTests{
  @Test
  public void testOne(){
    assertEquals(Line.Tickets(new int[] {25,25,50}),"YES");
  }
  @Test
  public void testTwo(){
    assertEquals(Line.Tickets(new int[] {25,100}),"NO");
  }
}
