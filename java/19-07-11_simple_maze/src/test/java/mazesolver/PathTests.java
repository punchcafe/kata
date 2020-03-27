package mazesolver;

import static org.junit.Assert.*;
import org.junit.Test;

public class PathTests{
  @Test
  public void testOne(){
    //initializes with position
    Path path = new Path(new Integer[]{new Integer(1), new Integer(1)});
    assertEquals((int)path.get(0)[0], 1);
    assertEquals((int)path.get(0)[1], 1);
    Path path2 = new Path(new Integer[]{new Integer(2), new Integer(3)});
    assertEquals((int)path2.get(0)[0], 2);
    assertEquals((int)path2.get(0)[1], 3);
  }
  @Test
  public void testLast(){
    Path path = new Path(new Integer[]{new Integer(1), new Integer(1)});
    path.add(new Integer[]{2,3});
    assertEquals((int)path.currentPosition()[0], 2);
    assertEquals((int)path.currentPosition()[1], 3);
  }
  @Test
  public void testUp(){
    Path path = new Path(new Integer[]{new Integer(1), new Integer(1)});
    Path newPath = path.up();
    assertEquals((int)newPath.currentPosition()[0], 1);
    assertEquals((int)newPath.currentPosition()[1], 0);
  }
  @Test
  public void testDown(){
    Path path = new Path(new Integer[]{new Integer(1), new Integer(1)});
    Path newPath = path.down();
    assertEquals((int)newPath.currentPosition()[0], 1);
    assertEquals((int)newPath.currentPosition()[1], 2);
  }
  @Test
  public void testLeft(){
    Path path = new Path(new Integer[]{new Integer(1), new Integer(1)});
    Path newPath = path.left();
    assertEquals((int)newPath.currentPosition()[0], 0);
    assertEquals((int)newPath.currentPosition()[1], 1);
  }
  @Test
  public void testRight(){
    Path path = new Path(new Integer[]{new Integer(1), new Integer(1)});
    Path newPath = path.right();
    assertEquals((int)newPath.currentPosition()[0], 2);
    assertEquals((int)newPath.currentPosition()[1], 1);
  }
  @Test
  public void testPathCrossesSelf(){
    Path path = new Path(new Integer[]{new Integer(1), new Integer(1)});
    path = path.right();
    assertFalse(path.crossesSelf());
    path = path.left();
    assertTrue(path.crossesSelf());
  }
}
