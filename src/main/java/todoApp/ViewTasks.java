package todoApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ViewTasks {

    public void viewTasks() {

        try {
            File fileWriter = new File("todoList.txt");
            Scanner scanner = new Scanner(fileWriter);
            System.out.println("Your Todo Tasks:");
            int i = 1;
            while (scanner.hasNextLine()) {
                String task = scanner.nextLine();
                System.out.println( i + ". " + task);
                i++;
            }
            System.out.println();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }

    }

}
