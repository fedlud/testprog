package com.fedlud.testprog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value="/health")
    public static String Welcome() {
        return "Компилится, значит работает :)";
    }
}
