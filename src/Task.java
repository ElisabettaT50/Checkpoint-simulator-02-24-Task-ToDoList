import java.time.LocalTime;
import java.time.OffsetDateTime;

public class Task {
    private String description;
    private OffsetDateTime deadline;
    private Boolean isDone;

    public Task (String description, OffsetDateTime deadline, Boolean isDone) {
        this.description = description;
        this.deadline = deadline;
        this.isDone = isDone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OffsetDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(OffsetDateTime deadline) {
        this.deadline = deadline;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

   public void printDetailsTask() {
       System.out.println(description + "\n" + deadline + "\n" + "task completed: " + isDone);
   }
}

