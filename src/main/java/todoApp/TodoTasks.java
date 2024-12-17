package todoApp;

import java.util.ArrayList;
import java.util.List;

public class TodoTasks {
    private final List<String> tasksTodo;
    public TodoTasks () {
        tasksTodo = new ArrayList<>();
    }
    public List<String> getThingsTodo() {
        return this.tasksTodo;
    }

    public void setThingsTodo(String task) {
        this.tasksTodo.add(task);
    }

}
