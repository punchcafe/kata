package squareEveryDigit;
import java.util.ArrayList;

public class SquareEveryDigit {

  public static int squareEveryDigit(int digits){
    String digitString = Integer.toString(digits);
    ArrayList<Integer> digitArrayList = digitStringToIntArrayList(digitString);
    ArrayList<Integer> squaredDigitsArrayList = squareArrayListElements(digitArrayList);
    return integerArrayListToDigits(squaredDigitsArrayList);
  }

  private static ArrayList<Integer> digitStringToIntArrayList(String digitString){
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    for(int i = 0; i<digitString.length(); i++){
      arrayList.add(Integer.parseInt(digitString.substring(i,i+1)));
    }
    return arrayList;
  }
  private static ArrayList<Integer> squareArrayListElements(ArrayList<Integer> arrayList){
    ArrayList<Integer> squaredArrayList = new ArrayList<Integer>();
    for( int value: arrayList ){
      squaredArrayList.add((int)Math.pow(value,2));
    }
    return squaredArrayList;
  }
  private static int integerArrayListToDigits(ArrayList<Integer> digitsArrayList){
    int arrayAsDigits = 0;
    for( int i: digitsArrayList ){
      arrayAsDigits *= i<10? 10 : 100;
      arrayAsDigits += i;
    }
    return arrayAsDigits;
  }
}
