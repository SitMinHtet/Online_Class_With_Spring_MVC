package com.smh.classcourseonline.services;

import com.smh.classcourseonline.entity.OnlineClasses;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClassesService {


    public List<OnlineClasses> getApplyClasses() {
        return Arrays.asList(
                new OnlineClasses(),
                new OnlineClasses(),
                new OnlineClasses(),
                new OnlineClasses(),
                new OnlineClasses(),
                new OnlineClasses(),
                new OnlineClasses(),
                new OnlineClasses(),
                new OnlineClasses()
        );
    }


    public OnlineClasses findById(int id){
        return new OnlineClasses();
    }
}
