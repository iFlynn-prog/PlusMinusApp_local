package menu;

import select.AdditionClass;
import select.DivideClass;
import select.MainActionClass;
import select.SubtractionClass;

import java.util.InputMismatchException;

public class MainApp {


    public static void main(String[] args) {
        startMenu();
    }

    public static void startMenu() {
        boolean startMenuLoop = false;
        AdditionClass addition = new AdditionClass();
        SubtractionClass subtraction = new SubtractionClass();
        MainActionClass mainAction = new MainActionClass();
        DivideClass divide = new DivideClass();


        int choice = 0;
        while (!startMenuLoop) {
            System.out.println("""
                            Меню
                    ====================
                    1: Выберите сложение
                    2: Выберите вычитание
                    3: Выберите умножение
                    4: Выберите деление
                    5: Выход
                    ====================""");

            try {
                System.out.print("Выберите пункт меню: ");
                choice = mainAction.console.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Примеры на сложение");
                        addition.isPlus();
                        startMenuLoop = true;
                        break;
                    case 2:
                        System.out.println("Примеры на вычитание");
                        subtraction.isMinus();
                        startMenuLoop = true;
                        break;
                    case 3:
                        System.out.println("Примеры на умножение");
                        System.out.println("В разработке");
                        startMenuLoop = true;
                        break;
                    case 4:
                        System.out.println("Примеры на деление");
                        divide.isDivide();
                        startMenuLoop = true;
                        break;
                    case 5:
                        System.out.println("До свидания");
                        Runtime.getRuntime().exit(0);
                        break;
                    default:
                        System.out.println("Выберите пункт меню, числа от 1 до 3");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Вводим только цифры");
                startMenuLoop = true;
            }
        }
    }
}
