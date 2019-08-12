package it.frigir.mb2gspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public Map<String, Object> getIndex() {
        Map<String, Object> retVal = new HashMap<>();
        retVal.put("hello", "Hello World");
        return retVal;
    }
}
