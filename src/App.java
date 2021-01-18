// Todo projeto possui uma classe Principal, Main ou nome do projeto (como Template.java)
class App {
  // a classe principal possui o método principal main()
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    // método Matematica.potencia que entram dois inteiros e sai um inteiro
    // potencia(int,int):int
    int base = 3;
    int expoente = 4;
    int result = Matematica.potencia(base, expoente);
    System.out.println(result); // imprime 81
    System.out.println(result == 81); // imprime true

    // Casos de Teste:
    System.out.print("potencia(3, 2) == 9 "); // 3 ao quadrado
    System.out.println(Matematica.potencia(3, 2) == 9); // 3 ao quadrado
    System.out.print("potencia(2, 3) == 8 "); // 2 ao cubo
    System.out.println(Matematica.potencia(2, 3) == 8); // 2 ao cubo
    // Números grandes
    System.out.print("potencia(23, 6) == 148035889 ");
    System.out.println(Matematica.potencia(23, 6) == 148035889);
    System.out.print("potencia(2, 30) == 1073741824 ");
    System.out.println(Matematica.potencia(2, 30) == 1073741824);
    // Casos Especiais: bases negativas
    System.out.print("potencia(-2, 3) == -8 ");
    System.out.println(Matematica.potencia(-2, 3) == -8);
    System.out.print("potencia(-2, 4) == 16 ");
    System.out.println(Matematica.potencia(2, 4) == 16);
    // Casos não cobertos: expoente negativo
    System.out.print("potencia(2, -3) == 0 ");
    System.out.println(Matematica.potencia(2, -3) == 0);
    System.out.print("potencia(7, -2) == 0 ");
    System.out.println(Matematica.potencia(7, -2) == 0);
    // Adicione mais 2 Casos de Teste
    System.out.print("potencia(25,-3) == 0 ");
    System.out.println(Matematica.potencia(25, -3) == 0);
    System.out.print("potencia(2,10) == 1024 ");
    System.out.println(Matematica.potencia(2, 10) == 0);
    System.out.println("Classe matematica acima\n");

    // teste da classe texto abaixo
    // girar
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
    System.out.println("Classe Texto metódo girar acima\n");
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

    System.out.println("Classe Texto metódo aparar acima\n");

    // Testes valor absoluto
    // casos comuns
    // Só existem números absolutos
    System.out.println(Matematica.absolutValue(-3) == 3);
    System.out.println(Matematica.absolutValue(10) == 10);
    System.out.println(Matematica.absolutValue(-4) == 4);
    System.out.println(Matematica.absolutValue(-15));
  }
}

class Matematica {
  public static int potencia(int base, int expoente) {
    int result = 1;
    for (int i = 0; i < expoente; i++) {
      result *= base;
    }
    return result;
  }

  public static int absolutValue(int number) {
    if (number < 0) {
      return (number * (-1));
    } else {
      return number;
    }
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