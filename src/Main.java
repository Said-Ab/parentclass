public class Main {
    public static void main(String[] args) {
        University university1 = new University();
        university1.setName("Harvard");
        university1.setLocation("USA");
        university1.setYearOfFoundation(1636);

        University university2 = new University();
        university2.setName("MIT");
        university2.setLocation("USA");
        university2.setYearOfFoundation(1861);

        University university3 = new University();
        university3.setName("Oxford");
        university3.setLocation("UK");
        university3.setYearOfFoundation(1096);


        School school1 = new School();
        school1.setIdOfSchool(67);
        school1.setAddress("Bokonbaeva 122");
        school1.setStudentCount(650);

        School school2 = new School();
        school2.setIdOfSchool(95);
        school2.setAddress("Tinalieva 99");
        school2.setStudentCount(500);

        School school3 = new School();
        school3.setIdOfSchool(12);
        school3.setAddress("sovietskaya");
        school3.setStudentCount(1232);


        Car car1 = new Car();
        car1.setModel("Toyota Land Cruiser");
        car1.setYear(2016);
        car1.setHorsePower(550);

        Car car2 = new Car();
        car2.setModel("Mercedes e63");
        car2.setYear(2020);
        car2.setHorsePower(700);

        Car car3=new Car();
        car3.setModel("Toyota 4 runner");
        car3.setYear(1999);
        car3.setHorsePower(660);


        Person person1 = new Person();
        person1.setName("Said");
        person1.setAge(16);
        person1.setJob("Programmer");

        Person person2 = new Person();
        person2.setName("Dias");
        person2.setAge(22);
        person2.setJob("Pilot");

        Person person3 = new Person();
        person3.setName("Enes");
        person3.setAge(20);
        person3.setJob("Trader");
        System.out.println("Universities");
        System.out.println(university1);
        System.out.println(university2);
        System.out.println(university3);
        System.out.println("Schools");
        System.out.println(school1);
        System.out.println(school2);
        System.out.println(school3);
        System.out.println("Cars");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println("Persons");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);




















    }
}
