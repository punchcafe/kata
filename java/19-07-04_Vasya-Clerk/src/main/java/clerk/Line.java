package clerk;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class Line{
  public static String Tickets(int[] customerBills){
    HashMap<Integer, Integer> billsInRegister = generateEmptyRegister();
    boolean haveEnoughChange;
    for(int bill: customerBills){
      switch(bill){
        case 25:
          haveEnoughChange = true;
          break;
        case 50:
          if(billsInRegister.get(25)>0){
            haveEnoughChange = true;
          } else {
            haveEnoughChange = false;
            return "NO";
          }
          break;
        case 100:
          if(billsInRegister.get(25)>3 || (billsInRegister.get(50) > 0 && billsInRegister.get(25) > 0)){
            haveEnoughChange = true;
          } else {
            haveEnoughChange = false;
            return "NO";
          }
          break;
      }
      optimalChange(bill, billsInRegister);


    }
    return "YES";
  }
  public static HashMap<Integer, Integer> generateEmptyRegister(){
    HashMap<Integer, Integer> emptyRegister = new HashMap<Integer, Integer>();
    emptyRegister.put(25,0);
    emptyRegister.put(50,0);
    emptyRegister.put(100,0);
    return emptyRegister;
  }
  public static int[] optimalChange(
    int note,
    HashMap<Integer, Integer> billsInRegister){
      ArrayList orderedHashKeys = new ArrayList<Integer>(billsInRegister.keySet());
      Collections.sort(orderedHashKeys);
      int changeNeeded = note;
      for(int i = 0; i<orderedHashKeys.size(); i++){
        int neededBills = ((int)orderedHashKeys.get(i))/changeNeeded;
        int availableBills = billsInRegister.get(orderedHashKeys.get(i));
        if(availableBills >= neededBills){
          billsInRegister.put(orderedHashKeys[i], 0)
        } else {}
        System.out.println(orderedHashKeys.get(i));
      }
    return null;
  }
}
