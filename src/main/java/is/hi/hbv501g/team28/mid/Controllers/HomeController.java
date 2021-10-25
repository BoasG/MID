package is.hi.hbv501g.team28.mid.Controllers;

import is.hi.hbv501g.team28.mid.Persistence.Entities.Task;
import is.hi.hbv501g.team28.mid.Services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.Console;

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

    @RequestMapping(value = "/addtask", method = RequestMethod.GET)
    public String addTaskForm(Task task){
        return "newtask";
    }

    @RequestMapping(value = "/addtask", method = RequestMethod.POST)
    public String addTask(Task task, BindingResult result, Model model){
        if(result.hasErrors()){
            return "newtask";
        }
        taskService.save(task);
        return "redirect:/";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteTask(@PathVariable("id") long id, Model model){
        Task taskToDelete = taskService.findByTaskID(id);
        taskService.delete(taskToDelete);
        return "redirect:/";
    }


}
