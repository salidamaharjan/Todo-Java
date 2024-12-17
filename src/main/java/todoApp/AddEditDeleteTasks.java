package todoApp;

import java.util.Scanner;

public class AddEditDeleteTasks {
    public int addEditDeleteTasks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?: ");
        System.out.println("1. View Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Edit Task");
        System.out.println("4. Delete Task");
        System.out.print("Enter 1 or 2 or 3 or 4: ");
        return scanner.nextInt();
    }
}
