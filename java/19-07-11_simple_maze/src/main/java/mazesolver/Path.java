package mazesolver;
import java.util.ArrayList;
//use an interfact to encapsulate
public class Path extends ArrayList<Integer[]> {
  public Path(Integer[] origin){
    this.add(origin);
  }

  public Integer[] currentPosition(){
    return this.get(this.size()-1);
  }

  public Path up(){
    return pathWithNewStep('u');
  }

  public Path down(){
    return pathWithNewStep('d');
  }

  public Path left(){
    return pathWithNewStep('l');
  }

  public Path right(){
    return pathWithNewStep('r');
  }

  public boolean crossesSelf(){
    boolean result = false;
    for(int i = 0; i< this.size(); i++){
      for(int j = 0; j < this.size(); j++){
        if( j!=i && ((int)this.get(i)[0] == (int)this.get(j)[0] &&
                (int)this.get(i)[1] == (int)this.get(j)[1])) result = true;
      }
    }
    return result;
  }

  public Path clone(){
    Path newPath = new Path(this.origin());
    for(int i = 1; i<this.size(); i++){
      newPath.add(this.get(i));
    }
    return newPath;
  }

  public Integer[] origin(){
    return this.get(0);
  }

  private Integer[] incrementOneCoordinate(Integer[] position, char direction){
    Integer[] nextStep = new Integer[2];
    if(direction == 'u' || direction =='d'){
      nextStep[0] = position[0];
      nextStep[1] = direction == 'u' ? position[1] - 1 : position[1] + 1 ;
    } else if(direction == 'l' || direction =='r'){
      nextStep[1] = position[1];
      nextStep[0] = direction == 'l' ? position[0] - 1 : position[0] + 1 ;
    }
    return nextStep;
  }
  private Path pathWithNewStep(char incrementDirection){
    Path newPath = this.clone();
    Integer[] nextStep = this.incrementOneCoordinate(
        this.currentPosition(),incrementDirection);
    newPath.add(nextStep);
    return newPath;
  }
}
