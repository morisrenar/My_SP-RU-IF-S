package com.smnirjhor.dummycontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bmshamsnahid on 7/30/17.
 */
@RestController
public class DummyController {

    @RequestMapping("/global/Bitch")
    public String globalBitch() {
        return "global bitch";
    }

    @RequestMapping("/user/Bitch")
    public String userBitch() {
        return "user bitch";
    }

    @RequestMapping("/guest/Bitch")
    public String guestBitch() {
        return "guest bitch";
    }

    @RequestMapping("/admin/Bitch")
    public String adminBitch() {
        return "admin bitch";
    }

}
