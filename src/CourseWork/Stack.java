package CourseWork;

import java.util.Stack;

class TaskStack {                                    // I used stack because LIFO
    private Stack<Task> stack = new Stack<>();

    public void push(Task task) {                    //  it adds a task to the top of the stack
        stack.push(task);
    }

    public Task pop() {                              // it removes and returns the task from the top of the stack or it will be null if empty
        return stack.isEmpty() ? null : stack.pop();
    }
}