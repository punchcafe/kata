package squareEveryDigit;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquareEveryDigitTests {
  @Test
  public void testOne(){
    assertEquals(SquareEveryDigit.squareEveryDigit(1), 1);
  }
  @Test
  public void testTwo(){
    assertEquals(SquareEveryDigit.squareEveryDigit(123),149);
  }
  @Test
  public void test() {
    assertEquals(811181, new SquareEveryDigit().squareEveryDigit(9119));
  }
}
