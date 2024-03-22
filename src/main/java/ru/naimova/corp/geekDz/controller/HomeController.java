package ru.naimova.corp.geekDz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ru.naimova.corp.geekDz.service.*;

@Controller
public class HomeController {

    private final HomeService homeService;
    private final UserService userService;
    private final AdminService adminService;

    public HomeController(HomeService homeService, UserService userService, AdminService adminService) {
        this.homeService = homeService;
        this.userService = userService;
        this.adminService = adminService;
    }

    @GetMapping("/index")
    public String home(Model model) {
        model.addAttribute("text", homeService.getText());
        return "index";
    }

    @GetMapping("/")
    public String login() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String index() {
        return "redirect:/index";
    }

    @GetMapping("/public-data")
    public String user(Model model) {
        model.addAttribute("text", userService.getText());
        return "user";
    }

    @GetMapping("/private-data")
    public String admin(Model model) {
        model.addAttribute("text", adminService.getText());
        return "admin";
    }
}