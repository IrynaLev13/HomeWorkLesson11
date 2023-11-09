package Person;

public class Person {
    private String name;

    private int dayOfB;
    private int mounthOfB;
    private int yearOfB;
    private String mail;
    private long phone;
    private String surname;

    private double weight;
    private String pressure;
    private int numberOfSteps;

    public String getName() {
        return name;
    }

    public int getDayofB() {
        return dayOfB;
    }

    public int getMounthofB() {
        return mounthOfB;
    }

    public int getYearofB() {
        return yearOfB;
    }

    public String getMail() {
        return mail;
    }

    public long getPhone() {
        return phone;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public Person(String name, int dayOfB, int mounthOfB, int yearOfB, String mail, long phone, String surname, double weight, String pressure, int numberOfSteps) {
        this.name = name;
        this.dayOfB = dayOfB;
        this.mounthOfB = mounthOfB;
        this.yearOfB = yearOfB;
        this.mail = mail;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.numberOfSteps = numberOfSteps;
    }
    private int age;

    public int getAge() {
        return age;
    }

    public void printAccountInfo (){

        System.out.printf("User created succsesful: Name: %s; \t day of B: %s; \t mounth of B: %s; \t year of B: %s; \t mail: %s; \t phone: %s \t; surname: %s; \t weight: %s; \t pressure: %s \t; numberOfSteps: %s; \n", name, dayOfB, mounthOfB,yearOfB, mail, phone, surname, weight, pressure,numberOfSteps);
        int age = 2020 -yearOfB;
        System.out.println("Age of User: " + age);
    }






}
