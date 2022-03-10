package cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    @GetMapping("/greeting")
    public ModelAndView greeting(){
        return new ModelAndView("views/greeting");
    }

    @GetMapping("/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
