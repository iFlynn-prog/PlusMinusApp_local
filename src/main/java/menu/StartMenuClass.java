package menu;

import select.AdditionClass;
import select.MainActionClass;
import select.SubtractionClass;

import java.util.InputMismatchException;

//public class StartMenuClass {
//    boolean startMenuLoop = false;
//
//    public void startMenu() {
//
//        AdditionClass addition = new AdditionClass();
//        SubtractionClass subtraction = new SubtractionClass();
//        int choice = 0;
//
//        while (!startMenuLoop) {
//            System.out.println("""
//                            Меню
//                    ====================
//                    1: Выберите сложение
//                    2: Выберите вычитание
//                    3: Выход""");
//
//            try {
//                choice = MainActionClass.console.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.println("Цифры в меню блеать");
//                break;
//            }
//            switch (choice) {
//                case 1:
//                    System.out.println("Примеры на сложение");
//                    addition.isPlus();
//                    break;
//                case 2:
//                    System.out.println("Примеры на вычитание");
//                    subtraction.isMinus();
//                    break;
//                case 3:
//                    System.out.println("До свидания");
//                    Runtime.getRuntime().exit(0);
//                    break;
//                default:
//                    System.out.println("Выберите пункт меню, числа от 1 до 3");
//                    break;
//            }
//        }
//    }
//}
