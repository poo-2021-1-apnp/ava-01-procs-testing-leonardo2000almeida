public class Texto {
  public static void main(String[] args) {

  }

  public static String girar(String word) {
    final int finalLetter = word.length();
    if (finalLetter > 0) {
      String noFinal = word.substring(0, finalLetter - 1);
      String firstLetter = word.substring(finalLetter - 1);
      return (firstLetter + noFinal);
    }
    return "";
  }

  public static String aparar(String word) {
    final int finalLetter = word.length();
    if (finalLetter > 0) {
      String wordWithoutFinal = word.substring(0, finalLetter - 1);
      return wordWithoutFinal;
    }
    return "";
  }
}