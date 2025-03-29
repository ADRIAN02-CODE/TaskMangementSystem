package CourseWork;

public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        TaskQueue taskQueue = new TaskQueue(); // Using plain Queue
        TaskStack taskStack = new TaskStack();

        // Create tasks
        Task task1 = new Task(1, "Amma said to buy coconut", "High");
        Task task2 = new Task(2, "Have to go to Keels", "Medium");
        Task task3 = new Task(3, "Going to church", "Low");

        // Add tasks to LinkedList and Queue
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);
        taskQueue.addTask(task1);
        taskQueue.addTask(task2);
        taskQueue.addTask(task3);

        // Display all tasks
        System.out.println("All Tasks:");
        taskList.displayTasks();

        // Process tasks from the queue
        System.out.println("\nProcessing Tasks (FIFO):");
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.processTask();
            if (task != null) {
                task.markCompleted();
                System.out.println("Processed: " + task);
                taskStack.push(task); // Add to stack for undo
            }
        }

        // Undo last action
        System.out.println("\nUndo last action:");
        Task undoneTask = taskStack.pop();
        if (undoneTask != null) {
            System.out.println("Undoing: " + undoneTask);
            taskList.removeTask(undoneTask.id);
        } else {
            System.out.println("Nothing to undo.");
        }

        // Display remaining tasks
        System.out.println("\nRemaining Tasks:");
        taskList.displayTasks();
    }
}