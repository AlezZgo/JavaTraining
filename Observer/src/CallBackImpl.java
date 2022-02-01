public class CallBackImpl implements TaskProgressCallBack {

    private final TaskFactory taskFactory;

    public CallBackImpl(TaskFactory taskFactory) {
        this.taskFactory = taskFactory;
    }

    @Override
    public void updateTask(Task oldTask, Task newTask) {
        taskFactory.updateTasks(oldTask,newTask);
    }
}
