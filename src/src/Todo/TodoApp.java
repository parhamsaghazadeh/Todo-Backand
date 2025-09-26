package Todo;

import java.util.ArrayList;

public class TodoApp {
    private int nextId;
    private ArrayList<Task> task;

    public TodoApp() {
        nextId = 1;
        task = new ArrayList();
    }

    public void addTask(String title) {
        Task newTask = new Task(nextId, title);
        task.add(newTask);
        nextId++;
        System.out.println("Todo.Task added: " + newTask);
    }

    public void listTasks() {
        if (task.isEmpty()) {
            System.out.println("No tasks found");
        } else {
            System.out.println("Tasks: ");
            task.forEach(System.out::println);
        }
    }

    public void markDone(int id) {
        Task task = findTaskById(id);
        if (task != null) {
            task.setDone(true);
            System.out.println("Todo.Task Marked: " + task);
        } else System.out.println("No task found with id: " + id);
    }

    public void removeTask(int id){
        Task task1 = findTaskById(id);
        if (task1 != null) {
            task.remove(task1);
            System.out.println("Todo.Task Removed: " + task1);
        }else System.out.println("No task found with id: " + id);
    }

    private Task findTaskById(int id) {
        for (Task task : task) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }
}
