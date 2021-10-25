package is.hi.hbv501g.team28.mid.Controllers;

import is.hi.hbv501g.team28.mid.Persistence.Entities.Task;
import is.hi.hbv501g.team28.mid.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//TODO: Deprecate this controller.

@Controller
public class HomeController {
    private TaskService taskService;

    @Autowired
    public HomeController(TaskService taskService){
        this.taskService = taskService;
    }

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("tasks", taskService.findByUser(1));
        return "home";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteTask(@PathVariable("id") long id, Model model){
        Task taskToDelete = taskService.findByTaskID(id);
        taskService.delete(taskToDelete);
        return "redirect:/";
    }

    @RequestMapping(value = "/addbook", method = RequestMethod.GET)
    public String addTaskForm(Task task){
        return "newTask";
    }
}
