public class Homework15 {
    public static void main(String[] args) {
        Person person = new Person();

        String info1 = person.personInfo("Will", "Smith", "New York", "2936729462846");
        String info2 = person.personInfo("Jackie", "Chan", "Shanghai", "12312412412");
        String info3 = person.personInfo("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(info1);
        System.out.println(info2);
        System.out.println(info3);
    }
}