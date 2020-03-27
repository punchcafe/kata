package kata;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class SqInRectTests{
  @Test
  public void testOne(){
    assertEquals(null, SqInRect.sqInRect(5, 5));
  }
  @Test
  public void testTwo(){
    List<Integer> res = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1));
    assertEquals(res, SqInRect.sqInRect(5, 3));
  }
}
