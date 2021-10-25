package is.hi.hbv501g.team28.mid.Persistence.Entities;

import java.util.List;

public class User {
    private long ID;
    String username;
    String password;
    String email;
    List<Task> tasks;

    public User() {
        //TODO: Remove this line
        this.ID  =  1;
    }

    public User(String username, String password, String email, List<Task> tasks) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.tasks = tasks;
    }

    public long getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
