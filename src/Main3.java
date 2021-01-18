public class Main3 {
  public static void main(String[] args) {
    // Testes valor absoluto
    // casos comuns
    // Só existem números absolutos postivos
    System.out.println(Value.absolutValue(-3) == 3);
    System.out.println(Value.absolutValue(10) == 10);
    System.out.println(Value.absolutValue(-4) == 4);
    System.out.println(Value.absolutValue(-15));
  }

}

class Value {
  public static int absolutValue(int number) {
    if (number < 0) {
      return (number * (-1));
    } else {
      return number;
    }
  }
}
