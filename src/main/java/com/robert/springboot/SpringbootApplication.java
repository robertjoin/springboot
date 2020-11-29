package com.robert.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Controller
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
    @RequestMapping(value = {"","/index"})
    public String index(Model model){
        model.addAttribute("msg","hello_springboot");
        return "index";

    }
}

