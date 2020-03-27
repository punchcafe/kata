package JadenCasing;

import org.junit.Test;
import static org.junit.Assert.*;

public class JadenCasingTests {
  @Test
  public void testOne(){
    assertEquals("My Mirrors Are Mirrors", JadenCasing.jadenCasing("my mirrors are mirrors"));
  }
  @Test
  public void testForNull(){
    assertNull(JadenCasing.jadenCasing(null));
  }
  @Test
  public void testForEmptyString(){
    assertNull(JadenCasing.jadenCasing(""));
  }
}
