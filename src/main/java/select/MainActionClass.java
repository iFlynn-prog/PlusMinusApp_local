package select;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class MainActionClass {
    public Scanner console = new Scanner(System.in).useLocale(Locale.ENGLISH);
    //* useLocale(Locale.ENGLISH) <-- чтобы разделитель был точка в дробях
    Random random = new Random();

    final int NUMBER = 10;

    public int firstNumber;
    public int secondNumber;

    Integer plusAnswer;
    Integer minusAnswer;
    Integer multiplyAnswer;
    Double divideAnswer;

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

    public double actionDivide(double firstNumber, double secondNumber) {
        double result = 0;
        if (firstNumber % secondNumber ==  0) {
            result = firstNumber / secondNumber;
            return result;
        }
    }

    // if-else Expression функции вычитания
//    int actionMinusExpression = (firstNumber > secondNumber) ?
//            firstNumber - secondNumber
//            : secondNumber - firstNumber;
}
