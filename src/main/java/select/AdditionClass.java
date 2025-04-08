package select;

import menu.MainApp;

import java.util.InputMismatchException;

public class AdditionClass extends MainActionClass {


    boolean additionNumberLoop = false;
    boolean additionNumberLoopCheckCorrect = false;

    public void isPlus() {
        try {
            while (!additionNumberLoop) {
                int plusResult;

                firstNumber = random.nextInt(NUMBER);
                secondNumber = random.nextInt(NUMBER);
                plusResult = actionPlus(firstNumber, secondNumber);

                // Проверка генерации сумм, нужно чтобы было меньше или равно 10
                if (plusResult <= NUMBER) {
                    System.out.printf("%d + %d = ", firstNumber, secondNumber);
                    plusAnswer = console.nextInt();
                } else {
                    continue;
                }

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

    public void checkCorrectAnswerAfterMistakes(int plusResult) {
        //Метод проверки правильности решения примера
        BLOCK_CODE:
        while (!additionNumberLoopCheckCorrect) {
            System.out.println("Неправильно, попробуй еще раз: ");
            System.out.printf("%d + %d = ", firstNumber, secondNumber);
            plusAnswer = console.nextInt();

            if (plusAnswer.equals(plusResult)) {
                System.out.println("Правильно!");
                break BLOCK_CODE;
            }
        }
    }


}


