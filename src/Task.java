/*
  Project Name : TaskManagerApp
  Student Name : Daniel Montenegro
  Student ID : 200549480
 */
public class Task {
    private String id;
    private String name;
    private String description;

    // Constructors, getters, setters, and other utility methods go here
    public Task(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

// getters

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // setters

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}//end class Task
