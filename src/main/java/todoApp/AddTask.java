package todoApp;

import java.util.List;
import java.util.Scanner;

public class AddTask {
    TodoTasks todoTasks;

    public AddTask() {
        todoTasks = new TodoTasks();
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a task: ");
        String userTask = scanner.nextLine();
        todoTasks.setThingsTodo(userTask);


        scanner.close();
    }
}
