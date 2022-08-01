package com.bull;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/simple")
    public String page(){
        return "html/simple";
    }

    @RequestMapping("/test")
    public String test(){
        return "html/tests/test";
    }
}
