package is.hi.hbv501g.team28.mid.Persistence.Entities;

import is.hi.hbv501g.team28.mid.util.TaskCatergory;
import is.hi.hbv501g.team28.mid.util.TaskStatus;

import java.util.Date;

public class Task {
    private long ID;
    String name;
    Boolean priority;
    Date startDate;
    Date endDate;
    Date dueDate;
    Enum<TaskCatergory> catergory;
    Enum<TaskStatus> status;
    long motherTaskID;
    User owner;

    public Task() {
    }

    public Task(String name, Boolean priority, Date startDate, Date endDate, Date dueDate, Enum<TaskCatergory> catergory, Enum<TaskStatus> status, long motherTaskID, User owner) {
        this.name = name;
        this.priority = priority;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dueDate = dueDate;
        this.catergory = catergory;
        this.status = status;
        this.motherTaskID = motherTaskID;
        this.owner = owner;
    }

    public long getID() {
        return ID;
    }

    //TODO: Probably should remove the ID Setter
    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPriority() {
        return priority;
    }

    public void setPriority(Boolean priority) {
        this.priority = priority;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Enum<TaskCatergory> getCatergory() {
        return catergory;
    }

    public void setCatergory(Enum<TaskCatergory> catergory) {
        this.catergory = catergory;
    }

    public Enum<TaskStatus> getStatus() {
        return status;
    }

    public void setStatus(Enum<TaskStatus> status) {
        this.status = status;
    }

    public long getMotherTaskID() {
        return motherTaskID;
    }

    public void setMotherTaskID(long motherTaskID) {
        this.motherTaskID = motherTaskID;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
