import java.time.OffsetDateTime;
import java.util.ArrayList;

public class ToDoList {
    private final ArrayList<Task> taskArrayList;

    public ToDoList() {
        this.taskArrayList = new ArrayList<>();
    }

    public ArrayList<Task> getTaskArrayList() {
        return taskArrayList;
    }

    public void addTaskToList(Task myTask) {
        taskArrayList.add(myTask);
    }


    public void removeTaskFromList(Task myTask) {
        taskArrayList.remove(myTask);
    }

    public void showTasks() {
        System.out.println("My list of tasks: ");
        for (Task task : taskArrayList) {
            task.printDetailsTask();
        }
    }

    public void setAndPrintCompletedTask() {
        for (Task task : taskArrayList) {
            task.setDone(true);
            System.out.println("Excellent! " + task.getDescription() + " done");
        }
    }

    public void showCompletedTasks() {
        System.out.println("List of completed tasks: ");
        for (Task task : taskArrayList) {
            if (task.getDone().equals(true)) {
                task.printDetailsTask();
            }
        }
    }
    public static Boolean isTaskInTwoDaysRange(Task task) {
        boolean isTaskInTwoDaysRange = false;
        if (task.getDeadline().equals(OffsetDateTime.now().plusDays(2))) {
            isTaskInTwoDaysRange = true;
        }
        return isTaskInTwoDaysRange;
    }
}


