import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        HumanResource hr = new HumanResource();
        Employee p = new Protector("1", "P_1");
        Employee ts = new TechnicalStaff("2", "TS_2");
        Employee r = new Receptionist("03", "AR_3");
//        Protector p1 = new Employee("11", "P11");
        hr.employees.add(p);
        hr.employees.add(r);
        hr.employees.add(ts);
        Collections.sort(hr.employees);
        for (Employee e: hr.employees ) {
            System.out.println(e.toString());
        }
    }
}
