package select;

import menu.MainApp;

import java.util.InputMismatchException;

public class MultiplyClass extends MainActionClass {
    boolean multiplyNumberLoop = false;
    boolean multiplyNumberLoopCheckCorrect = false;

    public void isMultiply() {
        try {
            while (!multiplyNumberLoop) {
                int multiplyResult;

                firstNumber = random.nextInt(NUMBER);
                secondNumber = random.nextInt(NUMBER);
                multiplyResult = actionMultiply(firstNumber, secondNumber);
                System.out.printf("%d * %d = ", firstNumber, secondNumber);
                multiplyAnswer = console.nextInt();

                if (multiplyAnswer.equals(multiplyResult)) {
                    System.out.println("Правильно!");
                } else {
                    multiplyCheckCorrectAnswerAfterMistakes(multiplyResult);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Недопустимый ввод, используем цифры");
            multiplyNumberLoop = true;
            MainApp.startMenu();
        }
    }
    public void multiplyCheckCorrectAnswerAfterMistakes(int multiplyResult) {
        //Метод проверки правильности решения примера (умножение)
        MULTIPLY_BLOCK_CODE:
        while (!multiplyNumberLoopCheckCorrect) {
            System.out.println("Неправильно, попробуй еще раз: ");
            System.out.printf("%d * %d = ", firstNumber, secondNumber);
            multiplyAnswer = console.nextInt();

            if (multiplyAnswer.equals(multiplyResult)) {
                System.out.println("Правильно!");
                break MULTIPLY_BLOCK_CODE;
            }
        }

    }

}
