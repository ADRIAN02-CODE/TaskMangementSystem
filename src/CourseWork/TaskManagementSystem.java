package CourseWork;

public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        TaskPriorityQueue taskQueue = new TaskPriorityQueue();
        TaskStack taskStack = new TaskStack();

        Task task1 = new Task(1, "Complete Assignment", "High");
        Task task2 = new Task(2, "Buy Groceries", "Medium");
        Task task3 = new Task(3, "Go for a Walk", "Low");

        // Adding tasks to LinkedList
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        // Adding tasks to Priority Queue
        taskQueue.addTask(task1);
        taskQueue.addTask(task2);
        taskQueue.addTask(task3);

        // Adding task to Stack for undo
        taskStack.push(task2);

        // Displaying tasks
        System.out.println("All Tasks:");
        taskList.displayTasks();

        // Processing tasks based on priority
        System.out.println("\nProcessing Tasks by Priority:");
        while (!taskQueue.isEmpty()) {
            System.out.println("Processing: " + taskQueue.processTask());
        }

        // Undo last action
        System.out.println("\nUndoing last action:");
        Task undoneTask = taskStack.pop();
        if (undoneTask != null) {
            System.out.println("Removed: " + undoneTask);
            taskList.removeTask(undoneTask.id);
        }

        // Display remaining tasks
        System.out.println("\nRemaining Tasks:");
        taskList.displayTasks();
    }
}
