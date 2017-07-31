package com.smnirjhor.dummycontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bmshamsnahid on 7/30/17.
 */
@RestController
public class DummyController {

    @RequestMapping("/globalBitch")
    public String globalBitch() {
        return "global bitch";
    }

    @RequestMapping("/userBitch")
    public String userBitch() {
        return "user bitch";
    }

    @RequestMapping("/adminBitch")
    public String adminBitch() {
        return "admin bitch";
    }

}
