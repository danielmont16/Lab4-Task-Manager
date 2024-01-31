/*
  Project Name : TaskManagerApp
  Student Name : Daniel Montenegro
  Student ID : 200549480
 */

import java.util.*;

public class TaskManagerApp {

    public static void main(String[] args) {
// Logic to:
        // 1. Prompt user for actions (add, remove, list, etc.)
        // 2. Gather input and create Task objects
        // 3. Add or remove tasks from TaskCollection
        // 4. Display tasks to the user

        // using a boolean variable to stop the program
        boolean flag = true;
        // creating the object userTaskCollection to pass on it the task add by the user
        TaskCollection userTaskCollection = new TaskCollection();
        Scanner input = new Scanner(System.in);

        //using while to stay in the main program
        while (flag) {
            //ask the user for one operation
            System.out.printf("Please write the number of the operation %n%s %n%s %n%s %n%s %n%s %n%s %n%s %n",
                    "1-add", "2-remove", "3-list", "4-Display task by id", "5-Display tasks in order of addition", "6-Hash map list", "QUIT to Exit");
            //passing the value to lowerCase
            String userOperation = input.next().toLowerCase();
            //using switch to evaluate according user selection
            switch (userOperation) {

                // case 1 . Prompt the user for information and add the task to taskCollection
                case "1":
                    input.nextLine();
                    System.out.println("enter id");
                    String taskId = input.nextLine();

                    System.out.println("enter task name");
                    String taskName = input.nextLine();

                    System.out.println("enter task description");
                    String taskDescription = input.nextLine();

                    Task userTask = new Task(taskId, taskName, taskDescription);

                    //user adding 'usertask' to taskCollection
                    userTaskCollection.addTask(userTask);
                    System.out.println("task added!");
                    System.out.println();
                    break;

                 // case 2. Remove a task by ID
                case "2":
                    System.out.println("Please enter the task ID that you want to remove");
                    input.nextLine();
                    String userTaskIdRemove = input.nextLine();
                    userTaskCollection.removeTaskById(userTaskIdRemove);
                    System.out.println("task was removed!");
                    System.out.println();
                    break;

                    //case 3. List the tasks userTaskCollection

                case "3":

                    //displaying the tasks inside userTaskCollection
                    List<Task> tasks = userTaskCollection.getAllTasks();

                    for (Task task : tasks) {
                        System.out.println(task.getId() + " - " + task.getName() + " - " + task.getDescription());
                    }
                    System.out.println();
                    break;

                    //case 4. fetching the task using the task ID

                case "4":
                    System.out.println("Please enter the task ID");
                    input.nextLine();
                    String userTaskId = input.nextLine();
                    Task foundTask = userTaskCollection.getTaskById(userTaskId);
                    System.out.println("ID: " + foundTask.getId());
                    System.out.println("Name: " + foundTask.getName());
                    System.out.println("Description: " + foundTask.getDescription());
                    System.out.println();
                    break;

                //case 5. fetching the tasks in order of addition
                case "5":
                    List<Task> tasksInOrderOfAddition = userTaskCollection.getTasksInOrderOfAddition();
                    for (Task task : tasksInOrderOfAddition) {
                        System.out.println(task.getId() + " - " + task.getName() + " - " + task.getDescription());
                    }
                    System.out.println();
                    break;

                //case 6. Displaying  the tasks using keySet to show the value and key
                case "6":
                    HashMap<String, Task> hashMapTasks = userTaskCollection.getHashMapTasks();
                    for (String key : hashMapTasks.keySet()) {
                        Task task = hashMapTasks.get(key);
                        System.out.println("ID: " + task.getId() + " name: " + task.getName() + ", description=" + task.getDescription());
                    }
                    System.out.println();
                    break;

                //case quit. Stop the execution of the program
                case "quit":
                    flag = false;
                    break;

                //default. In case of a wrong selection the following message will appear
                default:
                    System.out.println("wrong Selection, please, try again");
                    break;

            }
            
        }
        // closing Scanner
        input.close();

    }//end of main


}//end of class
