package io.pummelo.demos.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by PummeloDeveloper on 16/4/11.
 */
@Controller
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping("/my.html")
    public String my() {
        return "my.html";
    }
}
