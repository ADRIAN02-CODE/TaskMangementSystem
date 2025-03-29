package CourseWork;

import java.util.Stack;

class TaskStack {
    private Stack<Task> stack = new Stack<>();

    public void push(Task task) {
        stack.push(task);
    }

    public Task pop() {
        return stack.isEmpty() ? null : stack.pop();
    }
}