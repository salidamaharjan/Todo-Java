package todoApp;

import java.util.List;
import java.util.Scanner;

public class TodoApp {
    private final AddTask addTask;
    private final ViewTasks viewTasks;

    public TodoApp() {
        addTask = new AddTask();
        viewTasks = new ViewTasks();
    }

    public void addEditDeleteTasks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?: ");
        System.out.println("1. View Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Edit Task");
        System.out.println("4. Delete Task");
        System.out.print("Enter 1 or 2 or 3 or 4: ");
        int userNum = scanner.nextInt();
        if (userNum != 1 && userNum != 2 && userNum != 3 && userNum != 4) {
            System.out.print("Please enter 1 or 2 or 3 or 4: ");
            userNum =  scanner.nextInt();
        }
        switch (userNum) {
            case 1:
                viewTasks.viewTasks();
                break;
            case 2:
                addTask.add();
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
        }

    }
}
