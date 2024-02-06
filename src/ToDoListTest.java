import org.junit.Test;

import java.time.OffsetDateTime;

import static org.junit.Assert.*;

public class ToDoListTest {
    @Test
    public void isTaskInTwoDaysRangeFalse() {
        Task meetNina = new Task("Meet Nina", OffsetDateTime.parse("2024-02-08T16:30:00+01:00"), false);
        assertFalse(ToDoList.isTaskInTwoDaysRange(meetNina));
    }
    @Test
    public void isTaskInTwoDaysRangeTrue() {
        Task meetNina = new Task("Meet Nina", OffsetDateTime.parse("2024-02-08T16:30:00+01:00"), false);
        assertTrue(ToDoList.isTaskInTwoDaysRange(meetNina));
    }
    @Test
    public void addTaskToListPassed() {
        Task meetNina = new Task("Meet Nina", OffsetDateTime.parse("2024-02-08T16:30:00+01:00"), false);
        ToDoList toDoList = new ToDoList();
        toDoList.addTaskToList(meetNina);

        assertEquals(1, toDoList.getTaskArrayList().size());
    }
    @Test
    public void addTaskToListNotPassed() {
        Task meetNina = new Task("Meet Nina", OffsetDateTime.parse("2024-02-08T16:30:00+01:00"), false);
        ToDoList toDoList = new ToDoList();
        toDoList.addTaskToList(meetNina);

        assertEquals(0, toDoList.getTaskArrayList().size());
    }
}
