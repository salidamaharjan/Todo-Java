package todoApp;

import java.util.List;

public class ViewTasks {
    TodoTasks todoLists ;
    public ViewTasks() {
        todoLists = new TodoTasks();
    }
    public void viewTasks() {
        List<String> listOfTasks = todoLists.getThingsTodo();
        for (String task : listOfTasks) {
            System.out.print(task);
        }
    }

}
