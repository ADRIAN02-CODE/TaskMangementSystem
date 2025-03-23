package CourseWork;

import java.util.Comparator;
import java.util.PriorityQueue;

class TaskPriorityQueue {
    private PriorityQueue<Task> queue;

    public TaskPriorityQueue() {
        queue = new PriorityQueue<>(Comparator.comparing(t -> t.priority));
    }

    public void addTask(Task task) {
        queue.offer(task);
    }

    public Task processTask() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
