package calculator;

public class CalculatorController {
  private CalculatorView view;

  private CalculatorModel model;

  public CalculatorController (CalculatorModel model, CalculatorView view) {
    this.model = model;
    this.view = view;
  }

  public void performOperation(String operation, double num1, double num2) {
    switch (operation) {
      case "+": 
        model.add(num1, num2);
        break;
      case "-":
        model.subtrackt(num1, num2);
        break;
      case "*":
        model.multiply(num1, num2);
        break;
      case "/":
        try {
          model.divide(num1, num2);
        } catch (MyException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        break;
      default:
        System.out.println("Некорректная операция!");
    }
    view.displayResult(model.getResult());
  }
}