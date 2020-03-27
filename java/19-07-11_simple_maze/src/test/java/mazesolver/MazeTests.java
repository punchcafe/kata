package mazesolver;

import static org.junit.Assert.*;
import org.junit.Test;

public class MazeTests{
  @Test
  public void testOne(){
    System.out.println("Test one");
    String[] simplestCase = new String[]{"k"};
    assertTrue(Maze.hasExit(simplestCase));
  }
  @Test
  public void testTwo(){
    System.out.println("Test two");
    String[] noExitCase = new String[]{"###",
                                       "#k#",
                                       "###"};
    assertFalse(Maze.hasExit(noExitCase));
  }
  @Test
  public void testThree(){
    System.out.println("Test three");
    String[] possibleExitCase = new String[]{"# #",
                                             "#k#",
                                             "###"};
    assertTrue(Maze.hasExit(possibleExitCase));
  }
  @Test
  public void testFour(){
    System.out.println("Test Four");
    String[] spiralExitCase = new String[]{"### #",
                                           "#k# #",
                                           "#   #",
                                           "#####"};
    assertTrue(Maze.hasExit(spiralExitCase));
  }
  @Test
  public void testFive(){
    System.out.println("Test Five");
    String[] spiralExitCase = new String[]{"#####",
                                           " k# #",
                                           "#   #",
                                           "#####"};
    assertTrue(Maze.hasExit(spiralExitCase));
  }
  @Test
  public void testSix(){
    System.out.println("Test Six");
    String[] easternExit = new String[]{"########",
                                        "# # ####",
                                        "# #k#   ",
                                        "# # # ##",
                                        "# # # ##",
                                        "#      #",
                                        "########"};
    assertTrue(Maze.hasExit(easternExit));
  }
  @Test
  public void testFindKaty(){
    String[] someMaze = new String[]{"###",
                              "#k#",
                              "###"};
    Integer[] katy = Maze.findKaty(someMaze);
    assertEquals((int)katy[0], 1);
    assertEquals((int)katy[1], 1);
  }
}
