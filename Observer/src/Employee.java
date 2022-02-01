public abstract class Employee implements Observer {

    private final TaskProgressCallBack callBack;
    private final String name;
    private final Task.Status taskStatus;

    protected Employee(TaskProgressCallBack callBack, String name, Task.Status taskStatus) {
        this.callBack = callBack;
        this.name = name;
        this.taskStatus = taskStatus;
    }

    @Override
    public void handleTask(Task task) {
        System.out.println(getClass().getSimpleName() + " " + name
         + "is doing task " + getDetails(task));
        callBack.updateTask(task,getTaskWhenDone(task));

    }

    public final boolean canBeObserverForColumn(Column column){
        return column.contains(taskStatus);
    }

    protected abstract Task getTaskWhenDone(Task task);

    protected abstract String getDetails(Task task);
}
