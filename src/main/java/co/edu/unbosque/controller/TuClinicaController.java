package co.edu.unbosque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TuClinicaController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/application/login")
    public String userlogin() {
        return "application/login";
    }

    @GetMapping("/application/signup")
    public String userSignup() {
        return "application/signup";
    }

    @GetMapping("/application/forgot")
    public String userForgotPwd() {
        return "application/forgot";
    }

    @GetMapping("/application/dashboard")
    public String userDashboard() {
        return "application/dashboard";
    }

    @GetMapping("/admin/login")
    public String adminLogin() {
        return "admin/login";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "admin/dashboard";
    }
}
