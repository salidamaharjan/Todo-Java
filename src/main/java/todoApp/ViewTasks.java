package todoApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ViewTasks {

    public void viewTasks() {

        try {
            File fileRead = new File("todoList.txt");
            Scanner scanner = new Scanner(fileRead);
            System.out.println("Your Todo Tasks:");
            while (scanner.hasNextLine()) {
                String userTask = scanner.nextLine();
                System.out.println(userTask);
            }
            System.out.println();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }

    }

}
