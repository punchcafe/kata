package JadenCasing;
import java.util.Arrays;

public class JadenCasing {
  public static String jadenCasing(String phrase){
    if(phrase == null || phrase == ""){return null;}
    String[] wordsArray = phrase.split(" ");
    wordsArray = capitalizeWordArray(wordsArray);
    String result = String.join(" ", wordsArray);
    return result;
  }
  private static String[] capitalizeWordArray(String[] wordsArray){
    for(var i = 0; i < wordsArray.length; i++){
      wordsArray[i] = wordsArray[i].substring(0,1).toUpperCase() + wordsArray[i].substring(1);
    }
    return wordsArray;
  }
}
