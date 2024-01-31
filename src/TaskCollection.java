/*
  Project Name : TaskManagerApp
  Student Name : Daniel Montenegro
  Student ID : 200549480
 */
import java.util.*;

public class TaskCollection {
    private ArrayList<Task> tasks;
    private HashMap<String, Task> taskById;
    private LinkedList<Task> orderOfAddition;

    public TaskCollection() {
        this.tasks = new ArrayList<>();
        this.taskById = new HashMap<>();
        this.orderOfAddition = new LinkedList<>();
    }

    // Add a task to the collection

    public void addTask(Task task) {
        tasks.add(task);
        taskById.put(task.getId(), task);
        orderOfAddition.add(task);

    }

    // Remove a task using its ID
    public void removeTaskById(String id) {
        Task task = taskById.get(id);
        if (task != null) {
            tasks.remove(task);
            orderOfAddition.remove(task);
            taskById.remove(id);
        }
    }

    // Fetch a task using its ID
    public Task getTaskById(String id) {
        return taskById.get(id);
    }

    // List all tasks
    public List<Task> getAllTasks() {
        return tasks;
    }

    // List tasks in the order they were added public

    List<Task> getTasksInOrderOfAddition() {
        return orderOfAddition;
    }

// add the function for listing the hashmap tasks
    HashMap<String, Task> getHashMapTasks(){
      return   taskById;
    }

}//end class TaskCollection
