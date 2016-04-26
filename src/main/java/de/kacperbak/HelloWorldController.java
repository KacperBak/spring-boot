package de.kacperbak;

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
public class HelloWorldController {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss");

    @RequestMapping(method= RequestMethod.GET)
    public String sayHello() {
        String messageTemplate = "Hello world in time: %s";
        return String.format(messageTemplate, sdf.format(new Date()));
    }

}
