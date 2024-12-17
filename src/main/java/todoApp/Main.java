package todoApp;

public class Main {
    public static void main(String[] args) {
        TodoApp todo = new TodoApp();
        AddEditDeleteTasks options= new AddEditDeleteTasks();
        int userNum = options.addEditDeleteTasks();
        todo.abc(userNum);
    }
}