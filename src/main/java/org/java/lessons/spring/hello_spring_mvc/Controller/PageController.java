package org.java.lessons.spring.hello_spring_mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/welcome")
    public String submitForm(@RequestParam String name, @RequestParam String lastName, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("lastName", lastName);
        return "welcome";
    }
}
