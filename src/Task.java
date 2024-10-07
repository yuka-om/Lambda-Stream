import java.time.LocalDate;

public class Task implements Comparable<Task> {
	private LocalDate date;
	private String task;
	private boolean done;

	public Task(LocalDate date, String task, boolean done) {
		this.date = date;
		this.task = task;
		this.done = done;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getTask() {
		return task;
	}

	public boolean isDone() {
		return done;
	}

	@Override
	public int compareTo(Task t) {
		return this.date.compareTo(t.date);
	}

	@Override
	public String toString() {
		return this.date + " " + this.task;
	}
}

