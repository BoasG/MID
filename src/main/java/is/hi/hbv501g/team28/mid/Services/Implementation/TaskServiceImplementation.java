package is.hi.hbv501g.team28.mid.Services.Implementation;

import is.hi.hbv501g.team28.mid.Persistence.Entities.Task;
import is.hi.hbv501g.team28.mid.Persistence.Entities.User;
import is.hi.hbv501g.team28.mid.Services.TaskService;
import is.hi.hbv501g.team28.mid.util.TaskCategory;
import is.hi.hbv501g.team28.mid.util.TaskStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TaskServiceImplementation implements TaskService {
    //TODO: Replace with actual TaskRepository
    private List<Task> taskRepository = new ArrayList<>();
    //TODO: get rid of this
    private int id_counter = 0;

    //TODO: Get rid of dummy data
    @Autowired
    public TaskServiceImplementation() {
        //create 3 random tasks for our dummy repo. To be removed when jpa added.
        User user = new User();//Dummy User
        taskRepository.add(new Task("Clean Bathroom", false, new Date(), null, new Date(), TaskCategory.HOME, TaskStatus.NOT_STARTED, -1, user));
        taskRepository.add(new Task("Clean Sink", false, new Date(), null, new Date(), TaskCategory.HOME, TaskStatus.NOT_STARTED, 0, user));
        taskRepository.add(new Task("Do Math Homework", true, new Date(), null, new Date(), TaskCategory.SCHOOL, TaskStatus.STARTED, -1, user));
        //JPA gives each book an ID
        for (Task t: taskRepository) {
            t.setID(id_counter++);
        }
    }

    @Override
    public List<Task> findByUser(long userID) {
        //TODO:Implement proper function
        List<Task> tasks = new ArrayList<>();
        for (Task t: taskRepository) {
            if(t.getOwner().getID() == userID) {
                tasks.add(t);
            }
        }
        return tasks;
    }

    @Override
    public void save(Task task) {
        //TODO:Implement proper function
        task.setID(id_counter++);
        taskRepository.add(task);
    }

    @Override
    public void delete(Task task) {
        taskRepository.remove(task);
    }

    @Override
    public Task findByTaskID(long ID) {
        for(Task t: taskRepository) {
            if(t.getID() == ID) {
                return t;
            }
        }
        return null;
    }
}
