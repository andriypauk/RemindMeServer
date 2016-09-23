package ua.andriypauk.remindme.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Andriy on 02.02.2016.
 */
@Controller
@RequestMapping("/remind")
public class RemindConroller {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getReminder( ModelMap modelMap){

        return "May reminder";
    }

}
