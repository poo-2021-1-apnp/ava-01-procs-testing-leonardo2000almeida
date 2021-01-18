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

  }
}
