package deleteOccurences;

import org.junit.Test;
import static org.junit.Assert.*;

public class EnoughIsEnoughTests{
  @Test
  public void testOne(){
    assertArrayEquals(EnoughIsEnough.deleteNth(new int[] {1,2,3}, 2), new int[] {1,2,3});
  }
  @Test 
  public void testTwo(){
    assertArrayEquals(EnoughIsEnough.deleteNth(new int[] {2,2,2}, 2), new int[] {2,2});
  }
}
