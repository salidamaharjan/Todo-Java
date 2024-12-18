package todoApp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class AddTask {
    private int id = 0;
    private String taskName;

    public int getId() {
        return this.id;
    }

    public String getTaskName(){
        return this.taskName;
    }

    public void setTaskName(String taskName){
        this.taskName = taskName;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void addTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a task: ");

        String userTask = scanner.nextLine();
        setId(getId() + 1);

        try {
            FileWriter fileWriter = new FileWriter("todoList.txt", true);
            fileWriter.write(userTask + "\n");
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
