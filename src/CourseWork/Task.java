package CourseWork;

class Task {
    int id;
    String title;
    String priority; // low, medium, high
    boolean completed;

    public Task(int id, String title, String priority) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.completed = false;
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "[ID: " + id + ", Title: " + title + ", Priority: " + priority + ", Completed: " + completed + "]";
    }
}