package CourseWork;

import java.util.LinkedList;
import java.util.Queue;

class TaskQueue {
    private Queue<Task> queue = new LinkedList<>();

    public void addTask(Task task) {                                // this will adds a task to the end of the queue
        queue.offer(task);
    }

    public Task processTask() {                                       // this will removes and returns the task at the front of the queue, or null if empty
        return queue.isEmpty() ? null : queue.poll(); 
    }

    public boolean isEmpty() {                                       // this will checks if the queue has any tasks
        return queue.isEmpty();
    }
}