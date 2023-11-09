import Person.Person;

public class HW020 {

    public static void main(String[] args) {
        Person user01 = new Person("Vasya", 13, 02, 1990, "mail01", 0505555555L, "Тестовий", 80.30, "120 на 60", 5000 );
        Person user02 = new Person("Test", 15, 04, 1995, "mail02", 0506676666L, "Ivanov", 100.50, "130 на 70", 10000 );
        Person user03 = new Person("Svitlana", 29, 12, 1987, "mail03", 0505555566L , "Petrova", 80.30, "110 на 80", 8000 );
        user01.printAccountInfo();
        user02.printAccountInfo();
        user03.printAccountInfo();

        user01.setSurname("Stepanov");
        user01.setWeight(90.50);
        user01.printAccountInfo();

        user02.setPressure("119 на 75");
        user02.setNumberOfSteps(15000);
        user02.printAccountInfo();





    }



}
