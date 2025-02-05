package jpatrain.unicodejpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnicodeController {

    @GetMapping("/unicode/{i}")
    public String unicode(@PathVariable final int i) {
        char c = (char) i;
        return "unicode= " + i + " char= " + c;
    }

    @GetMapping("/char/{i}")
    public String charecter(@PathVariable final char i) {
        int in = (int)i;
        return "unicode= " + i + " char= " + in;
    }
}
