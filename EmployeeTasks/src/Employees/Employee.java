package Employees;
import Tasks.Task;

public abstract class Employee {

    public abstract <T extends Task> void doWork(T task);
}
