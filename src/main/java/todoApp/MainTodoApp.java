package todoApp;

public class MainTodoApp {
    public static void main(String[] args) {
    AddEditDeleteTasks userChoice = new AddEditDeleteTasks();
        userChoice.ask();
    }
}