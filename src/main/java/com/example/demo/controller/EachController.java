package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/each")

public class EachController {
    @RequestMapping("")
    public String index(Model model) {
        List<String> itemList = new ArrayList<>();
        itemList.add("えんぴつ");
        itemList.add("消しゴム");
        itemList.add("ホチキス");

        model.addAttribute("itemList", itemList);

        return "each";

    }
}
