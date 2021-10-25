package is.hi.hbv501g.team28.mid.Services;

import is.hi.hbv501g.team28.mid.Persistence.Entities.Task;

public interface TaskService {
    public void save(Task task);
    public void delete(Task task);
    public Task findByTaskID(long ID);
    public <List> java.util.List<Task> findByUser(long userID);
    //TODO: findByFilter
    //TODO: change
}
