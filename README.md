# Avaliação 01 Procedimentos e Testagem

Link do Classroom <https://classroom.github.com/a/i-0YwXXM>

## Implementar usando métodos e testar segundo as especificações

Esta atividade é avaliada. Esforço estimado entre 4 e 8h.

Copie os casos de teste para o método `main` em [App.java](src/App.java), conforme o exemplo que já está no arquivo. Comente com `//` ou `/*` e `*/` as linhas que ainda não foram implementadas.

**Restrição: não podem ser usadas as bibliotecas do Java, por exemplo, a classe `Math`, `Scanner`, etc, inclusive os métodos de Integer, como `parseInt` ou métodos de String, EXCETO `length`, `charAt` e `equals`; Os Casos de Teste podem ser corrigidos, mas a especificação não pode ser alterada.**

### Exponenciação

Implementar a classe `Matematica` e um procedimento para fazer potência de inteiros `potencia`.

**Casos de Teste:**

```java
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
```

### Girar String

Dada uma `String` de entrada girá-la no sentido horário. Implemente a classe `Texto` e o procedimento `girar`.

**Casos de Teste:**

```java
String s1 = "worf";
String s2 = Texto.girar(s1);
System.out.println(s1); // worf // string original
System.out.println(s2); // fwor // string girada
System.out.println(s2.equals("fwor") == true); // true
String s3 = Texto.girar(s2);
System.out.println(s3); // rfwo
System.out.println(s3.equals("rfwo") == true); // true
System.out.println(Texto.girar("kira").equals("akir") == true);
System.out.println(Texto.girar(Texto.girar(s3)).equals("worf") == true);
// Casos Especiais
System.out.println(Texto.girar("").equals("") == true);
System.out.println(Texto.girar("a").equals("a") == true);
System.out.println(Texto.girar("aa").equals("aa") == true);
// Adicione mais 2 Casos de Teste
```

### Desbastar String

Implementar o procedimento `aparar` na classe `Texto`, que toma uma `String` de entrada e devolve outra sem o último caractere.

**Casos de Teste:**

```java
String s4 = "seven of nine";
String s5 = Texto.aparar(s4);
System.out.println(s4); // seven of nine
System.out.println(s5); // seven of nin
System.out.println(s5.equals("seven of nin") == true); // true
String s6 = Texto.aparar(s5);
System.out.println(s6); // seven of ni
System.out.println(s6.equals("seven of ni") == true); // true
System.out.println(Texto.aparar("spock").equals("spoc") == true);
// Casos Especiais
System.out.println(Texto.aparar("Q").equals("") == true);
System.out.println(Texto.aparar("").equals("") == true);
System.out.println(Texto.aparar(Texto.aparar(Texto.aparar("abc"))).equals("") == true);
// Adicione mais 2 Casos de Teste:
```

### Valor absoluto de um número

Especificar, implementar e testar um método que resolva o valor absoluto de um número `|n|`. Isto é, tens de especificar as regras válidas para entrada e saída bem como definir os casos de teste.

Referência: <https://pt.wikipedia.org/wiki/Valor_absoluto>

* * *

Deu certo [:)](memes/yes.jpg) Deu errado [:(](memes/no.jpg)
