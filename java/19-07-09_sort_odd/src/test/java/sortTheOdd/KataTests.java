package sortTheOdd;

import static org.junit.Assert.*;
import org.junit.Test;

public class KataTests{
  @Test
  public void testOne(){
    assertArrayEquals(Kata.sortArray(new int[0]), new int[0]);
  }
  @Test 
  public void testTwo(){
    assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, Kata.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
  }
}
