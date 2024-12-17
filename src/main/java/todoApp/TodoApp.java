package todoApp;

import java.util.List;
import java.util.Scanner;

public class TodoApp {
    Scanner scanner = new Scanner(System.in);

    private final AddTask addTask;
    private final ViewTasks viewTasks;

    public TodoApp() {
        addTask = new AddTask();
        viewTasks = new ViewTasks();
    }

    public void abc(int userNum) {
        if (userNum != 1 && userNum != 2 && userNum != 3 && userNum != 4) {
            System.out.print("Please enter 1 or 2 or 3 or 4: ");
            userNum = scanner.nextInt();
        }
        switch (userNum) {
            case 1:
                viewTasks.viewTasks();
                break;
            case 2:
                addTask.addTask();
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
