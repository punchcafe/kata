package mazesolver;

import java.util.*;

public class Maze{
  public static boolean hasExit(String[] maze){
    Path origin = new Path(findKaty(maze));
    return recursiveSolve(maze, origin);
  }

  public static boolean recursiveSolve(String[] maze, Path path){
    if(path.crossesSelf()) return false;
    char currentChar;
    int x = path.currentPosition()[0];
    int y = path.currentPosition()[1];
    try{
      currentChar = maze[y].charAt(x);
      if(currentChar == '#') return false;
      return (
      recursiveSolve(maze, path.up())||recursiveSolve(maze, path.down())||
      recursiveSolve(maze, path.left())||recursiveSolve(maze, path.right())
      );
    } catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){
      return true;
    }
  }

  public static Integer[] findKaty(String[] maze){
    List<Integer[]> katyLocation = new ArrayList<Integer[]>();
    for(int j = 0; j < maze.length; j++){
      for(int i = 0; i < maze[j].length(); i++){
        if(maze[j].charAt(i) == 'k')
          katyLocation.add(new Integer[]{new Integer(i),new Integer(j)});
      }
    }
    if(katyLocation.size() != 1) throw new RuntimeException() ;
    return katyLocation.get(0);
  }
}
