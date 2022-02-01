public class Programmer extends Employee{
    protected Programmer(TaskProgressCallBack callBack, String name) {
        super(callBack, name,Task.Status.READY_TO_GO);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.READY_FOR_TESTING,
                task.getDescription(),
                task.getDesignLink(),
                task.getTestCase(),
                getBuildLinkForTask(task.getId())
        );
    }

    @Override
    protected String getDetails(Task task) {
        return null;
    }

    private String getBuildLinkForTask(int taskId){
        return "https://bitbucket/project_id" + taskId;
    }
}
