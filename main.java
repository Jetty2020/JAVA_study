public class main {
  public static void main(String[] args) {
    
    for (int j = 0; j < 10; j++ ) {
      for (int i = 0; i < 10-(j + 1); i++)
        System.out.printf("%c", '☆');

      System.out.println();
    }
  }
}