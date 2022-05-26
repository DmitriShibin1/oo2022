public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Dmitri", "Shibin", "", "10.09.2001");
        Employee e1 = new Employee(p1, 1, 1);
        Chief c1 = new Chief();
        c1.setBonus(e1, 500.0);
        e1.breakRoomAccessTimes();
        System.out.println(e1.getBonus());
    }
}