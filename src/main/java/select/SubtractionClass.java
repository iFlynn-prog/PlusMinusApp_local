package select;

import menu.MainApp;

import java.util.InputMismatchException;

public class SubtractionClass extends MainActionClass {

    boolean subtractionLoop = false;
    boolean subtractionLoopCheckCorrect = false;


    public void isMinus() {
        try {
        while (!subtractionLoop) {
            int minusResult;

            firstNumber = random.nextInt(NUMBER);
            secondNumber = random.nextInt(NUMBER);

            minusResult = actionMinus(firstNumber, secondNumber);
            minusAnswer = console.nextInt();

            if (minusAnswer.equals(minusResult)) {
                System.out.println("Правильно IF");
                isMinus();
            } else {
                BLOCK_CODE:
                while (!subtractionLoopCheckCorrect) {
                    System.out.print("Неверно, попробуй еще раз \n");
                    System.out.print("Введи правильный ответ: ");
                    minusAnswer = console.nextInt();
                    if (minusAnswer.equals(minusResult)) {
                        System.out.println("Правильно ELSE");
                        break BLOCK_CODE;
                    }
                }
            }
        }
        } catch (InputMismatchException e) {
            System.out.println("Блок ошибки на вычитании");
            subtractionLoop = true;
            MainApp.startMenu();
        }
    }
}





