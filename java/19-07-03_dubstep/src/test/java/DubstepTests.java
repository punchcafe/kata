package dubstep;
import org.junit.Test;
import static org.junit.Assert.*;

public class DubstepTests{
  @Test
  public void testOne(){
    assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
  }
  @Test
  public void testTwo(){
    assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
  }
}
