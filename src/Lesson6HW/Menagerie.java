package Lesson6HW;

import Lesson6HW.Animals.Pets;
import Lesson6HW.Animals.Cat;
import Lesson6HW.Animals.Dog;


public class Menagerie {
    public static void main(String[] args) {
        Cat Puss = new Cat (200, "Puss", 0);
        Dog Bim = new Dog (500, "Bim", 10);
        Cat Fluffy = new Cat (200, "Fluffy", 0 );
        Dog Barbos = new Dog (500, "Barbos", 10);

        System.out.println("****************************");

        Pets[] zoo = {Barbos, Fluffy, Bim, Puss};

        for (int i = 0; i < zoo.length; i++) {

            if (zoo[i] instanceof Pets) {
                 zoo[i].runDistance(205);
            }
            if (zoo[i] instanceof Pets) {
                 zoo[i].swimDistance(7);
            }
        }
    }
}
