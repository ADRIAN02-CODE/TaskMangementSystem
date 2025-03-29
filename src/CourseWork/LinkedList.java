package CourseWork;

import java.util.LinkedList;

class TaskLinkedList {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).id == id) {
                tasks.remove(i);
                break; // Exit after removing the first match
            }
        }
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}