public class Homework15 {
    public static void main(String[] args) {
        // Создаем объекты класса Person и вызываем метод personInfo() для каждого объекта
        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
        System.out.println(person1.personInfo());

        Person person2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println(person2.personInfo());

        Person person3 = new Person("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(person3.personInfo());
    }
}