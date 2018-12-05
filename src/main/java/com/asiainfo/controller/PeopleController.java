package com.asiainfo.controller;

import com.asiainfo.domain.People;
import com.asiainfo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PeopleController
 * @Description TODO
 * @Author mazhen
 * @Date 2018/12/5 14:14
 * @Version 1.0
 **/
@RestController
@RequestMapping("/test/people")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @RequestMapping(value = "/getAllPeople" , method = RequestMethod.POST , produces = "application/json")
    public Object getAllPeople(People people) throws Exception {
        List<People> allPeople = peopleService.findAllPeople();
        Map<String,Object> map = new HashMap(16);
        map.put("data",allPeople);
        return map;
    }
}
