package calculator;

import java.util.Scanner;

public class CalculatorView {
  public Scanner scanner;

  public CalculatorView () {
    scanner = new Scanner(System.in);
  }

  public void displayResult(double result) {
    System.out.println("Результат " + result + ". ");
  }

  public String getOperation() {
    System.out.println("Введите операцию: ( +, -, *, /. )");
    return scanner.nextLine();
  }

  public double getOperand () {
    System.out.println("Введите число: ");
    return Double.parseDouble(scanner.nextLine());
  }
}
