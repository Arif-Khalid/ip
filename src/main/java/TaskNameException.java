public class TaskNameException extends Exception{
    TaskNameException(String taskName){
        super("OOPS!!! The description of a " + taskName + " cannot be empty.");
    }
}
