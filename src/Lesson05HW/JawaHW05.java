package Lesson05HW;

public class JawaHW05 {
    public static void main(String[] args) {

        employee mainEmployee = new employee("Бурлак", "Юрьевич",
                    "Андрей", "Инженер",
                    "fsdgg@mail.com ", 89112334, 75000, 54);

        employee[] workplace = {
                mainEmployee,
                new employee("Ктот ", "Ктотович",
                        "Андрей", "Джун",
                        "354нпв@mail.com ", 825675334, 55000, 24),
                new employee("Печкив", "Максимович",
                        "Виталий", "Техник",
                        "фыуwff@.com ", 89865534, 89000, 41),
                new employee("Фамилия", "Фамильевна",
                        "Имея", "Уборщик",
                        "1312536@.com ", 891123634, 25000, 32),
                new employee("Витик", "Анатольевич",
                        "Андрей", "Директор",
                        "fsdgg@mail.com ", 894667334, 75000, 19)
        };

        getAllPersonsOnWork(workplace);
        System.out.println("***************************");
        getOldPerson(workplace, 40);

        }
        private static void getOldPerson(employee[] workplace, int age) {
            for (int i = 0; i < workplace.length; i++)
                if (workplace[i].getAge() > age) {
                    System.out.println(workplace[i].getFullInfo());
                }
        }

        private static void getAllPersonsOnWork(employee[] workplace) {
            System.out.println("All person: ");
            for (int i = 0; i < workplace.length; i++)
                System.out.println((i + 1) + " " + workplace[i].getFullInfo());
        }
}

