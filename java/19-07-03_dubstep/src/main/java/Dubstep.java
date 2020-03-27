package dubstep;

class Dubstep{
  public static String SongDecoder(String songLyrics){
    return songLyrics.replaceAll("(WUB)+"," ").trim();
  }
}
