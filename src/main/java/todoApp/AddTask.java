package todoApp;

import java.util.List;
import java.util.Scanner;

public class AddTask {
    private final TodoTasks todoTasks;

    public AddTask() {
        todoTasks = new TodoTasks();
    }

    public void addTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a task: ");
        String userTask = scanner.nextLine();
        todoTasks.setThingsTodo(userTask);
        List<String> listOfTasks = todoTasks.getThingsTodo();
        System.out.println("Todo List");
        int i = 1;
        for (String task : listOfTasks) {
            System.out.println(i + ". " + task);
            i++;
        }
    }
}
