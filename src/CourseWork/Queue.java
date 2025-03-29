package CourseWork;

import java.util.LinkedList;
import java.util.Queue;

class TaskQueue {
    private Queue<Task> queue = new LinkedList<>();

    public void addTask(Task task) {
        queue.offer(task); // Add to the end (enqueue)
    }

    public Task processTask() {
        return queue.isEmpty() ? null : queue.poll(); // Remove from the front (dequeue)
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}