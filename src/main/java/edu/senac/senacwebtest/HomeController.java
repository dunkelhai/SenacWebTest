package edu.senac.senacwebtest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Olá, seja bem-vindo ao teste!");
        return "hello";
    }
}
