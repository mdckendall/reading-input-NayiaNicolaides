import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter a word:");
    Scanner myScanner = new Scanner(System.in);
    String UserInput = myScanner.nextLine();
    int count = UserInput.length();
    System.out.println(count);
    myScanner.close();
  }
}
