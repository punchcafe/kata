package kata;
import java.util.*;


class SqInRect{
  public static ArrayList<Integer> sqInRect(int length, int width){
    if( length == width ) return null;
    return splitRectangle(length, width);
  }
  private static ArrayList<Integer> splitRectangle(int length, int width){
    if(length==width){
      return extractDimensionToArrayList(length);
    } else {
      //make this a hashmap?
      //make this a get realtive dimensions
      int longer = width > length ? width : length;
      int shorter = width < length ? width : length;
      //this speaks for itself
      ArrayList<Integer> removedSquareDimension = extractDimensionToArrayList(shorter);
      //recur call on new rect dimensions splitNewRect
      int newLonger = longer - shorter;
      ArrayList<Integer> recursiveCall = splitRectangle(shorter, newLonger);
      // merge with return removedSquareDimensions + splitNewRect
      removedSquareDimension.addAll(recursiveCall);
      return removedSquareDimension;
    }
  }
  private static ArrayList<Integer> extractDimensionToArrayList(int length){
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(length);
    return arrayList;
  }
}
