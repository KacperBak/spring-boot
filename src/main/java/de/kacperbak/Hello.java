package de.kacperbak;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bakka on 26.04.16.
 */
public class Hello {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss");
    private String message;

    public Hello(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        String messageTemplate = "Hello %s in time: %s";
        return String.format(messageTemplate, getMessage(), sdf.format(new Date()));
    }
}
