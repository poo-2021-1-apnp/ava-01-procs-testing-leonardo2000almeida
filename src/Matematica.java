public class Matematica {
  public static void main(String[] args) {
   
  }

  public static int potencia(int base, int expoente) {
    int result = 1;
    for (int i = 0; i < expoente; i++) {
      result *= base;
    }
    return result;
  }
}
