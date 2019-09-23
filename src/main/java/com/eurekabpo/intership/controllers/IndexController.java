package com.eurekabpo.intership.controllers;

import com.eurekabpo.intership.config.BeanConfiguration;
import com.eurekabpo.intership.services.MemoryService;
import com.eurekabpo.intership.services.NameService;
import com.eurekabpo.intership.services.TaskEntityService;
import com.eurekabpo.intership.services.TimeService;
import com.eurekabpo.intership.services.implementations.TaskServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView getDefault(ModelMap modelMap)
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        MemoryService memoryService = applicationContext.getBean(MemoryService.class);
        TimeService timeService = applicationContext.getBean(TimeService.class);
        NameService nameService = applicationContext.getBean(NameService.class);
        TaskEntityService taskEntityService = applicationContext.getBean(TaskEntityService.class);

        modelMap.addAttribute("time", timeService.getCurrTime());
        modelMap.addAttribute("date", timeService.getCurrDate());

        modelMap.addAttribute("allMem", memoryService.getAllMemory());
        modelMap.addAttribute("freeMem", memoryService.getFreeMemory());

        modelMap.addAttribute("name",nameService.getComputerName());

        ModelAndView result = new ModelAndView("index",modelMap);
        return result;
    }
}
