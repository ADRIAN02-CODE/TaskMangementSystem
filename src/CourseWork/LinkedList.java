package CourseWork;

import java.util.LinkedList;

class TaskLinkedList {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int id) {
        tasks.removeIf(task -> task.id == id);
    }

    public Task searchTask(int id) {
        for (Task task : tasks) {
            if (task.id == id) return task;
        }
        return null;
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}