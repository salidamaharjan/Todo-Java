package todoApp;

import java.util.List;
import java.util.Scanner;

public class AddTask {
    private final TodoTasks todoTasks;
    AddEditDeleteTasks options;

    public AddTask() {
        todoTasks = new TodoTasks();
        options = new AddEditDeleteTasks();
    }

    public void addTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a task: ");
        String userTask = scanner.nextLine();
        todoTasks.setThingsTodo(userTask);
        List<String> listOfTasks = todoTasks.getThingsTodo();
        for (String task : listOfTasks) {
            System.out.println(task);
        }
        options.addEditDeleteTasks();

        scanner.close();
    }
}
