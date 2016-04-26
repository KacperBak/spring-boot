package de.kacperbak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bakka on 26.04.16.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private Hello hello;

    @RequestMapping(method= RequestMethod.GET)
    public String hello() {
        return hello.toString();
    }

}
