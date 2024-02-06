import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Task feedCat = new Task("Feed cat", OffsetDateTime.now(), true);
        Task shopping = new Task("Buy dinner", OffsetDateTime.parse("2024-02-05T18:30:00+01:00"), false);
        Task exerciseGuitar = new Task("Practice guitar", OffsetDateTime.parse("2024-04-05T20:30:00+01:00"), false);
        Task meetNina = new Task("Meet Nina", OffsetDateTime.parse("2024-02-08T16:30:00+01:00"), false);

        ToDoList toDoList = new ToDoList();

        toDoList.addTaskToList(feedCat);
        toDoList.addTaskToList(shopping);
        toDoList.addTaskToList(exerciseGuitar);
        toDoList.removeTaskFromList(feedCat);
        toDoList.addTaskToList(feedCat);
        toDoList.addTaskToList(meetNina);

        toDoList.showTasks();

        toDoList.setAndPrintCompletedTask();

        toDoList.showCompletedTasks();

        ToDoList.isTaskInTwoDaysRange(feedCat);
        ToDoList.isTaskInTwoDaysRange(shopping);
        ToDoList.isTaskInTwoDaysRange(exerciseGuitar);
        ToDoList.isTaskInTwoDaysRange(meetNina);
    }
}