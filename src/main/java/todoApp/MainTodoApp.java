package todoApp;

public class MainTodoApp {
    public static void main(String[] args) {
        CreateTodoListFile file = new CreateTodoListFile();
        file.createTodoListFile();
        AddEditDeleteTasks userChoice = new AddEditDeleteTasks();
        userChoice.ask();
    }
}