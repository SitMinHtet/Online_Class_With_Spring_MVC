package com.smh.classcourseonline.controller;

import com.smh.classcourseonline.services.ClassesService;
import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping("public")
@Data
public class PublicController {

	@Autowired
    private final ClassesService classesService;

    @GetMapping
    public String welcomePublic(ModelMap model){
        model.put("classes", classesService.getApplyClasses());
        return "views/public/home";
    }

    @GetMapping("showClasses/{id}")
    public String showClassesInfo(@PathVariable int id, ModelMap model){
        model.put("show", classesService.findById(id));
        return "views/public/classDetails";
    }

    @GetMapping("{id}/join")
    public String joinClass(@PathVariable int id, ModelMap model){
        return "views/public/joinClass";
    }
}
