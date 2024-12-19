package todoApp;

public class MainTodoApp {
    public static void main(String[] args) {
        CreateTodoListFile file = new CreateTodoListFile();
        file.createTodoListFile();
        AddViewTasks userChoice = new AddViewTasks();
        userChoice.ask();
    }
}