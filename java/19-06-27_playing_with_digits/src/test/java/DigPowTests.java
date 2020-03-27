package DigPow;

import org.junit.Test;
import static org.junit.Assert.*;

public class DigPowTests{
  @Test
  public void DigPowTest1(){
    assertEquals(1, DigPow.digPow(89, 1));
  }
  @Test
  public void DigPowTest2(){
    assertEquals(51, DigPow.digPow(46288, 3));
  }
}
