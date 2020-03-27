package deleteOccurences;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class EnoughIsEnough{

  public static int[] deleteNth(int[] elements, int maxDuplicates){
    if(maxDuplicates == 0) return new int[0];
    List<Integer> legalList = createListWithoutExcessiveDuplicates(elements, maxDuplicates);
    return convertIntegerListToIntArray(legalList);
  }

  private static List<Integer> createListWithoutExcessiveDuplicates(int[] array, int maxLegalDuplicates){
    HashMap<Integer, Integer> intOccurences = new HashMap<Integer, Integer>();
    List<Integer> legalList = new ArrayList<Integer>();
    for(int element: array){
      if(intOccurences.get(element) == null || intOccurences.get(element) < maxLegalDuplicates){
        intOccurences.put(element, intOccurences.getOrDefault(element, 0)+1);
        legalList.add(element);
      }
    }
    return legalList;
  }

  private static int[] convertIntegerListToIntArray(List<Integer> list){
    int[] intArray = new int[list.size()];
    for(int i = 0; i < list.size(); i++){
      intArray[i] = (int)list.get(i);
    }
    return intArray;
  }
}
