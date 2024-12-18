package todoApp;

import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class AddTask {
    private final Task task;
    public AddTask() {
        task = new Task();
    }
    public void addTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a task: ");

        String userTask = scanner.nextLine();
        task.setId(task.getId() + 1);
        task.setTaskName(userTask);
        try {
            FileWriter fileWriter = new FileWriter("todoList.txt", true);
            fileWriter.write(task.getId() + ". " + userTask + "\n");
            fileWriter.close();
            System.out.println();
            System.out.println("Task successfully wrote to the file.");
            System.out.println();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }

    }
}
