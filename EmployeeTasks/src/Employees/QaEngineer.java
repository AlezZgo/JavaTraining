package Employees;

import Tasks.Task;
import Tasks.TestingTask;

public class QaEngineer extends Employee {

    @Override
    public <T extends Task> void doWork(T task) {
        System.out.println(task instanceof TestingTask ? "test code" : "does`t know how to do it");
    }
}
