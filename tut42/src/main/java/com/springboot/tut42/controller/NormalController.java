package com.springboot.tut42.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.*;

import java.beans.PropertyEditorSupport;
import java.util.Date;

@Controller
public class NormalController {

    @InitBinder
    protected void initBinder(DataBinder binder) {
        class TimePropertyEditor extends PropertyEditorSupport {
            @Override
            public void setAsText(String text) throws IllegalArgumentException {
                setValue(new Date(Integer.parseInt(text)));
            }
        }
        binder.registerCustomEditor(Date.class, "time", new TimePropertyEditor());
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    @ResponseBody
    public String getDetails(@RequestParam(name = "q") String query,
                             @RequestParam(name = "time", required = false) Date time) {
        return query + time;
    }
}
