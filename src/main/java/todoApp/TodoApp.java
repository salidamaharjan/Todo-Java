package todoApp;

import java.util.List;
import java.util.Scanner;

public class TodoApp {

    TodoTasks todoTasks;

    public TodoApp() {
        todoTasks = new TodoTasks();
    }

    public void addTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add Task?('Y' for 'Yes' and 'N' for 'No': ");
        String userChoice = scanner.nextLine();
        System.out.println(userChoice);

        if (userChoice.equalsIgnoreCase("Y")) {
            System.out.println("Enter a task: ");
            String userTask = scanner.nextLine();
            todoTasks.setThingsTodo(userTask);
            List<String> listOfTasks = todoTasks.getThingsTodo();
            for (String task : listOfTasks) {
                System.out.print(task);
            }

        }
        scanner.close();
    }
}
