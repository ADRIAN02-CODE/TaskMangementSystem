package CourseWork;

import java.util.LinkedList;

class TaskLinkedList {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void addTask(Task task) {                           // this will adds a task to the list
        tasks.add(task);
    }

    public void removeTask(int id) {                          // this will removes a task by its ID which we do
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).id == id) {
                tasks.remove(i);
                break;
            }
        }
    }

    public void displayTasks() {                            // this will displays all tasks in the list which we add
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}