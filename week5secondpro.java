public class week5secondpro {
  public static void main(String[] args) {
    Number n = new Number();
    n.printFizzBuzz(1, 100);
}
}class Number {
  public void printFizzBuzz(int start, int end) {
    for (int i = start; i <= end; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
}
}
