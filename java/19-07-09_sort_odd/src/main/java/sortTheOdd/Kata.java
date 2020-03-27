package sortTheOdd;

import java.util.*;

public class Kata{
  public static int[] sortArray(int[] unsortedArray){
    if(unsortedArray.length==0)return unsortedArray;
    List<Integer> oddIntegers = getOddIntegersFromArray(unsortedArray);
    Collections.sort(oddIntegers);
    int[] sortedArray = replaceOddElementsWithListElements(unsortedArray, oddIntegers);
    return sortedArray;
  }
  private static List<Integer> getOddIntegersFromArray(int[] array){
    List<Integer> oddIntegers = new ArrayList<Integer>();
    for(int number: array) if(number % 2 == 1) oddIntegers.add(number);
    return oddIntegers;
  }
  private static int[] replaceOddElementsWithListElements(int[] array, List<Integer> list){
    int[] cloneArray = array.clone();
    int listIteratorIndex = 0;
    for(int i = 0; i<cloneArray.length; i++){
      if(cloneArray[i]%2==1){
        cloneArray[i] = list.get(listIteratorIndex);
        listIteratorIndex++;
      }
    }
    return cloneArray;
  }
}
