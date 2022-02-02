package Lesson01HW;

import java.util.Random;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {

        int a = -30;
        int b = 16;

            if (a+b >= 0){
            System.out.println("Сумма положительная");
             }
            else {
            System.out.println("Сумма отрицательная");
             }
    }

    public static void printColor() {

        int value = 90;

            if (value <=0){
                System.out.println("Красный");
            }
            else if (value > 100){
                System.out.println("Зеленый");
            }
            else
            {
                System.out.println("Желтый");
            }


    }

    public static void compareNumbers() {

        int a = (int)(Math.random()*100);
        int b = (int)(Math.random()*100);

            if (a >= b){
            System.out.println("a("+a+")>=b("+b+")");
            }
            else if (a < b){
            System.out.println("a("+a+")<b("+b+")");
            }
    }

    }




