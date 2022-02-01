package Employees;

import Tasks.CodingTask;
import Tasks.DesigningTask;
import Tasks.Task;
import Tasks.TestingTask;

import java.util.Random;

public class Designer extends Employee implements TaskGenerator {

    @Override
    public <T extends Task> void doWork(T task) {
        System.out.println(task instanceof DesigningTask ? "do design" : "does`t know how to do it");
    }

    @Override
    public Task generate() {
        Random random = new Random();
        return switch (random.nextInt(3)) {
            case 0 -> new CodingTask();
            case 1 -> new DesigningTask();
            case 2 -> new TestingTask();
            default -> throw new IllegalArgumentException("illegal exception");
        };
    }
}
