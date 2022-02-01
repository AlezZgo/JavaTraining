import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String[] args) {
        TaskFactory factory = new TaskFactory();
        List<Employee> employees = new ArrayList<>();

        TaskProgressCallBack callBack = new CallBackImpl(factory);

        employees.add(new Designer(callBack,"Alicia "));
        employees.add(new Programmer(callBack,"John "));
        employees.add(new Tester(callBack,"Steve "));
        factory.addEmployees(employees);

        factory.start();
    }

}
