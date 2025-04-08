package select;

import menu.MainApp;

import java.util.InputMismatchException;

public class MultiplyClass extends MainActionClass {
    boolean multiplyNumberLoop = false;


    public void isMultiply() {
        try {
            while (!multiplyNumberLoop) {
                int plusResult;

                firstNumber = random.nextInt(NUMBER);
                secondNumber = random.nextInt(NUMBER);
                plusResult = actionPlus(firstNumber, secondNumber);




                if (plusAnswer.equals(plusResult)) {
                    System.out.println("Правильно!");

                } else {
                    checkCorrectAnswerAfterMistakes(plusResult);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Недопустимый ввод, используем цифры");
            additionNumberLoop = true;
            MainApp.startMenu();
        }
    }

}
