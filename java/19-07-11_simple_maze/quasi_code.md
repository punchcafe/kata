>Kate constantly finds herself in some kind of a maze. Help her to find a way out!.
For a given maze and Kate's position find if there is a way out. Your function should return True or False.
Each maze is defined as a list of strings, where each char stays for a single maze "cell". ' ' (space) can be stepped on, '#' means wall and 'k' stays for Kate's starting position. Note that the maze may not always be square or even rectangular.
Kate can move left, up, right or down only.
There should be only one Kate in a maze. In any other case you have to throw an exception.
Example input
```
['# ##',
 '# k#',
 '####']
```
Example output
`true`

Quasi-solution
```

ArrayList<Integer[]> findKaty(mazeArray){
  ArrayList katyLocation
  for(i){
    for(j){
      ArrayList.add([i,j])
    }
  }
  if(katyLocation.length() != 1) raise exception;
  return katyLocation;
}

boolean recursiveSolve(mazeArray, ArrayList path){
  if(path[-1] = indexError){
    return true;
  } elseif (path.mostRecent = '#' or path.hasDuplicates?){
    return false;
  } else {
    return
      recursiveSolve(mazeArray, path.down()) ||
      recursiveSolve(path.up()) ||
      recursiveSolve(path.left()) ||
      recursiveSolve(path.right());
  }
}

extend ArrayList mazePath
up(){
  next step = this.get(this.size())[1]++
  return this.clone().add(nextstep)
}
down(){
  next step = this.get(this.size())[1]++
  return this.clone().add(nextstep)
}
left(){
  next step = this.get(this.size())[1]++
  return this.clone().add(nextstep)
}
right(){
  next step = this.get(this.size())[1]++
  return this.clone().add(nextstep)
}

hasDuplicates(){
  for(i, this.size())
    for(j, this.size())
      if(Arrays.equals(this.get(i), this.get(j)) && i != j){
        return true
      }
  return false;  
}
```

working pre-experiment
```java
import java.util.*;

class Main {
  public static void main(String[] args) {
    Secrets.lol();
  }
}

class Secrets{
  public static void lol(){
    System.out.println("lol");
    Baby example = new Baby();
    example.add(new Integer[]{new Integer(1), new Integer(2)});
    System.out.println(Arrays.toString(example.getLast()));
  }
}

class Baby extends ArrayList<Integer[]>{
  Baby(){
    super();
  }

  public Integer[] getLast(){
    return this.get(this.size()-1);
  }
}
```
