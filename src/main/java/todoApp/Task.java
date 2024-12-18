package todoApp;

public class Task {
    private int id;
    private String taskName;

    public Task() {
        id = 0;
        taskName = "";
    }
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

}
