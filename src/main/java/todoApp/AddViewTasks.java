package todoApp;

import java.util.Scanner;

public class AddViewTasks {
    Scanner scanner = new Scanner(System.in);

    private final AddTask addTask;
    private final ViewTasks viewTasks;

    public AddViewTasks() {
        addTask = new AddTask();
        viewTasks = new ViewTasks();
    }

    public void ask() {
        int userNum = askToChoose();
        if (userNum == 5) {
            System.out.println("Exiting");
        } else {
            while (userNum != 5) {
                action(userNum);
                System.out.println("Press enter to continue: ");
                scanner.nextLine();
                userNum = askToChoose();
            }
        }
    }

    public int askToChoose() {

        System.out.println("What do you want to do?: ");
        System.out.println("1. View Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Exit");
        System.out.print("Enter 1 or 2 or 3: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return num;
    }

    public void action(int userNum) {

        if (userNum != 1 && userNum != 2 && userNum != 3) {
            System.out.print("Please enter 1 or 2 or 3: ");
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
                System.out.println("Exiting");
                break;
        }
    }
}
