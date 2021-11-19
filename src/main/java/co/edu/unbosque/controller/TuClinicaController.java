package co.edu.unbosque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TuClinicaController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}
