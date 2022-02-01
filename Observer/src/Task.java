public class Task {

    private final int id;
    private final Status status;
    private final String description;
    private final String designLink;
    private final String testCase;
    private final String buildLink;

    public Task(int id, Status status, String description, String designLink, String testCase, String buildLink) {
        this.id = id;
        this.status = status;
        this.description = description;
        this.designLink = designLink;
        this.testCase = testCase;
        this.buildLink = buildLink;
    }

    public String getBuildLink() {
        return buildLink;
    }

    public String getTestCase() {
        return testCase;
    }

    public String getDesignLink() {
        return designLink;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    enum Status{
        ASSEMBLING_REQUIREMENTS,
        READY_TO_GO,
        READY_FOR_TESTING,
        DONE
    }

}
