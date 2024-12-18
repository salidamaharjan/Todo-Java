package todoApp;

import java.io.File;
import java.io.IOException;

public class CreateTodoListFile {

    public void createTodoListFile () {
        try {
            File todoList = new File("todoList.txt");
            if (todoList.createNewFile()) {
                System.out.println();
                System.out.println("File created: " + todoList.getName());
                System.out.println();
            } else {
                System.out.println();
                System.out.println("File already exists.");
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }
}
