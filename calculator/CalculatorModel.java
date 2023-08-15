package calculator;

class MyException extends Exception {
  public MyException(String message) {
    super(message);
  }
}

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
  public void divide(double num1, double num2) throws MyException;
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
  public void divide(double num1, double num2) throws MyException {
    try {
      result = num1 / num2;
    } catch (Exception e) {
      throw new MyException("На ноль делить нельзя!");
    }
    
  }

  /**
   * Выводит результат
   */
  public double getResult() {
    return result;
  }

}