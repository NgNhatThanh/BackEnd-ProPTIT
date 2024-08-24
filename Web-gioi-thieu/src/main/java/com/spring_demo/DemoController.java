package com.spring_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {

    @GetMapping("/intro")
    public String intro(Model model){
        model.addAttribute("user", new User("Nguyễn Nhật Thành",
                                                                    "ngthanh2004@gmail.com",
                                                                    19));
        return "intro";
    }

}
