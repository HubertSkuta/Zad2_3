// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

    System.out.println("podaj pierwsza liczbe: ");
    int Liczba_1 = scanner.nextInt();

    System.out.println("Podaj druga liczbe: ");
    int Liczba_2 = scanner.nextInt();

    System.out.println("Suma liczb podanych przez użytkownika: ");
    System.out.println(Liczba_1+Liczba_2);
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}