package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ReceiveKeisanForm;

@Controller
@RequestMapping("/keisan")

public class KeisanController {
    @RequestMapping("/form")
    public String keisan() {
        return "keisan-form";
    }

    @RequestMapping("/calc")
    public String calculation(Model model, ReceiveKeisanForm form) {
        int x = Integer.parseInt(form.getX());
        int y = Integer.parseInt(form.getY());
        int total = 0;
        String calculation = form.getCalculation();
        if ("addition".equals(calculation)) {
            total = x + y;
        } else if ("subtraction".equals(calculation)) {
            total = x - y;
        } else if ("multiplication".equals(calculation)) {
            total = x * y;
        } else {
            total = x / y;
        }
        model.addAttribute("result", total);
        return "result";
    }

    @RequestMapping("/total")
    public String total() {
        return "total";
    }

}
