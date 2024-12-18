package todoApp;

import java.util.Scanner;

public class EditTask {
    private final ViewTasks viewTaskList;

    public EditTask() {
        viewTaskList = new ViewTasks();
    }

    public void showTasks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which task do you want to edit?: ");
        viewTaskList.viewTasks();
        System.out.print("Enter number as '1': ");
        int choosenNum = scanner.nextInt();
    }
}
