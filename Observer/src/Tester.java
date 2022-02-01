public class Tester extends Employee{
    protected Tester(TaskProgressCallBack callBack, String name) {
        super(callBack, name,Task.Status.READY_FOR_TESTING);
    }

    @Override
    protected Task getTaskWhenDone(Task task) {
        return new Task(
                task.getId(),
                Task.Status.DONE,
                task.getDescription(),
                task.getDesignLink(),
                task.getTestCase(),
                getBuildLinkForTask()
        );
    }

    @Override
    protected String getDetails(Task task) {
        return "with id " + task.getId() + "https://bitbucket/project_id" + task.getTestCase();
    }

    private String getBuildLinkForTask(){
        return "https://buildLink.com";
    }
}