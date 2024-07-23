package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Car;

@Controller
@RequestMapping("/each-car")

public class EachController2 {
    @RequestMapping("")
    public String index(Model model) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car(100,"赤"));
        carList.add(new Car(80, "ブラック"));
        carList.add(new Car(120, "白"));

        model.addAttribute("carList", carList);

        return "each-car";

    }
}
