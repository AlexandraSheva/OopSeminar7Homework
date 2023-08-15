package calculator;

interface PlusOrMinus {
  /**
   * Складывает дробные числа
   */
  public void add(double num1, double num2);

  /**
   * Вычитает дробные числа
   */
  public void subtrackt(double num1, double num2);

}

interface Multiply {
  /**
   * Умножает дробные числа
   */
  public void multiply(double num1, double num2);
}

interface Divide {
  /**
   * Делит дробные числа
   */
  public void divide(double num1, double num2);
}

public class CalculatorModel implements PlusOrMinus, Divide, Multiply {

  private double result;

  @Override
  public void add(double num1, double num2) {
    result = num1 + num2;
  }

  @Override
  public void subtrackt(double num1, double num2) {
    result = num1 - num2;
  }

  @Override
  public void multiply(double num1, double num2) {
    result = num1 * num2;
  }

  @Override
  public void divide(double num1, double num2) {
    if (num2 != 0) {
      result = num1 / num2;
    } else {
      // Обработка деления на ноль
      throw new IllegalArgumentException("На ноль делить нельзя!");
    }
  }

  /**
   * Выводит результат
   */
  public double getResult() {
    return result;
  }

}