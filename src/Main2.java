public class Main2 {
  public static void main(String[] args) {
    String s1 = "worf";
    String s2 = Texto.girar(s1);
    System.out.println(s1); // worf // string original
    System.out.println(s2); // fwor // string girada
    System.out.println(s2.equals("fwor")); // true
    String s3 = Texto.girar(s2);
    System.out.println(s3); // rfwo
    System.out.println(s3.equals("rfwo")); // true
    System.out.println(Texto.girar("kira").equals("akir"));
    System.out.println(Texto.girar(Texto.girar(s3)).equals("worf"));
    // Casos Especiais
    System.out.println(Texto.girar("").equals(""));
    System.out.println(Texto.girar("a").equals("a"));
    System.out.println(Texto.girar("aa").equals("aa"));
    // Adicione mais 2 Casos de Teste
    System.out.println(Texto.girar("bot").equals("otb"));// caso falso
    System.out.println(Texto.girar("Clash").equals("hClas"));// caso verdadeiro

    // aparar
    String s4 = "seven of nine";
    String s5 = Texto.aparar(s4);
    System.out.println(s4); // seven of nine
    System.out.println(s5); // seven of nin
    System.out.println(s5.equals("seven of nin") == true); // true
    String s6 = Texto.aparar(s5);
    System.out.println(s6); // seven of ni
    System.out.println(s6.equals("seven of ni")); // true
    System.out.println(Texto.aparar("spock").equals("spoc"));
    // Casos Especiais
    System.out.println(Texto.aparar("Q").equals(""));
    System.out.println(Texto.aparar("").equals(""));
    System.out.println(Texto.aparar(Texto.aparar(Texto.aparar("abc"))).equals(""));
    // Adicione mais 2 Casos de Teste:
    System.out.println(Texto.aparar(Texto.aparar("marcio")).equals("marc"));// caso verdadeiro
    System.out.println(Texto.aparar(Texto.aparar("Marioko")).equals("Mari"));// caso falso
  }
}

class Texto {
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