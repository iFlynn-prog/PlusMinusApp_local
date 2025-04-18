package select;

import menu.MainApp;

import java.util.InputMismatchException;

public class DivideClass extends MainActionClass {
    boolean divideNumberLoop = false;
    int divideResult;

    public void isDivide() {
        try {

            while (!divideNumberLoop) {

                firstNumber = random.nextInt(NUMBER);
                secondNumber = random.nextInt(NUMBER);

                divideResult = actionDivide(firstNumber, secondNumber);
                System.out.printf("%d / %d = ", firstNumber, secondNumber);
                divideAnswer = console.nextInt();

                if (divideAnswer.equals(divideResult)) {
                    System.out.println("Правильно!");

                } else {
                    checkCorrectAnswerAfterMistakes(divideAnswer);
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Недопустимый ввод, используем цифры");
            divideNumberLoop = true;
            MainApp.startMenu();
        }
    }

    public void checkCorrectAnswerAfterMistakes(Integer divideAnswer) {
        boolean divideCheckCorrect = false;
        DIVIDE_BLOCK_CODE:
        while (!divideCheckCorrect) {
            System.out.print("Неверно, попробуй еще раз \n");
            System.out.print("Введи правильный ответ: ");
            divideAnswer = console.nextInt();
            if (divideAnswer.equals(divideResult)) {
                System.out.println("Правильно ELSE");
                break DIVIDE_BLOCK_CODE;
            }
        }
    }
}

