package Employees;

import Tasks.CodingTask;
import Tasks.Task;

public class SoftwareEngineer extends Employee{

    @Override
    public <T extends Task> void doWork(T task) {
            System.out.println(task instanceof CodingTask ? "writing code" : "does`t know how to do it");
    }
}
