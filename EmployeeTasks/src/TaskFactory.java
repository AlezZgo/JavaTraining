import Employees.Designer;
import Employees.QaEngineer;
import Employees.SoftwareEngineer;
import Tasks.CodingTask;
import Tasks.DesigningTask;
import Tasks.Task;
import Tasks.TestingTask;

public class TaskFactory {

    public static void main(String[] args) {

        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        QaEngineer qaEngineer = new QaEngineer();
        Designer designer = new Designer();

        Task generatedTask = designer.generate() ;

        if(generatedTask instanceof  CodingTask) {
            softwareEngineer.doWork(generatedTask);
        }else if(generatedTask instanceof  DesigningTask){
            designer.doWork(generatedTask);
        }else if(generatedTask instanceof TestingTask){
            qaEngineer.doWork(generatedTask);
        }else{
            throw new IllegalArgumentException("illegal argument");
        }
    }
}
