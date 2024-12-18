package todoApp;

import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class AddTask {

    public void addTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a task: ");
        String userTask = scanner.nextLine();
        try {
            FileWriter fileWriter = new FileWriter("todoList.txt");
            fileWriter.write(userTask);
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());

        }

//        List<String> listOfTasks = todoTasks.getThingsTodo();
//        System.out.println("Todo List");
//        int i = 1;
//        for (String task : listOfTasks) {
//            System.out.println(i + ". " + task);
//            i++;
//        }
    }
}
