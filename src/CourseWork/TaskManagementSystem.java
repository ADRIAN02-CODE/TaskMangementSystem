package CourseWork;

public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        TaskQueue taskQueue = new TaskQueue(); // Using plain Queue
        TaskStack taskStack = new TaskStack();


        Task task1 = new Task(1, "Amma said to buy coconut", "High");    // this will create tasks with ID, title, priority in this order
        Task task2 = new Task(2, "Have to go to Keels", "Medium");
        Task task3 = new Task(3, "Going to church", "Low");


        taskList.addTask(task1);                                    // this will add tasks to both the list and queue
        taskList.addTask(task2);
        taskList.addTask(task3);
        taskQueue.addTask(task1);
        taskQueue.addTask(task2);
        taskQueue.addTask(task3);


        System.out.println("All Tasks:");                       // this will display all tasks in the list
        taskList.displayTasks();


        System.out.println("\nProcessing Tasks (FIFO):");
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.processTask();
            if (task != null) {
                task.markCompleted();
                System.out.println("Processed: " + task);
                taskStack.push(task);                               // this will use stack for undo
            }
        }


        System.out.println("\nUndo last action:");
        Task undoneTask = taskStack.pop();
        if (undoneTask != null) {
            System.out.println("Undoing: " + undoneTask);
            taskList.removeTask(undoneTask.id);
        } else {
            System.out.println("Nothing to undo.");
        }


        System.out.println("\nRemaining Tasks:");
        taskList.displayTasks();
    }
}