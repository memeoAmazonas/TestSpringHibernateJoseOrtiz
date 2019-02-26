package com.spring.test.controller;

import com.spring.test.service.GeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/general")
public class GeneralController {

    @Autowired
    @Qualifier("generalServiceImpl")
    private GeneralService generalService;

    @GetMapping("/programacion")
    public ModelAndView viewSingleton(){
        ModelAndView modelAndView = new ModelAndView("programacion");
        modelAndView.addObject("value",generalService.createSingleton("Jose"));
        modelAndView.addObject("value2",generalService.createSingleton("Jose2"));
        modelAndView.addObject("duplicate", generalService.duplicate("aaavvveea1etyjngfffdcbhu"));
        modelAndView.addObject("duplicate2", generalService.duplicate("aaavvveea1etyjngfffdcbhucdfgmjl9uygc57"));
        modelAndView.addObject("str", generalService.reverse("Esto es una prueba de reverse"));
        modelAndView.addObject("str2", generalService.reverse("Se puede reversar cualquier string"));
        int[] test = { 5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5 };
        int[] test1 = { 5, 5, 6, 6, 45, 4,1,332,0, 5, 5, 4,1, 4,64, 6, 6, 51, 15, 17,9, 0 };

        modelAndView.addObject("order1", generalService.orderList(test));
        modelAndView.addObject("order2", generalService.orderList(test1));
        return modelAndView;
    }
    @GetMapping("/teoricas")
    public String viewTeoricas(){
        return "teoricas";
    }
    @GetMapping("/codigos")
    public String viewCodeProgramacion(){
        return "programacionCode";
    }

}
