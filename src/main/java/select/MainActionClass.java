package select;

import java.util.Random;
import java.util.Scanner;

public class MainActionClass {
    public Scanner console = new Scanner(System.in);
    Random random = new Random();

    final int NUMBER = 10;

    public int firstNumber;
    public int secondNumber;

    Integer plusAnswer;
    Integer minusAnswer;
    Integer multiplyAnswer;
    Integer divideAnswer;

    //Метод сложения
    public int actionPlus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    //Метод вычитания
    public int actionMinus(int firstNumber, int secondNumber) {
        int actionMinusResult;
        if (firstNumber >= secondNumber) {
            actionMinusResult = firstNumber - secondNumber;
            System.out.printf("%d - %d = ", firstNumber, secondNumber);
        } else {
            actionMinusResult = secondNumber - firstNumber;
            System.out.printf("%d - %d = ", secondNumber, firstNumber);
        }
        return actionMinusResult;
    }

    public int actionMultiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int actionDivide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    // if-else Expression функции вычитания
//    int actionMinusExpression = (firstNumber > secondNumber) ?
//            firstNumber - secondNumber
//            : secondNumber - firstNumber;
}
