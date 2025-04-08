package select;

import menu.MainApp;

import java.util.InputMismatchException;

public class MultiplyClass extends MainActionClass {
    boolean multiplyNumberLoop = false;


    public void isMultiply() {
        try {
            int actionMultiplyResult;
            while (!multiplyNumberLoop) {
                int multiplyResult;
                firstNumber = random.nextInt(NUMBER);
                secondNumber = random.nextInt(NUMBER);
                actionMultiplyResult = actionMultiply(firstNumber, secondNumber);
                multiplyAnswer = console.nextInt();

                if (multiplyAnswer.equals(actionMultiplyResult)) {

                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Недопустимый ввод, используем цифры");
            multiplyNumberLoop = true;
            MainApp.startMenu();
        }
    }

}
